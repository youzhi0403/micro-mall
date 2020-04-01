package com.youzhi.dao;

import com.youzhi.dto.CouponsHistoryQueryParam;
import com.youzhi.dto.CouponsHistoryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:36
 */
public interface CouponsHistoryDao {

    List<CouponsHistoryVo> list(@Param("queryParam") CouponsHistoryQueryParam queryParam);
}
