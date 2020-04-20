package com.youzhi.mapper;

import com.youzhi.model.UmsFeedback;
import com.youzhi.model.UmsFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/19
*/
public interface UmsFeedbackMapper {
    int countByExample(UmsFeedbackExample example);

    int deleteByExample(UmsFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsFeedback record);

    int insertSelective(UmsFeedback record);

    List<UmsFeedback> selectByExample(UmsFeedbackExample example);

    UmsFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsFeedback record, @Param("example") UmsFeedbackExample example);

    int updateByExample(@Param("record") UmsFeedback record, @Param("example") UmsFeedbackExample example);

    int updateByPrimaryKeySelective(UmsFeedback record);

    int updateByPrimaryKey(UmsFeedback record);
}