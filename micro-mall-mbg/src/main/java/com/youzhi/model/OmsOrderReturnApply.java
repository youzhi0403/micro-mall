package com.youzhi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/03
*/
@Data
@Accessors(chain = true)
public class OmsOrderReturnApply implements Serializable {
    /**
     * 退货订单id
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
     * 订单编号
     *
     * @mbggenerated
     */
    private String orderNum;

    /**
     * 收货地址表id
     *
     * @mbggenerated
     */
    private Integer companyAddressId;

    /**
     * 退货商品id
     *
     * @mbggenerated
     */
    private Integer goodId;

    /**
     * 申请时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 用户昵称
     *
     * @mbggenerated
     */
    private String userNickname;

    /**
     * 退款金额
     *
     * @mbggenerated
     */
    private BigDecimal returnAmount;

    /**
     * 退货人姓名
     *
     * @mbggenerated
     */
    private String returnName;

    /**
     * 退货人电话
     *
     * @mbggenerated
     */
    private String returnPhone;

    /**
     * 申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 处理人
     *
     * @mbggenerated
     */
    private String handleMan;

    /**
     * 处理时间
     *
     * @mbggenerated
     */
    private Date handleTime;

    /**
     * 商品图片
     *
     * @mbggenerated
     */
    private String goodPic;

    /**
     * 商品名称
     *
     * @mbggenerated
     */
    private String goodName;

    /**
     * 退货数量
     *
     * @mbggenerated
     */
    private Integer goodCount;

    /**
     * 商品单价
     *
     * @mbggenerated
     */
    private BigDecimal goodPrice;

    /**
     * 商品实际支付单价
     *
     * @mbggenerated
     */
    private BigDecimal goodRealPrice;

    /**
     * 原因
     *
     * @mbggenerated
     */
    private String reason;

    /**
     * 描述
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 凭证图片，以逗号隔开
     *
     * @mbggenerated
     */
    private String proofPics;

    /**
     * 处理备注
     *
     * @mbggenerated
     */
    private String handleRemark;

    /**
     * 收货人
     *
     * @mbggenerated
     */
    private String receiveMan;

    /**
     * 收货时间
     *
     * @mbggenerated
     */
    private Date receiveTime;

    /**
     * 收货备注
     *
     * @mbggenerated
     */
    private String receiveRemark;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", companyAddressId=").append(companyAddressId);
        sb.append(", goodId=").append(goodId);
        sb.append(", createTime=").append(createTime);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", returnAmount=").append(returnAmount);
        sb.append(", returnName=").append(returnName);
        sb.append(", returnPhone=").append(returnPhone);
        sb.append(", status=").append(status);
        sb.append(", handleMan=").append(handleMan);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", goodPic=").append(goodPic);
        sb.append(", goodName=").append(goodName);
        sb.append(", goodCount=").append(goodCount);
        sb.append(", goodPrice=").append(goodPrice);
        sb.append(", goodRealPrice=").append(goodRealPrice);
        sb.append(", reason=").append(reason);
        sb.append(", description=").append(description);
        sb.append(", proofPics=").append(proofPics);
        sb.append(", handleRemark=").append(handleRemark);
        sb.append(", receiveMan=").append(receiveMan);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", receiveRemark=").append(receiveRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}