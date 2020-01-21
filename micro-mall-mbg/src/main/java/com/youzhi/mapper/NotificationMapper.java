package com.youzhi.mapper;

import com.youzhi.model.Notification;
import com.youzhi.model.NotificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/01/21
*/
public interface NotificationMapper {
    int countByExample(NotificationExample example);

    int deleteByExample(NotificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Notification record);

    int insertSelective(Notification record);

    List<Notification> selectByExample(NotificationExample example);

    Notification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Notification record, @Param("example") NotificationExample example);

    int updateByExample(@Param("record") Notification record, @Param("example") NotificationExample example);

    int updateByPrimaryKeySelective(Notification record);

    int updateByPrimaryKey(Notification record);
}