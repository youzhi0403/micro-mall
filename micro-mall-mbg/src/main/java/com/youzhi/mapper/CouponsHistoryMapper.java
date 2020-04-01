package com.youzhi.mapper;

import com.youzhi.model.CouponsHistory;
import com.youzhi.model.CouponsHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/01
*/
public interface CouponsHistoryMapper {
    int countByExample(CouponsHistoryExample example);

    int deleteByExample(CouponsHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponsHistory record);

    int insertSelective(CouponsHistory record);

    List<CouponsHistory> selectByExample(CouponsHistoryExample example);

    CouponsHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponsHistory record, @Param("example") CouponsHistoryExample example);

    int updateByExample(@Param("record") CouponsHistory record, @Param("example") CouponsHistoryExample example);

    int updateByPrimaryKeySelective(CouponsHistory record);

    int updateByPrimaryKey(CouponsHistory record);
}