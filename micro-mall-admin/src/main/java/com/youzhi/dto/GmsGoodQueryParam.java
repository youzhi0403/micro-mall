package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author cwj
 * @date 2020/1/18 17:05
 * 商品查询参数
 */
@Data
public class GmsGoodQueryParam {
    @ApiModelProperty("上架状态")
    private Integer status;

    @ApiModelProperty("商品名称模糊关键字")
    private String keyword;

    @ApiModelProperty("商品分类id")
    private Integer classificationId;
}
