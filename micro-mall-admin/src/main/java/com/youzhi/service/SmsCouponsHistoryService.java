package com.youzhi.service;

import com.youzhi.dto.SmsCouponsHistoryQueryParam;
import com.youzhi.dto.SmsCouponsHistoryVo;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:35
 */
public interface SmsCouponsHistoryService {
    List<SmsCouponsHistoryVo> listPage(SmsCouponsHistoryQueryParam queryParam, Integer pageSize, Integer pageNum);
}
