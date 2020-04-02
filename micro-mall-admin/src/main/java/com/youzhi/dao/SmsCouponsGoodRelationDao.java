package com.youzhi.dao;


import com.youzhi.model.SmsCouponsGoodRelation;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 14:26
 */
public interface SmsCouponsGoodRelationDao {
    int addBatch(List<SmsCouponsGoodRelation> couponsGoodRelationList);

}
