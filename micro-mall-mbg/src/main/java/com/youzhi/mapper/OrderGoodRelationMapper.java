package com.youzhi.mapper;

import com.youzhi.model.OrderGoodRelation;
import com.youzhi.model.OrderGoodRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodRelationMapper {
    int countByExample(OrderGoodRelationExample example);

    int deleteByExample(OrderGoodRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderGoodRelation record);

    int insertSelective(OrderGoodRelation record);

    List<OrderGoodRelation> selectByExample(OrderGoodRelationExample example);

    OrderGoodRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderGoodRelation record, @Param("example") OrderGoodRelationExample example);

    int updateByExample(@Param("record") OrderGoodRelation record, @Param("example") OrderGoodRelationExample example);

    int updateByPrimaryKeySelective(OrderGoodRelation record);

    int updateByPrimaryKey(OrderGoodRelation record);
}