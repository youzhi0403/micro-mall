package com.youzhi.dao;

import com.youzhi.dto.SmsCouponsQueryParam;
import com.youzhi.dto.SmsCouponsVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:29
 */
public interface SmsCouponsDao {
    List<SmsCouponsVo> list(@Param("queryParam") SmsCouponsQueryParam queryParam);

}
