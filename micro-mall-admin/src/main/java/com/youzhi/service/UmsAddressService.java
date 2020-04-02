package com.youzhi.service;

import com.youzhi.dto.UmsAddressQueryParam;
import com.youzhi.dto.UmsAddressVo;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/28 13:34
 */
public interface UmsAddressService {

    List<UmsAddressVo> listPage(UmsAddressQueryParam queryParam, Integer pageSize, Integer pageNum);
}
