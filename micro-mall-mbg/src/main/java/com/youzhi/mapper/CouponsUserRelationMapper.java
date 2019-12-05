package com.youzhi.mapper;

import com.youzhi.model.CouponsUserRelation;
import com.youzhi.model.CouponsUserRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponsUserRelationMapper {
    int countByExample(CouponsUserRelationExample example);

    int deleteByExample(CouponsUserRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponsUserRelation record);

    int insertSelective(CouponsUserRelation record);

    List<CouponsUserRelation> selectByExample(CouponsUserRelationExample example);

    CouponsUserRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponsUserRelation record, @Param("example") CouponsUserRelationExample example);

    int updateByExample(@Param("record") CouponsUserRelation record, @Param("example") CouponsUserRelationExample example);

    int updateByPrimaryKeySelective(CouponsUserRelation record);

    int updateByPrimaryKey(CouponsUserRelation record);
}