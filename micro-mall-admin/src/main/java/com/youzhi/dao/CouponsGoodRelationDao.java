package com.youzhi.dao;


import com.youzhi.model.CouponsGoodRelation;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 14:26
 */
public interface CouponsGoodRelationDao {
    int addBatch(List<CouponsGoodRelation> couponsGoodRelationList);

}
