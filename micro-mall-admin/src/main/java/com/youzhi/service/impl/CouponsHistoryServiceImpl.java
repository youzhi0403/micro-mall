package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.CouponsHistoryDao;
import com.youzhi.dto.CouponsHistoryQueryParam;
import com.youzhi.dto.CouponsHistoryVo;
import com.youzhi.service.CouponsHistoryService;
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
public class CouponsHistoryServiceImpl implements CouponsHistoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CouponsHistoryServiceImpl.class);

    @Autowired
    private CouponsHistoryDao couponsHistoryDao;


    @Override
    public List<CouponsHistoryVo> listPage(CouponsHistoryQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return couponsHistoryDao.list(queryParam);
    }
}
