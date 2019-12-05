package com.youzhi.model;

import java.io.Serializable;

public class Logistics implements Serializable {
    /**
     * 物流id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 物流公司名称
     *
     * @mbggenerated
     */
    private String companyName;

    /**
     * 快递单号
     *
     * @mbggenerated
     */
    private String trackingNumber;

    /**
     * 订单的物流状态
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 订单id
     *
     * @mbggenerated
     */
    private Integer orderId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyName=").append(companyName);
        sb.append(", trackingNumber=").append(trackingNumber);
        sb.append(", status=").append(status);
        sb.append(", orderId=").append(orderId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}