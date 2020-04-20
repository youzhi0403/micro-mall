package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/19
*/
@Data
@Accessors(chain = true)
public class OmsOrderReturnReason implements Serializable {
    /**
     * 退货原因id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 退货类型
     *
     * @mbggenerated
     */
    private String name;

    private Integer sort;

    /**
     * 状态：0->不启用；1->启用
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 添加时间
     *
     * @mbggenerated
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}