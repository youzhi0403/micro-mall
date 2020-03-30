package com.youzhi.dao;

import com.youzhi.dto.AccountRecordQueryParam;
import com.youzhi.model.AccountRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/24 16:04
 */
public interface AccountRecordDao {
    List<AccountRecord> list(@Param("queryParam") AccountRecordQueryParam queryParam);
}
