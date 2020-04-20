package com.youzhi.mapper;

import com.youzhi.model.AmsRole;
import com.youzhi.model.AmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/19
*/
public interface AmsRoleMapper {
    int countByExample(AmsRoleExample example);

    int deleteByExample(AmsRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmsRole record);

    int insertSelective(AmsRole record);

    List<AmsRole> selectByExample(AmsRoleExample example);

    AmsRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmsRole record, @Param("example") AmsRoleExample example);

    int updateByExample(@Param("record") AmsRole record, @Param("example") AmsRoleExample example);

    int updateByPrimaryKeySelective(AmsRole record);

    int updateByPrimaryKey(AmsRole record);
}