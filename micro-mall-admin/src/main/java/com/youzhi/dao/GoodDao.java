package com.youzhi.dao;

import com.youzhi.dto.GoodQueryParam;
import com.youzhi.dto.GoodResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 17:21
 */
public interface GoodDao {
    List<GoodResult> getList(@Param("queryParam") GoodQueryParam goodQueryParam);
}
