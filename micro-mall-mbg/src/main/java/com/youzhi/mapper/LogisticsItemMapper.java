package com.youzhi.mapper;

import com.youzhi.model.LogisticsItem;
import com.youzhi.model.LogisticsItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/03/30
*/
public interface LogisticsItemMapper {
    int countByExample(LogisticsItemExample example);

    int deleteByExample(LogisticsItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogisticsItem record);

    int insertSelective(LogisticsItem record);

    List<LogisticsItem> selectByExample(LogisticsItemExample example);

    LogisticsItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogisticsItem record, @Param("example") LogisticsItemExample example);

    int updateByExample(@Param("record") LogisticsItem record, @Param("example") LogisticsItemExample example);

    int updateByPrimaryKeySelective(LogisticsItem record);

    int updateByPrimaryKey(LogisticsItem record);
}