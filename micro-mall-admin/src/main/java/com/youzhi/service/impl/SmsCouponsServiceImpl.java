package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.SmsCouponsClassificationRelationDao;
import com.youzhi.dao.SmsCouponsDao;
import com.youzhi.dao.SmsCouponsGoodRelationDao;
import com.youzhi.dto.SmsCouponsParam;
import com.youzhi.dto.SmsCouponsQueryParam;
import com.youzhi.dto.SmsCouponsVo;
import com.youzhi.mapper.*;
import com.youzhi.model.*;
import com.youzhi.service.SmsCouponsService;
import com.youzhi.util.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:30
 */
@Service
public class SmsCouponsServiceImpl implements SmsCouponsService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SmsCouponsServiceImpl.class);

    @Autowired
    private SmsCouponsDao couponsDao;

    @Autowired
    private SmsCouponsMapper couponsMapper;

    @Autowired
    private GmsGoodMapper goodMapper;

    @Autowired
    private GmsClassificationMapper classificationMapper;

    @Autowired
    private SmsCouponsGoodRelationDao couponsGoodRelationDao;

    @Autowired
    private SmsCouponsClassificationRelationDao couponsClassificationRelationDao;

    @Autowired
    private SmsCouponsGoodRelationMapper couponsGoodRelationMapper;

    @Autowired
    private SmsCouponsClassificationRelationMapper couponsClassificationRelationMapper;

    @Autowired
    private SmsCouponsHistoryMapper couponsHistoryMapper;


    @Override
    public List<SmsCouponsVo> listPage(SmsCouponsQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return couponsDao.list(queryParam);
    }

    @Override
    @Transactional
    public int add(SmsCouponsParam smsCouponsParam) {
        AmsAdmin currentAdmin = SecurityUtils.getAdmin();
        SmsCoupons coupons = new SmsCoupons();
        BeanUtils.copyProperties(smsCouponsParam,coupons);
        coupons.setCreateAdminId(currentAdmin.getId());
        coupons.setCreateTime(new Date());
        coupons.setUseCount(0);
        coupons.setReceiveCount(0);
        int count = couponsMapper.insertSelective(coupons);

        if(smsCouponsParam.getCouponsGoodRelationList().size() > 0){
            List<SmsCouponsGoodRelation> couponsGoodRelationList = smsCouponsParam.getCouponsGoodRelationList();
            for(SmsCouponsGoodRelation couponsGoodRelation:couponsGoodRelationList){
                GmsGood good = goodMapper.selectByPrimaryKey(couponsGoodRelation.getGoodId());
                couponsGoodRelation.setCouponsId(coupons.getId())
                .setGoodName(good.getName())
                .setGoodNum(good.getGoodNumber())
                .setGoodId(good.getId());
            }
            couponsGoodRelationDao.addBatch(couponsGoodRelationList);
        }
        if(smsCouponsParam.getCouponsClassificationRelationList().size() > 0){
            List<SmsCouponsClassificationRelation> couponsClassificationRelationList = smsCouponsParam.getCouponsClassificationRelationList();
            for(SmsCouponsClassificationRelation couponsClassificationRelation:couponsClassificationRelationList){
                GmsClassification classification = classificationMapper.selectByPrimaryKey(couponsClassificationRelation.getId());
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
        SmsCouponsGoodRelationExample couponsGoodRelationExample = new SmsCouponsGoodRelationExample();
        couponsGoodRelationExample.createCriteria().andCouponsIdEqualTo(id);
        couponsGoodRelationMapper.deleteByExample(couponsGoodRelationExample);
        SmsCouponsClassificationRelationExample couponsClassificationRelationExample = new SmsCouponsClassificationRelationExample();
        couponsClassificationRelationExample.createCriteria().andCouponsIdEqualTo(id);
        couponsClassificationRelationMapper.deleteByExample(couponsClassificationRelationExample);
        SmsCouponsHistoryExample couponsHistoryExample = new SmsCouponsHistoryExample();
        couponsHistoryExample.createCriteria().andCouponsIdEqualTo(id);
        couponsHistoryMapper.deleteByExample(couponsHistoryExample);
        return count;
    }

    public GmsClassification getParent(GmsClassification classification){
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
