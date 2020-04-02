package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author youzhi
 * @date 2020/4/1 11:49
 */
@Data
public class SmsCouponsQueryParam {

    /**
     * 优惠券类型1
     */
    @ApiModelProperty("优惠券类型 0-全场通用 1-指定分类 2-指定商品 3-邮费券")
    private Integer useType;

    /**
     * 优惠券类型2
     */
    @ApiModelProperty("优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
    private Integer type;

    /**
     * 有效日期
     */
    @ApiModelProperty("有效时间")
    private Date enableTime;
}
