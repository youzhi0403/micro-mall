package com.youzhi.dao;

import com.youzhi.model.AdminRoleRelation;
import com.youzhi.model.Permission;
import com.youzhi.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/3 15:18
 */
public interface AdminRoleRelationDao {
    /**
     * 获取用户的所有权限（包括+-权限）
     */
    List<Permission> getPermissionList(@Param("adminId") Integer id);

    /**
     * 批量添加
     * @param list
     * @return
     */
    int addBatch(List<AdminRoleRelation> list);

    /**
     * 获取用户所有角色
     */
    List<Role> getRoleList(@Param("adminId") Integer adminId);

    List<Permission> getRolePermissionList(Integer adminId);
}
