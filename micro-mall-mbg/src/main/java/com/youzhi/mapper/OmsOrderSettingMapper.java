package com.youzhi.mapper;

import com.youzhi.model.OmsOrderSetting;
import com.youzhi.model.OmsOrderSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface OmsOrderSettingMapper {
    int countByExample(OmsOrderSettingExample example);

    int deleteByExample(OmsOrderSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OmsOrderSetting record);

    int insertSelective(OmsOrderSetting record);

    List<OmsOrderSetting> selectByExample(OmsOrderSettingExample example);

    OmsOrderSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);

    int updateByExample(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);

    int updateByPrimaryKeySelective(OmsOrderSetting record);

    int updateByPrimaryKey(OmsOrderSetting record);
}