package com.youzhi.dao;

import com.youzhi.dto.UmsAccountRecordQueryParam;
import com.youzhi.model.UmsAccountRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/24 16:04
 */
public interface UmsAccountRecordDao {
    List<UmsAccountRecord> list(@Param("queryParam") UmsAccountRecordQueryParam queryParam);
}
