package com.youzhi.mapper;

import com.youzhi.model.SmsCouponsHistory;
import com.youzhi.model.SmsCouponsHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface SmsCouponsHistoryMapper {
    int countByExample(SmsCouponsHistoryExample example);

    int deleteByExample(SmsCouponsHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsCouponsHistory record);

    int insertSelective(SmsCouponsHistory record);

    List<SmsCouponsHistory> selectByExample(SmsCouponsHistoryExample example);

    SmsCouponsHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsCouponsHistory record, @Param("example") SmsCouponsHistoryExample example);

    int updateByExample(@Param("record") SmsCouponsHistory record, @Param("example") SmsCouponsHistoryExample example);

    int updateByPrimaryKeySelective(SmsCouponsHistory record);

    int updateByPrimaryKey(SmsCouponsHistory record);
}