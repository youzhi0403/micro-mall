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
public class Combination implements Serializable {
    /**
     * 组合套餐id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 组合套餐名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 价格
     *
     * @mbggenerated
     */
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}