package com.youzhi.mapper;

import com.youzhi.model.Classification;
import com.youzhi.model.ClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/01/20
*/
public interface ClassificationMapper {
    int countByExample(ClassificationExample example);

    int deleteByExample(ClassificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Classification record);

    int insertSelective(Classification record);

    List<Classification> selectByExample(ClassificationExample example);

    Classification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByExample(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);
}