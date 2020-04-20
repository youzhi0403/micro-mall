package com.youzhi.model;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/19
*/
@Data
@Accessors(chain = true)
public class OmsOrderSetting implements Serializable {
    /**
     * 订单设置id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 正常订单超时时间(分)
     *
     * @mbggenerated
     */
    private Integer normalOrderOvertime;

    /**
     * 发货后自动确认收货时间（天）
     *
     * @mbggenerated
     */
    private Integer confirmOvertime;

    /**
     * 自动完成交易时间，不能申请售后（天）
     *
     * @mbggenerated
     */
    private Integer finishOvertime;

    /**
     * 订单完成后自动好评时间（天）
     *
     * @mbggenerated
     */
    private Integer commentOvertime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", normalOrderOvertime=").append(normalOrderOvertime);
        sb.append(", confirmOvertime=").append(confirmOvertime);
        sb.append(", finishOvertime=").append(finishOvertime);
        sb.append(", commentOvertime=").append(commentOvertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}