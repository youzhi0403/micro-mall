package com.youzhi.mapper;

import com.youzhi.model.GmsGoodClassificationRelation;
import com.youzhi.model.GmsGoodClassificationRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface GmsGoodClassificationRelationMapper {
    int countByExample(GmsGoodClassificationRelationExample example);

    int deleteByExample(GmsGoodClassificationRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GmsGoodClassificationRelation record);

    int insertSelective(GmsGoodClassificationRelation record);

    List<GmsGoodClassificationRelation> selectByExample(GmsGoodClassificationRelationExample example);

    GmsGoodClassificationRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GmsGoodClassificationRelation record, @Param("example") GmsGoodClassificationRelationExample example);

    int updateByExample(@Param("record") GmsGoodClassificationRelation record, @Param("example") GmsGoodClassificationRelationExample example);

    int updateByPrimaryKeySelective(GmsGoodClassificationRelation record);

    int updateByPrimaryKey(GmsGoodClassificationRelation record);
}