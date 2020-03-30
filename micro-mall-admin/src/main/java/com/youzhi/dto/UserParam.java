package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author youzhi
 * @date 2020/3/30 11:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserParam {
    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    @ApiModelProperty(value = "手机号码", required = true)
    private String telephone;

    @ApiModelProperty(value = "密码", required = true)
    private String loginPassword;

    @ApiModelProperty(value = "账号", required = true)
    private String account;
}
