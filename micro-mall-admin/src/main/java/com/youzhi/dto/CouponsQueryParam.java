package com.youzhi.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author youzhi
 * @date 2020/4/1 11:49
 */
@Data
public class CouponsQueryParam {

    /**
     * 优惠券类型1
     */
    private Integer useType;

    /**
     * 优惠券类型2
     */
    private Integer type;

    /**
     * 有效日期
     */
    private Date enableTime;
}
