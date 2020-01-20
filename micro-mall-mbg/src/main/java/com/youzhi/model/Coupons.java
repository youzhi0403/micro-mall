package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/01/20
*/
@Data
@Accessors(chain = true)
public class Coupons implements Serializable {
    /**
     * 优惠券id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 优惠券类型 1满减限品券 2满减不限品券 3邮费券
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 优惠券开始时间
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * 优惠券结束时间
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * 优惠券内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 优惠券金额
     *
     * @mbggenerated
     */
    private Integer money;

    /**
     * 优惠券满减金额
     *
     * @mbggenerated
     */
    private Integer fullReductionMoney;

    /**
     * 优惠券状态 1未领取 2已领取 3已使用
     *
     * @mbggenerated
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", content=").append(content);
        sb.append(", money=").append(money);
        sb.append(", fullReductionMoney=").append(fullReductionMoney);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}