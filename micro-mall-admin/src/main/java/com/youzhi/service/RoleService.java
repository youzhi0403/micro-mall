package com.youzhi.service;

import com.youzhi.dto.RoleParam;
import com.youzhi.model.Permission;
import com.youzhi.model.Role;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 14:06
 */
public interface RoleService {
    int add(RoleParam roleParam);

    int update(Integer id, RoleParam roleParam);

    int deleteBatch(List<Integer> ids);

    List<Permission> getPermissionList(Integer roleId);

    int updatePermission(Integer roleId, List<Integer> permissionIds);

    List<Role> listPage(Integer pageSize, Integer pageNum);
}
