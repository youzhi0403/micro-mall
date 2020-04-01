package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.CouponsClassificationRelationDao;
import com.youzhi.dao.CouponsDao;
import com.youzhi.dao.CouponsGoodRelationDao;
import com.youzhi.dto.CouponsParam;
import com.youzhi.dto.CouponsQueryParam;
import com.youzhi.dto.CouponsVo;
import com.youzhi.mapper.*;
import com.youzhi.model.*;
import com.youzhi.service.CouponsService;
import com.youzhi.util.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author youzhi
 * @date 2020/4/1 11:30
 */
@Service
public class CouponsServiceImpl implements CouponsService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CouponsServiceImpl.class);

    @Autowired
    private CouponsDao couponsDao;

    @Autowired
    private CouponsMapper couponsMapper;

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private ClassificationMapper classificationMapper;

    @Autowired
    private CouponsGoodRelationDao couponsGoodRelationDao;

    @Autowired
    private CouponsClassificationRelationDao couponsClassificationRelationDao;

    @Autowired
    private CouponsGoodRelationMapper couponsGoodRelationMapper;

    @Autowired
    private CouponsClassificationRelationMapper couponsClassificationRelationMapper;

    @Autowired
    private CouponsHistoryMapper couponsHistoryMapper;


    @Override
    public List<CouponsVo> listPage(CouponsQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return couponsDao.list(queryParam);
    }

    @Override
    @Transactional
    public int add(CouponsParam couponsParam) {
        Admin currentAdmin = SecurityUtils.getAdmin();
        Coupons coupons = new Coupons();
        BeanUtils.copyProperties(couponsParam,coupons);
        coupons.setCreateAdminId(currentAdmin.getId());
        coupons.setCreateTime(new Date());
        coupons.setUseCount(0);
        coupons.setReceiveCount(0);
        int count = couponsMapper.insertSelective(coupons);

        if(couponsParam.getCouponsGoodRelationList().size() > 0){
            List<CouponsGoodRelation> couponsGoodRelationList = couponsParam.getCouponsGoodRelationList();
            for(CouponsGoodRelation couponsGoodRelation:couponsGoodRelationList){
                Good good = goodMapper.selectByPrimaryKey(couponsGoodRelation.getGoodId());
                couponsGoodRelation.setCouponsId(coupons.getId())
                .setGoodName(good.getName())
                .setGoodNum(good.getGoodNumber())
                .setGoodId(good.getId());
            }
            couponsGoodRelationDao.addBatch(couponsGoodRelationList);
        }
        if(couponsParam.getCouponsClassificationRelationList().size() > 0){
            List<CouponsClassificationRelation> couponsClassificationRelationList = couponsParam.getCouponsClassificationRelationList();
            for(CouponsClassificationRelation couponsClassificationRelation:couponsClassificationRelationList){
                Classification classification = classificationMapper.selectByPrimaryKey(couponsClassificationRelation.getId());
                couponsClassificationRelation.setCouponsId(coupons.getId())
                        .setClassificationId(classification.getId())
                        .setClassificationName(classification.getName())
                        .setClassificationParentName(getParent(classification).getName());
            }
            couponsClassificationRelationDao.addBatch(couponsClassificationRelationList);
        }
        return count;
    }

    @Override
    @Transactional
    public int delete(Integer id) {
        int count = couponsMapper.deleteByPrimaryKey(id);
        CouponsGoodRelationExample couponsGoodRelationExample = new CouponsGoodRelationExample();
        couponsGoodRelationExample.createCriteria().andCouponsIdEqualTo(id);
        couponsGoodRelationMapper.deleteByExample(couponsGoodRelationExample);
        CouponsClassificationRelationExample couponsClassificationRelationExample = new CouponsClassificationRelationExample();
        couponsClassificationRelationExample.createCriteria().andCouponsIdEqualTo(id);
        couponsClassificationRelationMapper.deleteByExample(couponsClassificationRelationExample);
        CouponsHistoryExample couponsHistoryExample = new CouponsHistoryExample();
        couponsHistoryExample.createCriteria().andCouponsIdEqualTo(id);
        couponsHistoryMapper.deleteByExample(couponsHistoryExample);
        return count;
    }

    public Classification getParent(Classification classification){
        if(classification == null){
            return null;
        }
        if(classification.getParentId() == 0){
            return classification;
        }else{
            return classificationMapper.selectByPrimaryKey(classification.getParentId());
        }
    }
}
