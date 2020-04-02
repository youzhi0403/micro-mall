package com.youzhi.dao;

import com.youzhi.dto.SmsCouponsHistoryQueryParam;
import com.youzhi.dto.SmsCouponsHistoryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:36
 */
public interface SmsCouponsHistoryDao {

    List<SmsCouponsHistoryVo> list(@Param("queryParam") SmsCouponsHistoryQueryParam queryParam);
}
