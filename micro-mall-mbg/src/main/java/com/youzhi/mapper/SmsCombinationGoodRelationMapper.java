package com.youzhi.mapper;

import com.youzhi.model.SmsCombinationGoodRelation;
import com.youzhi.model.SmsCombinationGoodRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface SmsCombinationGoodRelationMapper {
    int countByExample(SmsCombinationGoodRelationExample example);

    int deleteByExample(SmsCombinationGoodRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsCombinationGoodRelation record);

    int insertSelective(SmsCombinationGoodRelation record);

    List<SmsCombinationGoodRelation> selectByExample(SmsCombinationGoodRelationExample example);

    SmsCombinationGoodRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsCombinationGoodRelation record, @Param("example") SmsCombinationGoodRelationExample example);

    int updateByExample(@Param("record") SmsCombinationGoodRelation record, @Param("example") SmsCombinationGoodRelationExample example);

    int updateByPrimaryKeySelective(SmsCombinationGoodRelation record);

    int updateByPrimaryKey(SmsCombinationGoodRelation record);
}