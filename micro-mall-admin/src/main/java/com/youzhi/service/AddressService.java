package com.youzhi.service;

import com.youzhi.dto.AddressQueryParam;
import com.youzhi.dto.AddressVo;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/28 13:34
 */
public interface AddressService {

    List<AddressVo> listPage(AddressQueryParam queryParam, Integer pageSize, Integer pageNum);
}
