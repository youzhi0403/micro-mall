package com.youzhi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/03
*/
@Data
@Accessors(chain = true)
public class OmsOrderItem implements Serializable {
    /**
     * 订单子项id
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
     * 商品id
     *
     * @mbggenerated
     */
    private Integer goodId;

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
     * 销售价格
     *
     * @mbggenerated
     */
    private BigDecimal goodPrice;

    /**
     * 购买数量
     *
     * @mbggenerated
     */
    private Integer goodQuantity;

    /**
     * 优惠券优惠分解金额
     *
     * @mbggenerated
     */
    private BigDecimal couponsAmount;

    /**
     * 该商品经过优惠后的分解金额
     *
     * @mbggenerated
     */
    private BigDecimal realAmount;

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
        sb.append(", goodId=").append(goodId);
        sb.append(", goodPic=").append(goodPic);
        sb.append(", goodName=").append(goodName);
        sb.append(", goodPrice=").append(goodPrice);
        sb.append(", goodQuantity=").append(goodQuantity);
        sb.append(", couponsAmount=").append(couponsAmount);
        sb.append(", realAmount=").append(realAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}