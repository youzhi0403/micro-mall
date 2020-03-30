package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dto.PermissionNode;
import com.youzhi.dto.PermissionParam;
import com.youzhi.mapper.PermissionMapper;
import com.youzhi.mapper.UserMapper;
import com.youzhi.model.Admin;
import com.youzhi.model.Permission;
import com.youzhi.model.PermissionExample;
import com.youzhi.service.PermissionService;
import com.youzhi.util.SecurityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author youzhi
 * @date 2020/3/30 13:19
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public int add(PermissionParam permissionParam) {
        Admin currentAdmin = SecurityUtils.getAdmin();
        Permission permission = new Permission();
        BeanUtils.copyProperties(permissionParam,permission);
        permission.setCreateAdminId(currentAdmin.getId());
        permission.setCreateTime(new Date());
        int count = permissionMapper.insertSelective(permission);
        return count;
    }

    @Override
    public int update(Integer id, PermissionParam permissionParam) {
        Admin currentAdmin = SecurityUtils.getAdmin();
        Permission permission = new Permission();
        BeanUtils.copyProperties(permissionParam,permission);
        permission.setUpdateAdminId(currentAdmin.getId());
        permission.setUpdateTime(new Date());
        PermissionExample example = new PermissionExample();
        example.createCriteria().andIdEqualTo(id);
        return permissionMapper.updateByExampleSelective(permission,example);
    }

    @Override
    public int deleteBatch(List<Integer> ids) {
        PermissionExample example = new PermissionExample();
        example.createCriteria().andIdIn(ids);
        return permissionMapper.deleteByExample(example);
    }

    @Override
    public List<PermissionNode> treeList() {
        List<Permission> permissionList = permissionMapper.selectByExample(new PermissionExample());
        List<PermissionNode> result = permissionList.stream()
                .filter(permission -> permission.getParentId().equals(0))
                .map(permission -> covert(permission,permissionList)).collect(Collectors.toList());
        return result;
    }

    @Override
    public List<Permission> listPage(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return permissionMapper.selectByExample(new PermissionExample());
    }

    /**
     * 将权限转换为带有子级的权限对象
     * 当找不到子级权限的时候map操作不会再递归调用covert
     */
    private PermissionNode covert(Permission permission,List<Permission> permissionList){
        PermissionNode node = new PermissionNode();
        BeanUtils.copyProperties(permission,node);
        List<PermissionNode> children = permissionList.stream()
                .filter(subPermission -> subPermission.getParentId().equals(permission.getId()))
                .map(subPermission -> covert(subPermission,permissionList)).collect(Collectors.toList());
        node.setChildren(children);
        return node;
    }
}
