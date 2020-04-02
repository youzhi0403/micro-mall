package com.youzhi.dao;

import com.youzhi.dto.GmsClassificationQueryParam;
import com.youzhi.model.GmsClassification;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cwj
 * @date 2020/3/24 13:44
 */
public interface GmsClassificationDao {

    List<GmsClassification> list(@Param("queryParam") GmsClassificationQueryParam queryParam);


    List<GmsClassification> getList(@Param("kind") Integer kind);
}
