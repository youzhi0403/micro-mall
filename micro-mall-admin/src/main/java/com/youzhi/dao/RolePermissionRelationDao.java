package com.youzhi.dao;

import com.youzhi.model.Permission;
import com.youzhi.model.RolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 14:37
 */
public interface RolePermissionRelationDao {
    /**
     * 批量插入角色和权限关系
     */
    int addBatch(@Param("list")List<RolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<Permission> getPermissionList(@Param("roleId") Integer roleId);
}
