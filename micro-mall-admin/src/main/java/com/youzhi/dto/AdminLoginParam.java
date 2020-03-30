package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;


/**
 * @author cwj
 * @date 2020/1/6 10:28
 * 用户登录参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminLoginParam {
    @ApiModelProperty(value = "用户名")
    @NotEmpty(message = "用户名不为空")
    private String username;

    @ApiModelProperty(value = "密码")
    @NotEmpty(message = "密码不能为空")
    private String password;
}
