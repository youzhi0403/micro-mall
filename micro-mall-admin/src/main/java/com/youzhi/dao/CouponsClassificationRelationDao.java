package com.youzhi.dao;


import com.youzhi.model.CouponsClassificationRelation;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 14:26
 */
public interface CouponsClassificationRelationDao {
    int addBatch(List<CouponsClassificationRelation> couponsClassificationRelationList);
}
