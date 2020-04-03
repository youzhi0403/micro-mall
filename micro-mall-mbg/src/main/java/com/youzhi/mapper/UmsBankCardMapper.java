package com.youzhi.mapper;

import com.youzhi.model.UmsBankCard;
import com.youzhi.model.UmsBankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface UmsBankCardMapper {
    int countByExample(UmsBankCardExample example);

    int deleteByExample(UmsBankCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsBankCard record);

    int insertSelective(UmsBankCard record);

    List<UmsBankCard> selectByExample(UmsBankCardExample example);

    UmsBankCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsBankCard record, @Param("example") UmsBankCardExample example);

    int updateByExample(@Param("record") UmsBankCard record, @Param("example") UmsBankCardExample example);

    int updateByPrimaryKeySelective(UmsBankCard record);

    int updateByPrimaryKey(UmsBankCard record);
}