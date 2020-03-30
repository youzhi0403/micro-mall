package com.youzhi.service;

import com.youzhi.dto.PermissionNode;
import com.youzhi.dto.PermissionParam;
import com.youzhi.model.Permission;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 13:19
 */
public interface PermissionService {
    int add(PermissionParam permissionParam);

    int update(Integer id, PermissionParam permissionParam);

    int deleteBatch(List<Integer> ids);

    List<PermissionNode> treeList();

    List<Permission> listPage(Integer pageSize, Integer pageNum);
}
