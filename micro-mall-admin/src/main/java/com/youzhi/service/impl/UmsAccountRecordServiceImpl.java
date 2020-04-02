package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.UmsAccountRecordDao;
import com.youzhi.dto.UmsAccountRecordQueryParam;
import com.youzhi.model.UmsAccountRecord;
import com.youzhi.service.UmsAccountRecordService;
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
public class UmsAccountRecordServiceImpl implements UmsAccountRecordService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAccountRecordServiceImpl.class);

    @Autowired
    private UmsAccountRecordDao accountRecordDao;

    @Override
    public List<UmsAccountRecord> listPage(UmsAccountRecordQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return accountRecordDao.list(queryParam);
    }
}
