package com.youzhi.service;

import com.youzhi.dto.UmsAccountRecordQueryParam;
import com.youzhi.model.UmsAccountRecord;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/24 16:05
 */
public interface UmsAccountRecordService {

    List<UmsAccountRecord> listPage(UmsAccountRecordQueryParam queryParam, Integer pageSize, Integer pageNum);
}
