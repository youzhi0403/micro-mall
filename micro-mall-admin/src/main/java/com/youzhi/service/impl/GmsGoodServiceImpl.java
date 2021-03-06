package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.GmsGoodDao;
import com.youzhi.dto.GmsGoodParam;
import com.youzhi.dto.GmsGoodQueryParam;
import com.youzhi.dto.GmsGoodVo;
import com.youzhi.mapper.GmsGoodClassificationRelationMapper;
import com.youzhi.mapper.GmsGoodMapper;
import com.youzhi.model.*;
import com.youzhi.service.GmsGoodService;
import com.youzhi.util.ExcelUtil;
import com.youzhi.util.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cwj
 * @date 2020/1/18 14:35
 * 商品管理Service实现类
 */
@Service
public class GmsGoodServiceImpl implements GmsGoodService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GmsGoodServiceImpl.class);

    @Autowired
    private GmsGoodMapper goodMapper;

    @Autowired
    private GmsGoodClassificationRelationMapper goodClassificationRelationMapper;

    @Autowired
    private GmsGoodDao goodDao;

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public int add(GmsGoodParam gmsGoodParam) {
        AmsAdmin currentAdmin = SecurityUtils.getAdmin();
        GmsGood good = new GmsGood();
        BeanUtils.copyProperties(gmsGoodParam,good);
        good.setCreateAdminId(currentAdmin.getId());
        good.setCreateTime(new Date());
        good.setUpdateAdminId(currentAdmin.getId());
        good.setUpdateTime(new Date());
        good.setDeleteStatus(0);
        int count = goodMapper.insertSelective(good);
        /*todo 批量插入*/
        gmsGoodParam.getClassificationList().stream().forEach(
                item -> {
                    GmsGoodClassificationRelation goodClassificationRelation = new GmsGoodClassificationRelation();
                    goodClassificationRelation.setGoodId(good.getId());
                    goodClassificationRelation.setClassificationId(item);
                    goodClassificationRelationMapper.insertSelective(goodClassificationRelation);
                }
        );
        return count;
    }

    @Override
    public List<GmsGoodVo> listPage(GmsGoodQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return goodDao.list(queryParam);
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public int update(Integer id, GmsGoodParam gmsGoodParam) {
        AmsAdmin currentAdmin = SecurityUtils.getAdmin();
        GmsGood good = new GmsGood();
        BeanUtils.copyProperties(gmsGoodParam,good);
        good.setId(id);
        good.setUpdateAdminId(currentAdmin.getId());
        good.setUpdateTime(new Date());
        //更新类别
        if(gmsGoodParam.getClassificationList() != null){
            GmsGoodClassificationRelationExample goodClassificationRelationExample = new GmsGoodClassificationRelationExample();
            goodClassificationRelationExample.createCriteria().andGoodIdEqualTo(id);
            goodClassificationRelationMapper.deleteByExample(goodClassificationRelationExample);
            gmsGoodParam.getClassificationList().stream().forEach(item -> {
                GmsGoodClassificationRelation goodClassificationRelation = new GmsGoodClassificationRelation();
                goodClassificationRelation.setGoodId(id);
                goodClassificationRelation.setClassificationId(item);
                goodClassificationRelationMapper.insertSelective(goodClassificationRelation);
            });
        }
        /*更新商品*/
        GmsGoodExample example = new GmsGoodExample();
        example.createCriteria().andIdEqualTo(id);
        return goodMapper.updateByExampleSelective(good,example);
    }

    @Override
    public int delete(Integer id) {
        return goodMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int importGoods(MultipartFile file) {
        AmsAdmin admin = SecurityUtils.getAdmin();
        int count = 0;
        try{
            List<GmsGood> goodList = new ArrayList<>();
            List<String[]> goods = ExcelUtil.readExcel(file,1,0);
            for(int i=0;i<goods.size();i++){
                String[] strings = goods.get(i);
                GmsGood good = new GmsGood().setName(strings[0])
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
                        .setCreateAdminId(admin.getId())
                        .setCreateTime(new Date())
                        .setUpdateAdminId(admin.getId())
                        .setUpdateTime(new Date())
                        .setDeleteStatus(0);
                goodList.add(good);
            }
            if(goodList.size() > 0){
                count = goodDao.addBatch(goodList);
            }else{
                count = 0;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public int addInventory(Integer id,Integer addNum) {
        GmsGood good = goodMapper.selectByPrimaryKey(id);
        if(good.getInventory() == null){
            good.setInventory(0);
        }
        return goodMapper.updateByPrimaryKeySelective(new GmsGood().setId(id).setInventory(good.getInventory() + addNum));
    }

    @Override
    public GmsGoodVo detail(Integer id) {
        GmsGoodVo gmsGoodVo = goodDao.detail(id);
        List<Integer> classificationIds = new ArrayList<>();
        List<Integer> classificationNormalIds = new ArrayList<>();
        List<Integer> classificationBodyIds = new ArrayList<>();
        List<Integer> classificationDepartmentIds = new ArrayList<>();
        if(gmsGoodVo.getClassificationList() != null){
            classificationIds = gmsGoodVo.getClassificationList().stream().map(item -> item.getId()).collect(Collectors.toList());
            classificationNormalIds = gmsGoodVo.getClassificationList().stream().filter(item -> item.getKind() == 0).map(item -> item.getId()).collect(Collectors.toList());
            classificationBodyIds = gmsGoodVo.getClassificationList().stream().filter(item -> item.getKind() == 1).map(item -> item.getId()).collect(Collectors.toList());
            classificationDepartmentIds = gmsGoodVo.getClassificationList().stream().filter(item -> item.getKind() == 2).map(item -> item.getId()).collect(Collectors.toList());
        }
        gmsGoodVo.setClassificationIds(classificationIds);
        gmsGoodVo.setClassificationNormalIds(classificationNormalIds);
        gmsGoodVo.setClassificationBodyIds(classificationBodyIds);
        gmsGoodVo.setClassificationDepartmentIds(classificationDepartmentIds);
        return gmsGoodVo;
    }

    @Override
    public List<GmsGood> getList(String keyword) {
        GmsGoodExample goodExample = new GmsGoodExample();
        goodExample.createCriteria().andNameLike("%" + keyword + "%");
        return goodMapper.selectByExample(goodExample);
    }
}
