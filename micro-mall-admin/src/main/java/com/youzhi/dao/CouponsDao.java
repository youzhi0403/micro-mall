package com.youzhi.dao;

import com.youzhi.dto.CouponsQueryParam;
import com.youzhi.dto.CouponsVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:29
 */
public interface CouponsDao {
    List<CouponsVo> list(@Param("queryParam") CouponsQueryParam queryParam);

}
