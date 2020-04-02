package com.youzhi.dao;


import com.youzhi.model.SmsCouponsClassificationRelation;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 14:26
 */
public interface SmsCouponsClassificationRelationDao {
    int addBatch(List<SmsCouponsClassificationRelation> couponsClassificationRelationList);
}
