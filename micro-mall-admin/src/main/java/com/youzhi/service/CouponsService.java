package com.youzhi.service;

import com.youzhi.dto.CouponsParam;
import com.youzhi.dto.CouponsQueryParam;
import com.youzhi.dto.CouponsVo;
import com.youzhi.model.Coupons;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:29
 */
public interface CouponsService {
    List<CouponsVo> listPage(CouponsQueryParam queryParam, Integer pageSize, Integer pageNum);

    int add(CouponsParam couponsParam);

    int delete(Integer id);
}
