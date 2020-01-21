package com.youzhi.mapper;

import com.youzhi.model.Footprint;
import com.youzhi.model.FootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/01/21
*/
public interface FootprintMapper {
    int countByExample(FootprintExample example);

    int deleteByExample(FootprintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Footprint record);

    int insertSelective(Footprint record);

    List<Footprint> selectByExample(FootprintExample example);

    Footprint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Footprint record, @Param("example") FootprintExample example);

    int updateByExample(@Param("record") Footprint record, @Param("example") FootprintExample example);

    int updateByPrimaryKeySelective(Footprint record);

    int updateByPrimaryKey(Footprint record);
}