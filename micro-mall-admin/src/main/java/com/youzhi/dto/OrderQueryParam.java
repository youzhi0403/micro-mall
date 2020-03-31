package com.youzhi.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author youzhi
 * @date 2020/3/31 15:40
 */
@Data
public class OrderQueryParam {
    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 账户
     */
    private String account;

    /**
     * 订单状态
     */
    private Integer status;
}
