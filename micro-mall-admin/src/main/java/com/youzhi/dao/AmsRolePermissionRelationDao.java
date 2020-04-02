package com.youzhi.dao;

import com.youzhi.model.AmsPermission;
import com.youzhi.model.AmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 14:37
 */
public interface AmsRolePermissionRelationDao {
    /**
     * 批量插入角色和权限关系
     */
    int addBatch(@Param("list")List<AmsRolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<AmsPermission> getPermissionList(@Param("roleId") Integer roleId);
}
