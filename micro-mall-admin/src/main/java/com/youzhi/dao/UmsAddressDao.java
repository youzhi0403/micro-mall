package com.youzhi.dao;

import com.youzhi.dto.UmsAddressQueryParam;
import com.youzhi.dto.UmsAddressVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/28 13:35
 */
public interface UmsAddressDao {

    List<UmsAddressVo> list(@Param("queryParam") UmsAddressQueryParam queryParam);
}
