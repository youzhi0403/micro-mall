package com.youzhi.mapper;

import com.youzhi.model.UmsShopcartGoodRelation;
import com.youzhi.model.UmsShopcartGoodRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface UmsShopcartGoodRelationMapper {
    int countByExample(UmsShopcartGoodRelationExample example);

    int deleteByExample(UmsShopcartGoodRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsShopcartGoodRelation record);

    int insertSelective(UmsShopcartGoodRelation record);

    List<UmsShopcartGoodRelation> selectByExample(UmsShopcartGoodRelationExample example);

    UmsShopcartGoodRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsShopcartGoodRelation record, @Param("example") UmsShopcartGoodRelationExample example);

    int updateByExample(@Param("record") UmsShopcartGoodRelation record, @Param("example") UmsShopcartGoodRelationExample example);

    int updateByPrimaryKeySelective(UmsShopcartGoodRelation record);

    int updateByPrimaryKey(UmsShopcartGoodRelation record);
}