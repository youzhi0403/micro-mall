package com.youzhi.mapper;

import com.youzhi.model.CombinationGoodRelation;
import com.youzhi.model.CombinationGoodRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CombinationGoodRelationMapper {
    int countByExample(CombinationGoodRelationExample example);

    int deleteByExample(CombinationGoodRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CombinationGoodRelation record);

    int insertSelective(CombinationGoodRelation record);

    List<CombinationGoodRelation> selectByExample(CombinationGoodRelationExample example);

    CombinationGoodRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CombinationGoodRelation record, @Param("example") CombinationGoodRelationExample example);

    int updateByExample(@Param("record") CombinationGoodRelation record, @Param("example") CombinationGoodRelationExample example);

    int updateByPrimaryKeySelective(CombinationGoodRelation record);

    int updateByPrimaryKey(CombinationGoodRelation record);
}