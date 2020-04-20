package com.youzhi.mapper;

import com.youzhi.model.UmsUserLoginLog;
import com.youzhi.model.UmsUserLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/19
*/
public interface UmsUserLoginLogMapper {
    int countByExample(UmsUserLoginLogExample example);

    int deleteByExample(UmsUserLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsUserLoginLog record);

    int insertSelective(UmsUserLoginLog record);

    List<UmsUserLoginLog> selectByExample(UmsUserLoginLogExample example);

    UmsUserLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsUserLoginLog record, @Param("example") UmsUserLoginLogExample example);

    int updateByExample(@Param("record") UmsUserLoginLog record, @Param("example") UmsUserLoginLogExample example);

    int updateByPrimaryKeySelective(UmsUserLoginLog record);

    int updateByPrimaryKey(UmsUserLoginLog record);
}