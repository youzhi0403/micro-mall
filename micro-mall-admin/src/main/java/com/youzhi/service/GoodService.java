package com.youzhi.service;

import com.youzhi.dto.GoodParam;
import com.youzhi.dto.GoodQueryParam;
import com.youzhi.dto.GoodResult;
import com.youzhi.model.Good;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

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

    /**
     * 分页查询商品
     * @param goodQueryParam
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<GoodResult> list(GoodQueryParam goodQueryParam, Integer pageSize, Integer pageNum);

    /**
     * 更新商品
     * @param id
     * @param goodParam
     * @return
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int updateGood(Integer id, GoodParam goodParam);


    /**
     * 删除商品
     * @param id
     * @return
     */
    int deleteGood(Integer id);

    /**
     * 批量导入商品
     * @param file
     * @return
     */
    int importGoods(MultipartFile file);
}
