package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.AmsRolePermissionRelationDao;
import com.youzhi.dto.AmsRoleParam;
import com.youzhi.mapper.AmsRoleMapper;
import com.youzhi.mapper.AmsRolePermissionRelationMapper;
import com.youzhi.model.*;
import com.youzhi.service.AmsRoleService;
import com.youzhi.util.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 14:06
 */
@Service
public class AmsRoleServiceImpl implements AmsRoleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AmsRoleServiceImpl.class);

    @Autowired
    private AmsRoleMapper roleMapper;

    @Autowired
    private AmsRolePermissionRelationDao rolePermissionRelationDao;

    @Autowired
    private AmsRolePermissionRelationMapper rolePermissionRelationMapper;

    @Override
    public int add(AmsRoleParam amsRoleParam) {
        AmsAdmin currentAdmin = SecurityUtils.getAdmin();
        AmsRole role = new AmsRole();
        BeanUtils.copyProperties(amsRoleParam,role);
        role.setCreateAdminId(currentAdmin.getId());
        role.setCreateTime(new Date());
        int count = roleMapper.insertSelective(role);
        return count;
    }

    @Override
    public int update(Integer id, AmsRoleParam amsRoleParam) {
        AmsAdmin currentAdmin = SecurityUtils.getAdmin();
        AmsRole role = new AmsRole();
        BeanUtils.copyProperties(amsRoleParam,role);
        role.setUpdateAdminId(currentAdmin.getId());
        role.setUpdateTime(new Date());
        AmsRoleExample example = new AmsRoleExample();
        example.createCriteria().andIdEqualTo(id);
        return roleMapper.updateByExampleSelective(role,example);
    }

    @Override
    public int deleteBatch(List<Integer> ids) {
        AmsRoleExample example = new AmsRoleExample();
        example.createCriteria().andIdIn(ids);
        return roleMapper.deleteByExample(example);
    }

    @Override
    public List<AmsPermission> getPermissionList(Integer roleId) {
        return rolePermissionRelationDao.getPermissionList(roleId);
    }

    @Override
    public int updatePermission(Integer roleId, List<Integer> permissionIds) {
        //先删除原有关系
        AmsRolePermissionRelationExample example=new AmsRolePermissionRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        rolePermissionRelationMapper.deleteByExample(example);
        //批量插入新关系
        List<AmsRolePermissionRelation> relationList = new ArrayList<>();
        for (Integer permissionId : permissionIds) {
            AmsRolePermissionRelation relation = new AmsRolePermissionRelation();
            relation.setRoleId(roleId);
            relation.setPermissionId(permissionId);
            relationList.add(relation);
        }
        return rolePermissionRelationDao.addBatch(relationList);
    }

    @Override
    public List<AmsRole> listPage(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return roleMapper.selectByExample(new AmsRoleExample());
    }

    @Override
    public List<AmsRole> getList() {
        return roleMapper.selectByExample(new AmsRoleExample());
    }
}
