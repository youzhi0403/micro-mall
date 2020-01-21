package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/01/21
*/
@Data
@Accessors(chain = true)
public class LogisticsItem implements Serializable {
    /**
     * 物流子项id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 物流id
     *
     * @mbggenerated
     */
    private Integer logisticsId;

    /**
     * 子项创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 物流子项标题
     *
     * @mbggenerated
     */
    private String title;

    /**
     * 物流子项内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 物流子项类型 1已下单 2已发货 3运输中 4派件中 5已签收 6普通子项
     *
     * @mbggenerated
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logisticsId=").append(logisticsId);
        sb.append(", createTime=").append(createTime);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}