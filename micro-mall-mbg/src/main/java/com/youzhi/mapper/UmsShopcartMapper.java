package com.youzhi.mapper;

import com.youzhi.model.UmsShopcart;
import com.youzhi.model.UmsShopcartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface UmsShopcartMapper {
    int countByExample(UmsShopcartExample example);

    int deleteByExample(UmsShopcartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsShopcart record);

    int insertSelective(UmsShopcart record);

    List<UmsShopcart> selectByExample(UmsShopcartExample example);

    UmsShopcart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsShopcart record, @Param("example") UmsShopcartExample example);

    int updateByExample(@Param("record") UmsShopcart record, @Param("example") UmsShopcartExample example);

    int updateByPrimaryKeySelective(UmsShopcart record);

    int updateByPrimaryKey(UmsShopcart record);
}