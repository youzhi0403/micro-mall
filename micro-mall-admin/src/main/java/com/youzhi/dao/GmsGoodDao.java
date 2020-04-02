package com.youzhi.dao;

import com.youzhi.dto.GmsGoodQueryParam;
import com.youzhi.dto.GmsGoodVo;
import com.youzhi.model.GmsGood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 17:21
 */
public interface GmsGoodDao {

    List<GmsGoodVo> list(@Param("queryParam") GmsGoodQueryParam queryParam);

    int addBatch(List<GmsGood> goodList);
}
