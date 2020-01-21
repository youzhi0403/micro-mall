package com.youzhi.mapper;

import com.youzhi.model.Coupons;
import com.youzhi.model.CouponsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/01/21
*/
public interface CouponsMapper {
    int countByExample(CouponsExample example);

    int deleteByExample(CouponsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Coupons record);

    int insertSelective(Coupons record);

    List<Coupons> selectByExample(CouponsExample example);

    Coupons selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Coupons record, @Param("example") CouponsExample example);

    int updateByExample(@Param("record") Coupons record, @Param("example") CouponsExample example);

    int updateByPrimaryKeySelective(Coupons record);

    int updateByPrimaryKey(Coupons record);
}