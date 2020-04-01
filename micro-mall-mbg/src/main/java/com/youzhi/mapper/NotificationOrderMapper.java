package com.youzhi.mapper;

import com.youzhi.model.NotificationOrder;
import com.youzhi.model.NotificationOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/01
*/
public interface NotificationOrderMapper {
    int countByExample(NotificationOrderExample example);

    int deleteByExample(NotificationOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NotificationOrder record);

    int insertSelective(NotificationOrder record);

    List<NotificationOrder> selectByExample(NotificationOrderExample example);

    NotificationOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NotificationOrder record, @Param("example") NotificationOrderExample example);

    int updateByExample(@Param("record") NotificationOrder record, @Param("example") NotificationOrderExample example);

    int updateByPrimaryKeySelective(NotificationOrder record);

    int updateByPrimaryKey(NotificationOrder record);
}