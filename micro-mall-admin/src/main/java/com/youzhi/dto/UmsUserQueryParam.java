package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author youzhi
 * @date 2020/3/30 11:21
 */
@Data
public class UmsUserQueryParam {
    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("手机号码")
    private String telephone;

    @ApiModelProperty("用户昵称")
    private String nickname;

    @ApiModelProperty("是否禁用")
    private Integer deleteStatus;
}
