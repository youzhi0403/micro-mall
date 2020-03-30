package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @author youzhi
 * @date 2020/3/24 13:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassificationParam {
    @ApiModelProperty(value = "商品分类名称",required = true)
    @NotEmpty(message = "名称不能为空")
    private String name;

    @ApiModelProperty(value = "父类id",required = true)
    private Integer parentId;

    @ApiModelProperty(value = "分类种类",required = true)
    @NotEmpty(message = "分类种类不能为空")
    private Integer kind;

}
