package com.youzhi.mapper;

import com.youzhi.model.AdminPermissionRelation;
import com.youzhi.model.AdminPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/01/21
*/
public interface AdminPermissionRelationMapper {
    int countByExample(AdminPermissionRelationExample example);

    int deleteByExample(AdminPermissionRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminPermissionRelation record);

    int insertSelective(AdminPermissionRelation record);

    List<AdminPermissionRelation> selectByExample(AdminPermissionRelationExample example);

    AdminPermissionRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminPermissionRelation record, @Param("example") AdminPermissionRelationExample example);

    int updateByExample(@Param("record") AdminPermissionRelation record, @Param("example") AdminPermissionRelationExample example);

    int updateByPrimaryKeySelective(AdminPermissionRelation record);

    int updateByPrimaryKey(AdminPermissionRelation record);
}