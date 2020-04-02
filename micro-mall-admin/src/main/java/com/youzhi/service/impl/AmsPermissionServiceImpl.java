package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dto.AmsPermissionNode;
import com.youzhi.dto.AmsPermissionParam;
import com.youzhi.mapper.AmsPermissionMapper;
import com.youzhi.model.AmsAdmin;
import com.youzhi.model.AmsPermission;
import com.youzhi.model.AmsPermissionExample;
import com.youzhi.service.AmsPermissionService;
import com.youzhi.util.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class AmsPermissionServiceImpl implements AmsPermissionService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AmsPermissionServiceImpl.class);

    @Autowired
    private AmsPermissionMapper permissionMapper;

    @Override
    public int add(AmsPermissionParam amsPermissionParam) {
        AmsAdmin currentAdmin = SecurityUtils.getAdmin();
        AmsPermission permission = new AmsPermission();
        BeanUtils.copyProperties(amsPermissionParam,permission);
        permission.setCreateAdminId(currentAdmin.getId());
        permission.setCreateTime(new Date());
        int count = permissionMapper.insertSelective(permission);
        return count;
    }

    @Override
    public int update(Integer id, AmsPermissionParam amsPermissionParam) {
        AmsAdmin currentAdmin = SecurityUtils.getAdmin();
        AmsPermission permission = new AmsPermission();
        BeanUtils.copyProperties(amsPermissionParam,permission);
        permission.setUpdateAdminId(currentAdmin.getId());
        permission.setUpdateTime(new Date());
        AmsPermissionExample example = new AmsPermissionExample();
        example.createCriteria().andIdEqualTo(id);
        return permissionMapper.updateByExampleSelective(permission,example);
    }

    @Override
    public int deleteBatch(List<Integer> ids) {
        AmsPermissionExample example = new AmsPermissionExample();
        example.createCriteria().andIdIn(ids);
        return permissionMapper.deleteByExample(example);
    }

    @Override
    public List<AmsPermissionNode> treeList() {
        List<AmsPermission> permissionList = permissionMapper.selectByExample(new AmsPermissionExample());
        List<AmsPermissionNode> result = permissionList.stream()
                .filter(permission -> permission.getParentId().equals(0))
                .map(permission -> covert(permission,permissionList)).collect(Collectors.toList());
        return result;
    }

    @Override
    public List<AmsPermission> listPage(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return permissionMapper.selectByExample(new AmsPermissionExample());
    }

    /**
     * 将权限转换为带有子级的权限对象
     * 当找不到子级权限的时候map操作不会再递归调用covert
     */
    private AmsPermissionNode covert(AmsPermission permission, List<AmsPermission> permissionList){
        AmsPermissionNode node = new AmsPermissionNode();
        BeanUtils.copyProperties(permission,node);
        List<AmsPermissionNode> children = permissionList.stream()
                .filter(subPermission -> subPermission.getParentId().equals(permission.getId()))
                .map(subPermission -> covert(subPermission,permissionList)).collect(Collectors.toList());
        node.setChildren(children);
        return node;
    }
}
