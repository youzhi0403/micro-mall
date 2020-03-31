package com.youzhi.service;

import com.youzhi.dto.OrderQueryParam;
import com.youzhi.dto.OrderVo;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/31 15:16
 */
public interface OrderService {
    List<OrderVo> listPage(OrderQueryParam queryParam, Integer pageSize, Integer pageNum);
}
