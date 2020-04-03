package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author youzhi
 * @date 2020/4/3 9:54
 */
@Data
public class OmsOrderReturnApplyParam {
    @ApiModelProperty("服务单号")
    private Integer id;

    @ApiModelProperty("收货地址关联id")
    private Integer companyAddressId;

    @ApiModelProperty("确认退款金额")
    private BigDecimal returnAmount;

    @ApiModelProperty("处理备注")
    private String handleRemark;

    @ApiModelProperty("处理人")
    private String handleMan;

    @ApiModelProperty("收货备注")
    private String receiveRemark;

    @ApiModelProperty("收货人")
    private String receiveMan;

    @ApiModelProperty("申请状态：1->退货中；2->已完成；3->已拒绝")
    private Integer status;
}
