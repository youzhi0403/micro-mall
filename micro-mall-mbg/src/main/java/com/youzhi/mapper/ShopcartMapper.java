package com.youzhi.mapper;

import com.youzhi.model.Shopcart;
import com.youzhi.model.ShopcartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/01/20
*/
public interface ShopcartMapper {
    int countByExample(ShopcartExample example);

    int deleteByExample(ShopcartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shopcart record);

    int insertSelective(Shopcart record);

    List<Shopcart> selectByExample(ShopcartExample example);

    Shopcart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByExample(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByPrimaryKeySelective(Shopcart record);

    int updateByPrimaryKey(Shopcart record);
}