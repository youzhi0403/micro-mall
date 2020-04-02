package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author youzhi
 * @date 2020/4/2 9:59
 */
@Data
public class OmsOrderDeliveryParam {
    @ApiModelProperty("订单id")
    private Integer orderId;
    @ApiModelProperty("物流公司")
    private String deliveryCompany;
    @ApiModelProperty("物流单号")
    private String deliverySn;
}
