package com.youzhi.mapper;

import com.youzhi.model.AmsAdminPermissionRelation;
import com.youzhi.model.AmsAdminPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/19
*/
public interface AmsAdminPermissionRelationMapper {
    int countByExample(AmsAdminPermissionRelationExample example);

    int deleteByExample(AmsAdminPermissionRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmsAdminPermissionRelation record);

    int insertSelective(AmsAdminPermissionRelation record);

    List<AmsAdminPermissionRelation> selectByExample(AmsAdminPermissionRelationExample example);

    AmsAdminPermissionRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmsAdminPermissionRelation record, @Param("example") AmsAdminPermissionRelationExample example);

    int updateByExample(@Param("record") AmsAdminPermissionRelation record, @Param("example") AmsAdminPermissionRelationExample example);

    int updateByPrimaryKeySelective(AmsAdminPermissionRelation record);

    int updateByPrimaryKey(AmsAdminPermissionRelation record);
}