package com.youzhi.mapper;

import com.youzhi.model.CouponsGoodRelation;
import com.youzhi.model.CouponsGoodRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/01
*/
public interface CouponsGoodRelationMapper {
    int countByExample(CouponsGoodRelationExample example);

    int deleteByExample(CouponsGoodRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponsGoodRelation record);

    int insertSelective(CouponsGoodRelation record);

    List<CouponsGoodRelation> selectByExample(CouponsGoodRelationExample example);

    CouponsGoodRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponsGoodRelation record, @Param("example") CouponsGoodRelationExample example);

    int updateByExample(@Param("record") CouponsGoodRelation record, @Param("example") CouponsGoodRelationExample example);

    int updateByPrimaryKeySelective(CouponsGoodRelation record);

    int updateByPrimaryKey(CouponsGoodRelation record);
}