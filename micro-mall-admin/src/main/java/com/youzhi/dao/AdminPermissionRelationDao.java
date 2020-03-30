package com.youzhi.dao;

import com.youzhi.model.AdminPermissionRelation;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 16:50
 */
public interface AdminPermissionRelationDao {

    int addBatch(List<AdminPermissionRelation> relationList);
}
