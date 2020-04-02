package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.GmsClassificationDao;
import com.youzhi.dto.GmsClassificationParam;
import com.youzhi.dto.GmsClassificationQueryParam;
import com.youzhi.mapper.GmsClassificationMapper;
import com.youzhi.mapper.GmsGoodClassificationRelationMapper;
import com.youzhi.model.AmsAdmin;
import com.youzhi.model.GmsClassification;
import com.youzhi.model.GmsClassificationExample;
import com.youzhi.model.GmsGoodClassificationRelationExample;
import com.youzhi.service.GmsClassificationService;
import com.youzhi.util.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/24 13:51
 */
@Service
public class GmsClassificationServiceImpl implements GmsClassificationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GmsClassificationServiceImpl.class);

    @Autowired
    private GmsClassificationDao classificationDao;

    @Autowired
    private GmsClassificationMapper classificationMapper;

    @Autowired
    private GmsGoodClassificationRelationMapper classificationRelationMapper;

    @Override
    public List<GmsClassification> listPage(GmsClassificationQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return classificationDao.list(queryParam);
    }

    @Override
    public int add(GmsClassificationParam gmsClassificationParam) {
        GmsClassification classification = new GmsClassification();
        BeanUtils.copyProperties(gmsClassificationParam,classification);
        classification = setClassificationProperty(classification);
        int count = classificationMapper.insertSelective(classification);
        return count;
    }

    @Override
    public int update(Integer id, GmsClassificationParam gmsClassificationParam) {
        GmsClassification classification = new GmsClassification();
        BeanUtils.copyProperties(gmsClassificationParam,classification);
        classification = setClassificationProperty(classification);
        GmsClassificationExample updateExample = new GmsClassificationExample();
        updateExample.createCriteria().andIdEqualTo(id);
        return classificationMapper.updateByExampleSelective(classification,updateExample);
    }

    @Override
    public int delete(Integer id) {
        GmsGoodClassificationRelationExample classificationRelationExample = new GmsGoodClassificationRelationExample();
        classificationRelationExample.createCriteria().andClassificationIdEqualTo(id);
        classificationRelationMapper.deleteByExample(classificationRelationExample);
        return classificationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<GmsClassification> getList(Integer kind) {
        return classificationDao.getList(kind);
    }

    public GmsClassification setClassificationProperty(GmsClassification classification){
        AmsAdmin currentAdmin = SecurityUtils.getAdmin();
        classification.setCreateAdminId(currentAdmin.getId());
        classification.setCreateTime(new Date());
        classification.setUpdateAdminId(currentAdmin.getId());
        classification.setUpdateTime(new Date());
        GmsClassificationExample classificationExample = new GmsClassificationExample();
        classificationExample.createCriteria().andIdEqualTo(classification.getParentId());
        List<GmsClassification> classificationList = classificationMapper.selectByExample(classificationExample);
        if(classificationList.size() > 0){
            classification.setLevel(classificationList.get(0).getLevel() + 1);
        }else{
            classification.setLevel(0);
        }
        return classification;
    }
}
