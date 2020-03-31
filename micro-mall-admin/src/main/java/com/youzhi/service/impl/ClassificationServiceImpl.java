package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.ClassificationDao;
import com.youzhi.dto.ClassificationParam;
import com.youzhi.dto.ClassificationQueryParam;
import com.youzhi.mapper.ClassificationMapper;
import com.youzhi.mapper.GoodClassificationRelationMapper;
import com.youzhi.model.*;
import com.youzhi.service.ClassificationService;
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
public class ClassificationServiceImpl implements ClassificationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClassificationServiceImpl.class);

    @Autowired
    private ClassificationDao classificationDao;

    @Autowired
    private ClassificationMapper classificationMapper;

    @Autowired
    private GoodClassificationRelationMapper classificationRelationMapper;

    @Override
    public List<Classification> listPage(ClassificationQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return classificationDao.list(queryParam);
    }

    @Override
    public int add(ClassificationParam classificationParam) {
        Classification classification = new Classification();
        BeanUtils.copyProperties(classificationParam,classification);
        classification = setClassificationProperty(classification);
        int count = classificationMapper.insertSelective(classification);
        return count;
    }

    @Override
    public int update(Integer id, ClassificationParam classificationParam) {
        Classification classification = new Classification();
        BeanUtils.copyProperties(classificationParam,classification);
        classification = setClassificationProperty(classification);
        ClassificationExample updateExample = new ClassificationExample();
        updateExample.createCriteria().andIdEqualTo(id);
        return classificationMapper.updateByExampleSelective(classification,updateExample);
    }

    @Override
    public int delete(Integer id) {
        GoodClassificationRelationExample classificationRelationExample = new GoodClassificationRelationExample();
        classificationRelationExample.createCriteria().andClassificationIdEqualTo(id);
        classificationRelationMapper.deleteByExample(classificationRelationExample);
        return classificationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Classification> getList(Integer kind) {
        return classificationDao.getList(kind);
    }

    public Classification setClassificationProperty(Classification classification){
        Admin currentAdmin = SecurityUtils.getAdmin();
        classification.setCreateAdminId(currentAdmin.getId());
        classification.setCreateTime(new Date());
        classification.setUpdateAdminId(currentAdmin.getId());
        classification.setUpdateTime(new Date());
        ClassificationExample classificationExample = new ClassificationExample();
        classificationExample.createCriteria().andIdEqualTo(classification.getParentId());
        List<Classification> classificationList = classificationMapper.selectByExample(classificationExample);
        if(classificationList.size() > 0){
            classification.setLevel(classificationList.get(0).getLevel() + 1);
        }else{
            classification.setLevel(0);
        }
        return classification;
    }
}
