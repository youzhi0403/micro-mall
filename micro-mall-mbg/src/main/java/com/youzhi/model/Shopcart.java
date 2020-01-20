package com.youzhi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/01/20
*/
@Data
@Accessors(chain = true)
public class Shopcart implements Serializable {
    /**
     * 购物车id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * 购物车总件数
     *
     * @mbggenerated
     */
    private Integer totalNum;

    /**
     * 购物车总价格
     *
     * @mbggenerated
     */
    private BigDecimal totalPrice;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}