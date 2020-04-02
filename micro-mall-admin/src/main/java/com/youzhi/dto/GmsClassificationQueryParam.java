package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author youzhi
 * @date 2020/3/24 13:53
 */
@Data
public class GmsClassificationQueryParam {
    @ApiModelProperty("商品分类名称模糊关键字")
    private String keyword;

    @ApiModelProperty("分类的种类")
    private Integer kind;
}
