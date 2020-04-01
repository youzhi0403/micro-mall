package com.youzhi.mapper;

import com.youzhi.model.OrderReturnReason;
import com.youzhi.model.OrderReturnReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/01
*/
public interface OrderReturnReasonMapper {
    int countByExample(OrderReturnReasonExample example);

    int deleteByExample(OrderReturnReasonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderReturnReason record);

    int insertSelective(OrderReturnReason record);

    List<OrderReturnReason> selectByExample(OrderReturnReasonExample example);

    OrderReturnReason selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderReturnReason record, @Param("example") OrderReturnReasonExample example);

    int updateByExample(@Param("record") OrderReturnReason record, @Param("example") OrderReturnReasonExample example);

    int updateByPrimaryKeySelective(OrderReturnReason record);

    int updateByPrimaryKey(OrderReturnReason record);
}