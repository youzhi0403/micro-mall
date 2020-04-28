package com.youzhi.service;

import com.youzhi.dto.GmsGoodParam;
import com.youzhi.dto.GmsGoodQueryParam;
import com.youzhi.dto.GmsGoodVo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 14:38
 * 商品Service
 */
public interface GmsGoodService {

    /**
     * 添加商品
     * @param gmsGoodParam
     * @return
     */
    int add(GmsGoodParam gmsGoodParam);

    /**
     * 分页查询商品
     * @param queryParam
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<GmsGoodVo> listPage(GmsGoodQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 更新商品
     * @param id
     * @param gmsGoodParam
     * @return
     */
    int update(Integer id, GmsGoodParam gmsGoodParam);


    /**
     * 删除商品
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 批量导入商品
     * @param file
     * @return
     */
    int importGoods(MultipartFile file);

    /**
     * 补充库存数量
     * @param addNum
     * @return
     */
    int addInventory(Integer id,Integer addNum);

    /**
     * 获取商品详情
     * @param id
     * @return
     */
    GmsGoodVo detail(Integer id);
}
