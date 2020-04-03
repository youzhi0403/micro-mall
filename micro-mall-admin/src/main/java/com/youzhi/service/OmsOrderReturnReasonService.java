package com.youzhi.service;

import com.youzhi.model.OmsOrderReturnReason;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/3 10:23
 */
public interface OmsOrderReturnReasonService {
    int add(OmsOrderReturnReason returnReason);

    int update(Integer id, OmsOrderReturnReason returnReason);

    int deleteBatch(List<Integer> ids);

    OmsOrderReturnReason detail(Integer id);

    int updateStatus(List<Integer> ids, Integer status);

    List<OmsOrderReturnReason> listPage(Integer pageSize, Integer pageNum);
}
