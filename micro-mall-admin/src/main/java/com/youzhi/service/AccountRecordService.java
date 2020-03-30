package com.youzhi.service;

import com.youzhi.dto.AccountRecordQueryParam;
import com.youzhi.model.AccountRecord;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/24 16:05
 */
public interface AccountRecordService {

    List<AccountRecord> listPage(AccountRecordQueryParam queryParam, Integer pageSize, Integer pageNum);
}
