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
import com.youzhi.util.ExcelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.ArrayList;
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

    @Override
    public int importGoods(MultipartFile file) {
        int count = 0;
        try{
            List<Good> goodList = new ArrayList<>();
            List<String[]> goods = ExcelUtil.readExcel(file,1,0);
            for(int i=0;i<goods.size();i++){
                String[] strings = goods.get(i);
                Good good = new Good().setName(strings[0])
                        .setFullName(strings[1])
                        .setImgs(strings[2])
                        .setPrice(new BigDecimal(strings[3]))
                        .setGoodFunction(strings[4])
                        .setManufacturer(strings[5])
                        .setGoodNumber(strings[6])
                        .setGoodType(strings[7])
                        .setApprovalNumber(strings[8])
                        .setSpecification(strings[9])
                        .setGoodUsage(strings[10])
                        .setCommonName(strings[11])
                        .setUntowardEffect(strings[12])
                        .setTaboo(strings[13])
                        .setStatus(Integer.parseInt(strings[14]))
                        .setDeleteStatus(0);
                goodList.add(good);
            }
            count = goodDao.addBatch(goodList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }
}
