package com.youzhi.mapper;

import com.youzhi.model.AmsPermission;
import com.youzhi.model.AmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface AmsPermissionMapper {
    int countByExample(AmsPermissionExample example);

    int deleteByExample(AmsPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmsPermission record);

    int insertSelective(AmsPermission record);

    List<AmsPermission> selectByExample(AmsPermissionExample example);

    AmsPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmsPermission record, @Param("example") AmsPermissionExample example);

    int updateByExample(@Param("record") AmsPermission record, @Param("example") AmsPermissionExample example);

    int updateByPrimaryKeySelective(AmsPermission record);

    int updateByPrimaryKey(AmsPermission record);
}