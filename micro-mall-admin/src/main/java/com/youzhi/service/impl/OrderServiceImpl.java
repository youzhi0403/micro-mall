package com.youzhi.service.impl;

import com.youzhi.dao.OrderDao;
import com.youzhi.dto.OrderQueryParam;
import com.youzhi.dto.OrderVo;
import com.youzhi.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/31 15:17
 */
@Service
public class OrderServiceImpl implements OrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<OrderVo> listPage(OrderQueryParam queryParam, Integer pageSize, Integer pageNum) {
        return null;
    }
}
