package com.youzhi.mapper;

import com.youzhi.model.AccountRecord;
import com.youzhi.model.AccountRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2020/04/01
*/
public interface AccountRecordMapper {
    int countByExample(AccountRecordExample example);

    int deleteByExample(AccountRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountRecord record);

    int insertSelective(AccountRecord record);

    List<AccountRecord> selectByExample(AccountRecordExample example);

    AccountRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountRecord record, @Param("example") AccountRecordExample example);

    int updateByExample(@Param("record") AccountRecord record, @Param("example") AccountRecordExample example);

    int updateByPrimaryKeySelective(AccountRecord record);

    int updateByPrimaryKey(AccountRecord record);
}