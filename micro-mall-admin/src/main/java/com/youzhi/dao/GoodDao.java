package com.youzhi.dao;

import com.youzhi.dto.GoodQueryParam;
import com.youzhi.dto.GoodVo;
import com.youzhi.model.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 17:21
 */
public interface GoodDao {

    List<GoodVo> list(@Param("queryParam") GoodQueryParam goodQueryParam);

    int addBatch(List<Good> goodList);
}
