package com.youzhi.model;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/03
*/
@Data
@Accessors(chain = true)
public class SmsCouponsClassificationRelation implements Serializable {
    /**
     * 优惠券商品类型表
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
     * 商品类型id
     *
     * @mbggenerated
     */
    private Integer classificationId;

    /**
     * 分类名称
     *
     * @mbggenerated
     */
    private String classificationName;

    /**
     * 父分类名称
     *
     * @mbggenerated
     */
    private String classificationParentName;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponsId=").append(couponsId);
        sb.append(", classificationId=").append(classificationId);
        sb.append(", classificationName=").append(classificationName);
        sb.append(", classificationParentName=").append(classificationParentName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}