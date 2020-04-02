package com.youzhi.dao;

import com.youzhi.model.AmsAdminRoleRelation;
import com.youzhi.model.AmsPermission;
import com.youzhi.model.AmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/3 15:18
 */
public interface AmsAdminRoleRelationDao {
    /**
     * 获取用户的所有权限（包括+-权限）
     */
    List<AmsPermission> getPermissionList(@Param("adminId") Integer id);

    /**
     * 批量添加
     * @param list
     * @return
     */
    int addBatch(List<AmsAdminRoleRelation> list);

    /**
     * 获取用户所有角色
     */
    List<AmsRole> getRoleList(@Param("adminId") Integer adminId);

    List<AmsPermission> getRolePermissionList(Integer adminId);
}
