package com.youzhi.mapper;

import com.youzhi.model.OrderReturnApply;
import com.youzhi.model.OrderReturnApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/01
*/
public interface OrderReturnApplyMapper {
    int countByExample(OrderReturnApplyExample example);

    int deleteByExample(OrderReturnApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderReturnApply record);

    int insertSelective(OrderReturnApply record);

    List<OrderReturnApply> selectByExample(OrderReturnApplyExample example);

    OrderReturnApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderReturnApply record, @Param("example") OrderReturnApplyExample example);

    int updateByExample(@Param("record") OrderReturnApply record, @Param("example") OrderReturnApplyExample example);

    int updateByPrimaryKeySelective(OrderReturnApply record);

    int updateByPrimaryKey(OrderReturnApply record);
}