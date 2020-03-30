package com.youzhi.mapper;

import com.youzhi.model.Combination;
import com.youzhi.model.CombinationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/03/30
*/
public interface CombinationMapper {
    int countByExample(CombinationExample example);

    int deleteByExample(CombinationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Combination record);

    int insertSelective(Combination record);

    List<Combination> selectByExample(CombinationExample example);

    Combination selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Combination record, @Param("example") CombinationExample example);

    int updateByExample(@Param("record") Combination record, @Param("example") CombinationExample example);

    int updateByPrimaryKeySelective(Combination record);

    int updateByPrimaryKey(Combination record);
}