package com.youzhi.mapper;

import com.youzhi.model.SmsCouponsClassificationRelation;
import com.youzhi.model.SmsCouponsClassificationRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/19
*/
public interface SmsCouponsClassificationRelationMapper {
    int countByExample(SmsCouponsClassificationRelationExample example);

    int deleteByExample(SmsCouponsClassificationRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsCouponsClassificationRelation record);

    int insertSelective(SmsCouponsClassificationRelation record);

    List<SmsCouponsClassificationRelation> selectByExample(SmsCouponsClassificationRelationExample example);

    SmsCouponsClassificationRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsCouponsClassificationRelation record, @Param("example") SmsCouponsClassificationRelationExample example);

    int updateByExample(@Param("record") SmsCouponsClassificationRelation record, @Param("example") SmsCouponsClassificationRelationExample example);

    int updateByPrimaryKeySelective(SmsCouponsClassificationRelation record);

    int updateByPrimaryKey(SmsCouponsClassificationRelation record);
}