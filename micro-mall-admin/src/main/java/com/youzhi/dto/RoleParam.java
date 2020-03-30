package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author youzhi
 * @date 2020/3/30 14:14
 */
@Data
public class RoleParam {
    @ApiModelProperty(value = "角色名称",required = true)
    @NotEmpty(message = "角色名称不可为空")
    private String name;

    @ApiModelProperty(value = "角色描述")
    private String description;

}
