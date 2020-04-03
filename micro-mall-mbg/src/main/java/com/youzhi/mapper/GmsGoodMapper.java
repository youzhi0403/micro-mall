package com.youzhi.mapper;

import com.youzhi.model.GmsGood;
import com.youzhi.model.GmsGoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface GmsGoodMapper {
    int countByExample(GmsGoodExample example);

    int deleteByExample(GmsGoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GmsGood record);

    int insertSelective(GmsGood record);

    List<GmsGood> selectByExample(GmsGoodExample example);

    GmsGood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GmsGood record, @Param("example") GmsGoodExample example);

    int updateByExample(@Param("record") GmsGood record, @Param("example") GmsGoodExample example);

    int updateByPrimaryKeySelective(GmsGood record);

    int updateByPrimaryKey(GmsGood record);
}