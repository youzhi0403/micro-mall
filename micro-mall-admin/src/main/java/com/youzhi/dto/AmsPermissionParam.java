package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author youzhi
 * @date 2020/3/30 13:23
 */
@Data
public class AmsPermissionParam {
    @ApiModelProperty(value = "权限父id")
    private Integer parentId;

    @ApiModelProperty(value = "权限名称",required = true)
    @NotEmpty(message = "权限名称不可为空")
    private String name;

    @ApiModelProperty(value = "权限描述")
    private String description;

    @ApiModelProperty(value = "权限类型",required = true)
    @NotNull(message = "权限类型不可为空")
    private Integer type;

    @ApiModelProperty(value = "权限值",required = true)
    @NotEmpty(message = "权限值不可为空")
    private String value;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "前端资源路径",required = true)
    @NotEmpty(message = "前端资源路径")
    private String uri;

    @ApiModelProperty(value = "排序")
    private Integer sort;


}
