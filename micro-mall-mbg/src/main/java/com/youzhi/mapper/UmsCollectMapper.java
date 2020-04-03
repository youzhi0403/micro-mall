package com.youzhi.mapper;

import com.youzhi.model.UmsCollect;
import com.youzhi.model.UmsCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface UmsCollectMapper {
    int countByExample(UmsCollectExample example);

    int deleteByExample(UmsCollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsCollect record);

    int insertSelective(UmsCollect record);

    List<UmsCollect> selectByExample(UmsCollectExample example);

    UmsCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsCollect record, @Param("example") UmsCollectExample example);

    int updateByExample(@Param("record") UmsCollect record, @Param("example") UmsCollectExample example);

    int updateByPrimaryKeySelective(UmsCollect record);

    int updateByPrimaryKey(UmsCollect record);
}