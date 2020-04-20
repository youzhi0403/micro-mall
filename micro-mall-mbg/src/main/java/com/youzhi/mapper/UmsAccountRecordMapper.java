package com.youzhi.mapper;

import com.youzhi.model.UmsAccountRecord;
import com.youzhi.model.UmsAccountRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/19
*/
public interface UmsAccountRecordMapper {
    int countByExample(UmsAccountRecordExample example);

    int deleteByExample(UmsAccountRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsAccountRecord record);

    int insertSelective(UmsAccountRecord record);

    List<UmsAccountRecord> selectByExample(UmsAccountRecordExample example);

    UmsAccountRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsAccountRecord record, @Param("example") UmsAccountRecordExample example);

    int updateByExample(@Param("record") UmsAccountRecord record, @Param("example") UmsAccountRecordExample example);

    int updateByPrimaryKeySelective(UmsAccountRecord record);

    int updateByPrimaryKey(UmsAccountRecord record);
}