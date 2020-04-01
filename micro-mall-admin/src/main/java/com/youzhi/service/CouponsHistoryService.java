package com.youzhi.service;

import com.youzhi.dto.CouponsHistoryQueryParam;
import com.youzhi.dto.CouponsHistoryVo;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:35
 */
public interface CouponsHistoryService {
    List<CouponsHistoryVo> listPage(CouponsHistoryQueryParam queryParam, Integer pageSize, Integer pageNum);
}
