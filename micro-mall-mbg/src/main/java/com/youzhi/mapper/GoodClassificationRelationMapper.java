package com.youzhi.mapper;

import com.youzhi.model.GoodClassificationRelation;
import com.youzhi.model.GoodClassificationRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/01/20
*/
public interface GoodClassificationRelationMapper {
    int countByExample(GoodClassificationRelationExample example);

    int deleteByExample(GoodClassificationRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodClassificationRelation record);

    int insertSelective(GoodClassificationRelation record);

    List<GoodClassificationRelation> selectByExample(GoodClassificationRelationExample example);

    GoodClassificationRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodClassificationRelation record, @Param("example") GoodClassificationRelationExample example);

    int updateByExample(@Param("record") GoodClassificationRelation record, @Param("example") GoodClassificationRelationExample example);

    int updateByPrimaryKeySelective(GoodClassificationRelation record);

    int updateByPrimaryKey(GoodClassificationRelation record);
}