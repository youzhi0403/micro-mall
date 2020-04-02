package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author youzhi
 * @date 2020/3/31 15:40
 */
@Data
public class OmsOrderQueryParam {
    @ApiModelProperty("订单创建时间")
    private Date createTime;

    @ApiModelProperty("账户")
    private String account;

    @ApiModelProperty("订单状态")
    private Integer status;
}
