package com.youzhi.service;

import com.youzhi.dto.GoodParam;
import com.youzhi.dto.GoodQueryParam;
import com.youzhi.model.Good;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 14:38
 * 商品Service
 */
public interface GoodService {

    /**
     * 添加商品
     * @param goodParam
     * @return
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int addGood(GoodParam goodParam);


    List<Good> list(GoodQueryParam goodQueryParam, Integer pageSize, Integer pageNum);
}
