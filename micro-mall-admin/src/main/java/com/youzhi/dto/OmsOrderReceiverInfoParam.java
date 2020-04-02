package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author youzhi
 * @date 2020/4/2 9:39
 */
@Data
public class OmsOrderReceiverInfoParam {
    @ApiModelProperty(value = "商品名称",required = true)
    @NotNull(message = "订单id")
    private Integer id;

    @ApiModelProperty(value = "收货人姓名")
    @NotEmpty(message = "收货人姓名")
    private String receiverName;

    @ApiModelProperty(value = "收货人电话")
    @NotEmpty(message = "收货人电话")
    private String receiverPhone;

    @ApiModelProperty(value = "邮政编码")
    @NotEmpty(message = "邮政编码")
    private String receiverPostCode;

    @ApiModelProperty(value = "收货详细地址")
    @NotEmpty(message = "收货详细地址")
    private String receiverDetailAddress;

    @ApiModelProperty(value = "省份")
    @NotEmpty(message = "省份")
    private String receiverProvince;

    @ApiModelProperty(value = "城市")
    @NotEmpty(message = "城市")
    private String receiverCity;

    @ApiModelProperty(value = "区域")
    @NotEmpty(message = "区域")
    private String receiverRegion;

    @ApiModelProperty(value = "订单状态")
    @NotNull(message = "订单状态")
    private Integer status;
}
