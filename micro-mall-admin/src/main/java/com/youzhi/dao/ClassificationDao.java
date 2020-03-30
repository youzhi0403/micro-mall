package com.youzhi.dao;

import com.youzhi.dto.ClassificationQueryParam;
import com.youzhi.model.Classification;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cwj
 * @date 2020/3/24 13:44
 */
public interface ClassificationDao {

    List<Classification> list(@Param("queryParam") ClassificationQueryParam queryParam);


    List<Classification> getList(@Param("kind") Integer kind);
}
