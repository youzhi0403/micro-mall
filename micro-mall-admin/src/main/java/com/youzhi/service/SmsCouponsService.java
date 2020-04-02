package com.youzhi.service;

import com.youzhi.dto.SmsCouponsParam;
import com.youzhi.dto.SmsCouponsQueryParam;
import com.youzhi.dto.SmsCouponsVo;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:29
 */
public interface SmsCouponsService {
    List<SmsCouponsVo> listPage(SmsCouponsQueryParam queryParam, Integer pageSize, Integer pageNum);

    int add(SmsCouponsParam smsCouponsParam);

    int delete(Integer id);
}
