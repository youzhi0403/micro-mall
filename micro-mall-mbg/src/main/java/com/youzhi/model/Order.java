package com.youzhi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    /**
     * 订单id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 订单编号
     *
     * @mbggenerated
     */
    private String orderNum;

    /**
     * 订单状态 1待付款 2待发货 3待收货 4已完成 5已取消(未付款)
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 商品总件数
     *
     * @mbggenerated
     */
    private Integer totalNum;

    /**
     * 商品总价格
     *
     * @mbggenerated
     */
    private BigDecimal totalPrice;

    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * 送配地址id
     *
     * @mbggenerated
     */
    private Integer addressId;

    /**
     * 订单创建时间(下单时间)
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 订单付款时间
     *
     * @mbggenerated
     */
    private Date payTime;

    /**
     * 订单发货时间
     *
     * @mbggenerated
     */
    private Date deliveryTime;

    /**
     * 订单完成时间(确定收货时间/订单取消时间)
     *
     * @mbggenerated
     */
    private Date finishTime;

    /**
     * 配送方式 1普通快递  2上门取货
     *
     * @mbggenerated
     */
    private Integer dispatchWay;

    /**
     * 会员积分
     *
     * @mbggenerated
     */
    private Integer memberIntegral;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getDispatchWay() {
        return dispatchWay;
    }

    public void setDispatchWay(Integer dispatchWay) {
        this.dispatchWay = dispatchWay;
    }

    public Integer getMemberIntegral() {
        return memberIntegral;
    }

    public void setMemberIntegral(Integer memberIntegral) {
        this.memberIntegral = memberIntegral;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", status=").append(status);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", userId=").append(userId);
        sb.append(", addressId=").append(addressId);
        sb.append(", createTime=").append(createTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", deliveryTime=").append(deliveryTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", dispatchWay=").append(dispatchWay);
        sb.append(", memberIntegral=").append(memberIntegral);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}