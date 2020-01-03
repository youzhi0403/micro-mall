package com.youzhi.service;

import com.youzhi.model.Admin;
import com.youzhi.model.Permission;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/3 14:56
 */
public interface AdminService {

    /**
     * 根据用户名获取后台管理员
     * @param username
     * @return
     */
    Admin getAdminByUsername(String username);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     * @param id
     * @return
     */
    List<Permission> getPermissionList(Integer id);
}
