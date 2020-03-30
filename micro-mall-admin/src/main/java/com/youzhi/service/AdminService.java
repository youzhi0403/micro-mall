package com.youzhi.service;

import com.youzhi.dto.AdminParam;
import com.youzhi.dto.AdminQueryParam;
import com.youzhi.dto.AdminVo;
import com.youzhi.model.Admin;
import com.youzhi.model.Permission;
import com.youzhi.model.Role;

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
    AdminVo getAdminByUsername(String username);

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
    int add(AdminParam adminParam);

    /**
     * 分页查询后台管理员
     * @param queryParam
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<AdminVo> listPage(AdminQueryParam queryParam, Integer pageSize, Integer pageNum);


    /**
     * 更新后台管理员
     * @param id
     * @param adminParam
     * @return
     */
    int update(Integer id, AdminParam adminParam);


    /**
     * 删除后台管理员
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 禁用管理员
     * @param id
     * @return
     */
    int forbidden(Integer id);

    /**
     * 开启管理员
     * @param id
     * @return
     */
    int launch(Integer id);

    /**
     * 更新管理员角色
     * @param adminId
     * @param roleIds
     * @return
     */
    int updateRole(Integer adminId, List<Integer> roleIds);

    /**
     * 获取角色列表
     * @param adminId
     * @return
     */
    List<Role> getRoleList(Integer adminId);

    /**
     * 更新用户权限+-
     * @param adminId
     * @param permissionIds
     * @return
     */
    int updatePermission(Integer adminId, List<Integer> permissionIds);
}
