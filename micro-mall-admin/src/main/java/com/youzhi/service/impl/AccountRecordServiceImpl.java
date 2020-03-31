package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.AccountRecordDao;
import com.youzhi.dto.AccountRecordQueryParam;
import com.youzhi.model.AccountRecord;
import com.youzhi.service.AccountRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/24 16:05
 */
@Service
public class AccountRecordServiceImpl implements AccountRecordService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountRecordServiceImpl.class);

    @Autowired
    private AccountRecordDao accountRecordDao;

    @Override
    public List<AccountRecord> listPage(AccountRecordQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return accountRecordDao.list(queryParam);
    }
}
