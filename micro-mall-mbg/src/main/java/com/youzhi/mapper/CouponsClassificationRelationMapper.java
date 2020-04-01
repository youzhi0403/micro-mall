package com.youzhi.mapper;

import com.youzhi.model.CouponsClassificationRelation;
import com.youzhi.model.CouponsClassificationRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/01
*/
public interface CouponsClassificationRelationMapper {
    int countByExample(CouponsClassificationRelationExample example);

    int deleteByExample(CouponsClassificationRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponsClassificationRelation record);

    int insertSelective(CouponsClassificationRelation record);

    List<CouponsClassificationRelation> selectByExample(CouponsClassificationRelationExample example);

    CouponsClassificationRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponsClassificationRelation record, @Param("example") CouponsClassificationRelationExample example);

    int updateByExample(@Param("record") CouponsClassificationRelation record, @Param("example") CouponsClassificationRelationExample example);

    int updateByPrimaryKeySelective(CouponsClassificationRelation record);

    int updateByPrimaryKey(CouponsClassificationRelation record);
}