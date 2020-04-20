package com.youzhi.mapper;

import com.youzhi.model.AmsRolePermissionRelation;
import com.youzhi.model.AmsRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/19
*/
public interface AmsRolePermissionRelationMapper {
    int countByExample(AmsRolePermissionRelationExample example);

    int deleteByExample(AmsRolePermissionRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmsRolePermissionRelation record);

    int insertSelective(AmsRolePermissionRelation record);

    List<AmsRolePermissionRelation> selectByExample(AmsRolePermissionRelationExample example);

    AmsRolePermissionRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmsRolePermissionRelation record, @Param("example") AmsRolePermissionRelationExample example);

    int updateByExample(@Param("record") AmsRolePermissionRelation record, @Param("example") AmsRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(AmsRolePermissionRelation record);

    int updateByPrimaryKey(AmsRolePermissionRelation record);
}