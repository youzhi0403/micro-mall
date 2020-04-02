package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.SmsCouponsHistoryDao;
import com.youzhi.dto.SmsCouponsHistoryQueryParam;
import com.youzhi.dto.SmsCouponsHistoryVo;
import com.youzhi.service.SmsCouponsHistoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:35
 */
@Service
public class SmsCouponsHistoryServiceImpl implements SmsCouponsHistoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SmsCouponsHistoryServiceImpl.class);

    @Autowired
    private SmsCouponsHistoryDao couponsHistoryDao;


    @Override
    public List<SmsCouponsHistoryVo> listPage(SmsCouponsHistoryQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return couponsHistoryDao.list(queryParam);
    }
}
