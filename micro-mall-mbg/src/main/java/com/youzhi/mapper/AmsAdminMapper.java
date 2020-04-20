package com.youzhi.mapper;

import com.youzhi.model.AmsAdmin;
import com.youzhi.model.AmsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/19
*/
public interface AmsAdminMapper {
    int countByExample(AmsAdminExample example);

    int deleteByExample(AmsAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmsAdmin record);

    int insertSelective(AmsAdmin record);

    List<AmsAdmin> selectByExample(AmsAdminExample example);

    AmsAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmsAdmin record, @Param("example") AmsAdminExample example);

    int updateByExample(@Param("record") AmsAdmin record, @Param("example") AmsAdminExample example);

    int updateByPrimaryKeySelective(AmsAdmin record);

    int updateByPrimaryKey(AmsAdmin record);
}