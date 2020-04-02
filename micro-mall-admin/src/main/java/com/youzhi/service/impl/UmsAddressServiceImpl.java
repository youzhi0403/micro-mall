package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.UmsAddressDao;
import com.youzhi.dto.UmsAddressQueryParam;
import com.youzhi.dto.UmsAddressVo;
import com.youzhi.service.UmsAddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/28 13:34
 */
@Service
public class UmsAddressServiceImpl implements UmsAddressService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAddressServiceImpl.class);

    @Autowired
    private UmsAddressDao addressDao;

    @Override
    public List<UmsAddressVo> listPage(UmsAddressQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return addressDao.list(queryParam);
    }
}
