package com.youzhi.dao;

import com.youzhi.dto.AddressQueryParam;
import com.youzhi.dto.AddressVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/28 13:35
 */
public interface AddressDao {

    List<AddressVo> list(@Param("queryParam") AddressQueryParam queryParam);
}
