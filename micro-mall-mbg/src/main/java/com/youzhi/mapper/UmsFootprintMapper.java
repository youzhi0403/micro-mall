package com.youzhi.mapper;

import com.youzhi.model.UmsFootprint;
import com.youzhi.model.UmsFootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/19
*/
public interface UmsFootprintMapper {
    int countByExample(UmsFootprintExample example);

    int deleteByExample(UmsFootprintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsFootprint record);

    int insertSelective(UmsFootprint record);

    List<UmsFootprint> selectByExample(UmsFootprintExample example);

    UmsFootprint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsFootprint record, @Param("example") UmsFootprintExample example);

    int updateByExample(@Param("record") UmsFootprint record, @Param("example") UmsFootprintExample example);

    int updateByPrimaryKeySelective(UmsFootprint record);

    int updateByPrimaryKey(UmsFootprint record);
}