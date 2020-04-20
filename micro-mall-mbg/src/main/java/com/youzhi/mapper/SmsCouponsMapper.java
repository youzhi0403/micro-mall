package com.youzhi.mapper;

import com.youzhi.model.SmsCoupons;
import com.youzhi.model.SmsCouponsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/19
*/
public interface SmsCouponsMapper {
    int countByExample(SmsCouponsExample example);

    int deleteByExample(SmsCouponsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsCoupons record);

    int insertSelective(SmsCoupons record);

    List<SmsCoupons> selectByExample(SmsCouponsExample example);

    SmsCoupons selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsCoupons record, @Param("example") SmsCouponsExample example);

    int updateByExample(@Param("record") SmsCoupons record, @Param("example") SmsCouponsExample example);

    int updateByPrimaryKeySelective(SmsCoupons record);

    int updateByPrimaryKey(SmsCoupons record);
}