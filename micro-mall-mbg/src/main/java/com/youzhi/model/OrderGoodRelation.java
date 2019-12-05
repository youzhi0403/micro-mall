package com.youzhi.model;

import java.io.Serializable;

public class OrderGoodRelation implements Serializable {
    /**
     * 关联表id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 订单id
     *
     * @mbggenerated
     */
    private Integer orderId;

    /**
     * 商品id
     *
     * @mbggenerated
     */
    private Integer goodId;

    /**
     * 商品件数
     *
     * @mbggenerated
     */
    private Integer goodNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodId=").append(goodId);
        sb.append(", goodNum=").append(goodNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}