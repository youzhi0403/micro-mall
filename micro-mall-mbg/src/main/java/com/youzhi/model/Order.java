package com.youzhi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/01
*/
@Data
@Accessors(chain = true)
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
     * 提交时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * 用户账号
     *
     * @mbggenerated
     */
    private String userAccount;

    /**
     * 订单总金额
     *
     * @mbggenerated
     */
    private BigDecimal totalAmount;

    /**
     * 应付金额(实际支付金额)
     *
     * @mbggenerated
     */
    private BigDecimal payAmount;

    /**
     * 运费金额
     *
     * @mbggenerated
     */
    private BigDecimal freightAmount;

    /**
     * 优惠券抵扣金额
     *
     * @mbggenerated
     */
    private BigDecimal couponsAmount;

    /**
     * 支付方式 0-未支付 1-支付宝 2-微信
     *
     * @mbggenerated
     */
    private Integer payType;

    /**
     * 订单来源 0-PC订单 1-app订单
     *
     * @mbggenerated
     */
    private Integer sourceType;

    /**
     * 订单状态 0-待付款 1-待发货 2-已发货 3-已完成 4-已关闭 5-已取消
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 订单类型 0-正常订单 1-秒杀订单
     *
     * @mbggenerated
     */
    private Integer orderType;

    /**
     * 物流公司(配送方式)
     *
     * @mbggenerated
     */
    private String deliveryCompany;

    /**
     * 物流单号
     *
     * @mbggenerated
     */
    private String deliveryNum;

    /**
     * 自动确认时间(天)
     *
     * @mbggenerated
     */
    private Integer autoConfirmDay;

    /**
     * 收货人姓名
     *
     * @mbggenerated
     */
    private String receiverName;

    /**
     * 收货人电话
     *
     * @mbggenerated
     */
    private String receiverPhone;

    /**
     * 收货人邮编
     *
     * @mbggenerated
     */
    private String receiverPostCode;

    /**
     * 省份
     *
     * @mbggenerated
     */
    private String receiverProvince;

    /**
     * 城市
     *
     * @mbggenerated
     */
    private String receiverCity;

    /**
     * 区域
     *
     * @mbggenerated
     */
    private String receiverRegion;

    /**
     * 详细地址
     *
     * @mbggenerated
     */
    private String receiverDetailAddress;

    /**
     * 订单备注
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 确认收货状态：0->未确认；1->已确认
     *
     * @mbggenerated
     */
    private Integer confirmStatus;

    /**
     * 删除状态：0->未删除；1->已删除
     *
     * @mbggenerated
     */
    private Integer deleteStatus;

    /**
     * 支付时间
     *
     * @mbggenerated
     */
    private Date paymentTime;

    /**
     * 发货时间
     *
     * @mbggenerated
     */
    private Date deliveryTime;

    /**
     * 确认收货时间
     *
     * @mbggenerated
     */
    private Date receiveTime;

    /**
     * 评价时间
     *
     * @mbggenerated
     */
    private Date commentTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", userId=").append(userId);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", freightAmount=").append(freightAmount);
        sb.append(", couponsAmount=").append(couponsAmount);
        sb.append(", payType=").append(payType);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", status=").append(status);
        sb.append(", orderType=").append(orderType);
        sb.append(", deliveryCompany=").append(deliveryCompany);
        sb.append(", deliveryNum=").append(deliveryNum);
        sb.append(", autoConfirmDay=").append(autoConfirmDay);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverPhone=").append(receiverPhone);
        sb.append(", receiverPostCode=").append(receiverPostCode);
        sb.append(", receiverProvince=").append(receiverProvince);
        sb.append(", receiverCity=").append(receiverCity);
        sb.append(", receiverRegion=").append(receiverRegion);
        sb.append(", receiverDetailAddress=").append(receiverDetailAddress);
        sb.append(", remark=").append(remark);
        sb.append(", confirmStatus=").append(confirmStatus);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", deliveryTime=").append(deliveryTime);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}