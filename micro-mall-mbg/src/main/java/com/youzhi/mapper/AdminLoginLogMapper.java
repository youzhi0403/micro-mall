package com.youzhi.mapper;

import com.youzhi.model.AdminLoginLog;
import com.youzhi.model.AdminLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/01/20
*/
public interface AdminLoginLogMapper {
    int countByExample(AdminLoginLogExample example);

    int deleteByExample(AdminLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminLoginLog record);

    int insertSelective(AdminLoginLog record);

    List<AdminLoginLog> selectByExample(AdminLoginLogExample example);

    AdminLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminLoginLog record, @Param("example") AdminLoginLogExample example);

    int updateByExample(@Param("record") AdminLoginLog record, @Param("example") AdminLoginLogExample example);

    int updateByPrimaryKeySelective(AdminLoginLog record);

    int updateByPrimaryKey(AdminLoginLog record);
}