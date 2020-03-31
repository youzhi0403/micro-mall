package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.RoleDao;
import com.youzhi.dao.RolePermissionRelationDao;
import com.youzhi.dto.RoleParam;
import com.youzhi.mapper.RoleMapper;
import com.youzhi.mapper.RolePermissionRelationMapper;
import com.youzhi.model.*;
import com.youzhi.service.RoleService;
import com.youzhi.util.SecurityUtils;
import net.bytebuddy.asm.Advice;
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
public class RoleServiceImpl implements RoleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private RolePermissionRelationDao rolePermissionRelationDao;

    @Autowired
    private RolePermissionRelationMapper rolePermissionRelationMapper;

    @Override
    public int add(RoleParam roleParam) {
        Admin currentAdmin = SecurityUtils.getAdmin();
        Role role = new Role();
        BeanUtils.copyProperties(roleParam,role);
        role.setCreateAdminId(currentAdmin.getId());
        role.setCreateTime(new Date());
        int count = roleMapper.insertSelective(role);
        return count;
    }

    @Override
    public int update(Integer id, RoleParam roleParam) {
        Admin currentAdmin = SecurityUtils.getAdmin();
        Role role = new Role();
        BeanUtils.copyProperties(roleParam,role);
        role.setUpdateAdminId(currentAdmin.getId());
        role.setUpdateTime(new Date());
        RoleExample example = new RoleExample();
        example.createCriteria().andIdEqualTo(id);
        return roleMapper.updateByExampleSelective(role,example);
    }

    @Override
    public int deleteBatch(List<Integer> ids) {
        RoleExample example = new RoleExample();
        example.createCriteria().andIdIn(ids);
        return roleMapper.deleteByExample(example);
    }

    @Override
    public List<Permission> getPermissionList(Integer roleId) {
        return rolePermissionRelationDao.getPermissionList(roleId);
    }

    @Override
    public int updatePermission(Integer roleId, List<Integer> permissionIds) {
        //先删除原有关系
        RolePermissionRelationExample example=new RolePermissionRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        rolePermissionRelationMapper.deleteByExample(example);
        //批量插入新关系
        List<RolePermissionRelation> relationList = new ArrayList<>();
        for (Integer permissionId : permissionIds) {
            RolePermissionRelation relation = new RolePermissionRelation();
            relation.setRoleId(roleId);
            relation.setPermissionId(permissionId);
            relationList.add(relation);
        }
        return rolePermissionRelationDao.addBatch(relationList);
    }

    @Override
    public List<Role> listPage(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return roleMapper.selectByExample(new RoleExample());
    }
}
