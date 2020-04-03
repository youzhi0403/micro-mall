package com.youzhi.mapper;

import com.youzhi.model.AmsAdminRoleRelation;
import com.youzhi.model.AmsAdminRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface AmsAdminRoleRelationMapper {
    int countByExample(AmsAdminRoleRelationExample example);

    int deleteByExample(AmsAdminRoleRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmsAdminRoleRelation record);

    int insertSelective(AmsAdminRoleRelation record);

    List<AmsAdminRoleRelation> selectByExample(AmsAdminRoleRelationExample example);

    AmsAdminRoleRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmsAdminRoleRelation record, @Param("example") AmsAdminRoleRelationExample example);

    int updateByExample(@Param("record") AmsAdminRoleRelation record, @Param("example") AmsAdminRoleRelationExample example);

    int updateByPrimaryKeySelective(AmsAdminRoleRelation record);

    int updateByPrimaryKey(AmsAdminRoleRelation record);
}