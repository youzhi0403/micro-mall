package com.youzhi.dto;

import com.youzhi.model.SmsCouponsClassificationRelation;
import com.youzhi.model.SmsCouponsGoodRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsCouponsParam {
    @ApiModelProperty(value = "优惠券类型(0-全场通用 1-指定分类 2-指定商品 3-邮费券)",required = true)
    @NotNull(message = "优惠券类型(0-全场通用 1-指定分类 2-指定商品 3-邮费券)不可为空")
    private Integer useType;

    @ApiModelProperty(value = "优惠券开始时间",required = true)
    @NotNull(message = "优惠券开始时间不能为空")
    private Date startTime;

    @ApiModelProperty(value = "优惠券结束时间",required = true)
    @NotNull(message = "优惠券结束时间不能为空")
    private Date endTime;

    @ApiModelProperty(value = "优惠券内容",required = true)
    @NotEmpty(message = "优惠券内容不能为空")
    private String content;

    @ApiModelProperty(value = "优惠券金额",required = true)
    @NotNull(message = "优惠券金额不能为空")
    private BigDecimal money;

    @ApiModelProperty(value = "优惠券满减金额",required = true)
    @NotNull(message = "优惠券满减金额不能为空")
    private BigDecimal fullReductionMoney;

    @ApiModelProperty(value = "使用平台",required = true)
    @NotNull(message = "使用平台不能为空")
    private Integer platform;

    @ApiModelProperty(value = "每人限领张数",required = true)
    @NotNull(message = "每人限领张数不能为空")
    private Integer perLimit;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "可领取日期",required = true)
    @NotNull(message = "可领取日期不能为空")
    private Date enableTime;

    @ApiModelProperty(value = "优惠券类型(0-全场赠券 1-会员赠券 2-购物赠券 3-注册赠券)",required = true)
    @NotNull(message = "优惠券类型(0-全场赠券 1-会员赠券 2-购物赠券 3-注册赠券)不能为空")
    private Integer type;

    @ApiModelProperty(value = "发行数量",required = true)
    @NotNull(message = "发行数量不能为空")
    private Integer publishCount;

    @ApiModelProperty(value = "可使用优惠券商品")
    List<SmsCouponsGoodRelation> couponsGoodRelationList;

    @ApiModelProperty(value = "可使用优惠券商品类型")
    List<SmsCouponsClassificationRelation> couponsClassificationRelationList;
}
