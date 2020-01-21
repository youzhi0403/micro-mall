package com.youzhi.service;

import com.youzhi.dto.AdminParam;
import com.youzhi.dto.AdminResult;
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
    AdminResult getAdminByUsername(String username);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     * @param id
     * @return
     */
    List<Permission> getPermissionList(Integer id);

    /**
     * 登录功能
     * @param username  用户名
     * @param password  密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 注册功能
     * @param adminParam
     * @return
     */
    Admin register(AdminParam adminParam);
}
