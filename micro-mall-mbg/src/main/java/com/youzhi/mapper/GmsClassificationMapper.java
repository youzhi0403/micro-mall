package com.youzhi.mapper;

import com.youzhi.model.GmsClassification;
import com.youzhi.model.GmsClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface GmsClassificationMapper {
    int countByExample(GmsClassificationExample example);

    int deleteByExample(GmsClassificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GmsClassification record);

    int insertSelective(GmsClassification record);

    List<GmsClassification> selectByExample(GmsClassificationExample example);

    GmsClassification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GmsClassification record, @Param("example") GmsClassificationExample example);

    int updateByExample(@Param("record") GmsClassification record, @Param("example") GmsClassificationExample example);

    int updateByPrimaryKeySelective(GmsClassification record);

    int updateByPrimaryKey(GmsClassification record);
}