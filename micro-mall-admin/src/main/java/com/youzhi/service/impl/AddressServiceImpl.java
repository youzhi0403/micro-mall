package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.AddressDao;
import com.youzhi.dto.AddressQueryParam;
import com.youzhi.dto.AddressVo;
import com.youzhi.service.AddressService;
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
public class AddressServiceImpl implements AddressService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddressServiceImpl.class);

    @Autowired
    private AddressDao addressDao;

    @Override
    public List<AddressVo> listPage(AddressQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return addressDao.list(queryParam);
    }
}
