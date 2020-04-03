package com.youzhi.mapper;

import com.youzhi.model.SmsCombination;
import com.youzhi.model.SmsCombinationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/03
*/
public interface SmsCombinationMapper {
    int countByExample(SmsCombinationExample example);

    int deleteByExample(SmsCombinationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsCombination record);

    int insertSelective(SmsCombination record);

    List<SmsCombination> selectByExample(SmsCombinationExample example);

    SmsCombination selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsCombination record, @Param("example") SmsCombinationExample example);

    int updateByExample(@Param("record") SmsCombination record, @Param("example") SmsCombinationExample example);

    int updateByPrimaryKeySelective(SmsCombination record);

    int updateByPrimaryKey(SmsCombination record);
}