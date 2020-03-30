package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author youzhi
 * @date 2020/3/30 10:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AdminQueryParam {

    @ApiModelProperty("登录账号")
    private String username;

    @ApiModelProperty("昵称")
    private String nickname;

}
