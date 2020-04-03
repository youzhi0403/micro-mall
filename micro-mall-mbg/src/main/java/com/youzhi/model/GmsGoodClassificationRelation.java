package com.youzhi.model;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/03
*/
@Data
@Accessors(chain = true)
public class GmsGoodClassificationRelation implements Serializable {
    /**
     * 关联表主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 商品id
     *
     * @mbggenerated
     */
    private Integer goodId;

    /**
     * 分类id
     *
     * @mbggenerated
     */
    private Integer classificationId;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodId=").append(goodId);
        sb.append(", classificationId=").append(classificationId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}