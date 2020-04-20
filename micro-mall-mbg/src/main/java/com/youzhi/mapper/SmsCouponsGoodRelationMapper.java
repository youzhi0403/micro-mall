package com.youzhi.mapper;

import com.youzhi.model.SmsCouponsGoodRelation;
import com.youzhi.model.SmsCouponsGoodRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/19
*/
public interface SmsCouponsGoodRelationMapper {
    int countByExample(SmsCouponsGoodRelationExample example);

    int deleteByExample(SmsCouponsGoodRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsCouponsGoodRelation record);

    int insertSelective(SmsCouponsGoodRelation record);

    List<SmsCouponsGoodRelation> selectByExample(SmsCouponsGoodRelationExample example);

    SmsCouponsGoodRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsCouponsGoodRelation record, @Param("example") SmsCouponsGoodRelationExample example);

    int updateByExample(@Param("record") SmsCouponsGoodRelation record, @Param("example") SmsCouponsGoodRelationExample example);

    int updateByPrimaryKeySelective(SmsCouponsGoodRelation record);

    int updateByPrimaryKey(SmsCouponsGoodRelation record);
}