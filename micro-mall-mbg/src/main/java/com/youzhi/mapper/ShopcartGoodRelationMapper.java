package com.youzhi.mapper;

import com.youzhi.model.ShopcartGoodRelation;
import com.youzhi.model.ShopcartGoodRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/03/30
*/
public interface ShopcartGoodRelationMapper {
    int countByExample(ShopcartGoodRelationExample example);

    int deleteByExample(ShopcartGoodRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopcartGoodRelation record);

    int insertSelective(ShopcartGoodRelation record);

    List<ShopcartGoodRelation> selectByExample(ShopcartGoodRelationExample example);

    ShopcartGoodRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopcartGoodRelation record, @Param("example") ShopcartGoodRelationExample example);

    int updateByExample(@Param("record") ShopcartGoodRelation record, @Param("example") ShopcartGoodRelationExample example);

    int updateByPrimaryKeySelective(ShopcartGoodRelation record);

    int updateByPrimaryKey(ShopcartGoodRelation record);
}