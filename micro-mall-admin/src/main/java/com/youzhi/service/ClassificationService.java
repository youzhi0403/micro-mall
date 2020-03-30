package com.youzhi.service;

import com.youzhi.dto.ClassificationParam;
import com.youzhi.dto.ClassificationQueryParam;
import com.youzhi.model.Classification;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/24 13:50
 */
public interface ClassificationService {
    List<Classification> listPage(ClassificationQueryParam queryParam, Integer pageSize, Integer pageNum);

    int add(ClassificationParam classificationParam);

    int update(Integer id, ClassificationParam classificationParam);

    int delete(Integer id);

    List<Classification> getList(Integer kind);

}
