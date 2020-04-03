package com.youzhi.mapper;

import com.youzhi.model.AmsAdminLoginLog;
import com.youzhi.model.AmsAdminLoginLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface AmsAdminLoginLogMapper {
    int countByExample(AmsAdminLoginLogExample example);

    int deleteByExample(AmsAdminLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmsAdminLoginLog record);

    int insertSelective(AmsAdminLoginLog record);

    List<AmsAdminLoginLog> selectByExample(AmsAdminLoginLogExample example);

    AmsAdminLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmsAdminLoginLog record, @Param("example") AmsAdminLoginLogExample example);

    int updateByExample(@Param("record") AmsAdminLoginLog record, @Param("example") AmsAdminLoginLogExample example);

    int updateByPrimaryKeySelective(AmsAdminLoginLog record);

    int updateByPrimaryKey(AmsAdminLoginLog record);
}