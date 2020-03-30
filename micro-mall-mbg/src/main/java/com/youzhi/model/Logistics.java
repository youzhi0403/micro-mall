package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/03/30
*/
@Data
@Accessors(chain = true)
public class Logistics implements Serializable {
    /**
     * 物流id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 物流公司名称
     *
     * @mbggenerated
     */
    private String companyName;

    /**
     * 快递单号
     *
     * @mbggenerated
     */
    private String trackingNumber;

    /**
     * 订单的物流状态
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 订单id
     *
     * @mbggenerated
     */
    private Integer orderId;

    /**
     * 创建时间
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
        sb.append(", companyName=").append(companyName);
        sb.append(", trackingNumber=").append(trackingNumber);
        sb.append(", status=").append(status);
        sb.append(", orderId=").append(orderId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}