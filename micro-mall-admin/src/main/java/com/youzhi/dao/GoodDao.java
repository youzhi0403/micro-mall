package com.youzhi.dao;

import com.youzhi.dto.GoodQueryParam;
import com.youzhi.dto.GoodResult;
import com.youzhi.model.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 17:21
 */
public interface GoodDao {
    List<GoodResult> getList(@Param("queryParam") GoodQueryParam goodQueryParam);

    int addBatch(List<Good> goodList);
}
