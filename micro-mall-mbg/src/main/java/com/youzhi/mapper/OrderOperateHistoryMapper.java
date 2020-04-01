package com.youzhi.mapper;

import com.youzhi.model.OrderOperateHistory;
import com.youzhi.model.OrderOperateHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/01
*/
public interface OrderOperateHistoryMapper {
    int countByExample(OrderOperateHistoryExample example);

    int deleteByExample(OrderOperateHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderOperateHistory record);

    int insertSelective(OrderOperateHistory record);

    List<OrderOperateHistory> selectByExample(OrderOperateHistoryExample example);

    OrderOperateHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderOperateHistory record, @Param("example") OrderOperateHistoryExample example);

    int updateByExample(@Param("record") OrderOperateHistory record, @Param("example") OrderOperateHistoryExample example);

    int updateByPrimaryKeySelective(OrderOperateHistory record);

    int updateByPrimaryKey(OrderOperateHistory record);
}