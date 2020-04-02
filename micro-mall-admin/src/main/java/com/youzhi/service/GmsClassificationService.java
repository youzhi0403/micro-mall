package com.youzhi.service;

import com.youzhi.dto.GmsClassificationParam;
import com.youzhi.dto.GmsClassificationQueryParam;
import com.youzhi.model.GmsClassification;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/24 13:50
 */
public interface GmsClassificationService {
    List<GmsClassification> listPage(GmsClassificationQueryParam queryParam, Integer pageSize, Integer pageNum);

    int add(GmsClassificationParam gmsClassificationParam);

    int update(Integer id, GmsClassificationParam gmsClassificationParam);

    int delete(Integer id);

    List<GmsClassification> getList(Integer kind);

}
