package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.GoodDao;
import com.youzhi.dto.GoodParam;
import com.youzhi.dto.GoodQueryParam;
import com.youzhi.dto.GoodResult;
import com.youzhi.mapper.GoodClassificationRelationMapper;
import com.youzhi.mapper.GoodMapper;
import com.youzhi.model.Good;
import com.youzhi.model.GoodClassificationRelation;
import com.youzhi.model.GoodClassificationRelationExample;
import com.youzhi.model.GoodExample;
import com.youzhi.service.GoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 14:35
 * 商品管理Service实现类
 */
@Service
public class GoodServiceImpl implements GoodService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GoodServiceImpl.class);

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private GoodClassificationRelationMapper goodClassificationRelationMapper;

    @Autowired
    private GoodDao goodDao;

    @Override
    public int addGood(GoodParam goodParam) {
        Good good = new Good();
        BeanUtils.copyProperties(goodParam,good);
        good.setDeleteStatus(0);
        int count = goodMapper.insertSelective(good);
        goodParam.getClassificationList().stream().forEach(
                item -> {
                    GoodClassificationRelation goodClassificationRelation = new GoodClassificationRelation();
                    goodClassificationRelation.setGoodId(good.getId());
                    goodClassificationRelation.setClassificationId(item.getId());
                    goodClassificationRelationMapper.insertSelective(goodClassificationRelation);
                }
        );
        return count;
    }

    @Override
    public List<GoodResult> list(GoodQueryParam goodQueryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return goodDao.getList(goodQueryParam);
    }

    @Override
    public int updateGood(Integer id, GoodParam goodParam) {
        Good good = new Good();
        BeanUtils.copyProperties(goodParam,good);
        good.setId(id);
        //更新类别
        GoodClassificationRelationExample goodClassificationRelationExample = new GoodClassificationRelationExample();
        goodClassificationRelationExample.createCriteria().andGoodIdEqualTo(id);
        goodClassificationRelationMapper.deleteByExample(goodClassificationRelationExample);
        goodParam.getClassificationList().stream().forEach(item -> {
            GoodClassificationRelation goodClassificationRelation = new GoodClassificationRelation();
            goodClassificationRelation.setGoodId(id);
            goodClassificationRelation.setClassificationId(item.getId());
            goodClassificationRelationMapper.insertSelective(goodClassificationRelation);
        });
        /*更新商品*/
        GoodExample example = new GoodExample();
        example.createCriteria().andIdEqualTo(id);
        return goodMapper.updateByExampleSelective(good,example);
    }

    @Override
    public int deleteGood(Integer id) {
        return goodMapper.deleteByPrimaryKey(id);
    }
}