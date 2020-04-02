package com.youzhi.dao;

import com.youzhi.model.AmsAdminPermissionRelation;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 16:50
 */
public interface AmsAdminPermissionRelationDao {

    int addBatch(List<AmsAdminPermissionRelation> relationList);
}
