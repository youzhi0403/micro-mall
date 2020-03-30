package com.youzhi.model;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/03/30
*/
@Data
@Accessors(chain = true)
public class CouponsGoodRelation implements Serializable {
    /**
     * 关联表id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 优惠券id
     *
     * @mbggenerated
     */
    private Integer couponsId;

    /**
     * 优惠券可使用商品id
     *
     * @mbggenerated
     */
    private Integer goodId;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponsId=").append(couponsId);
        sb.append(", goodId=").append(goodId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}