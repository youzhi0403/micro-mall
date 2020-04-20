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
public class OmsOrderOperateHistory implements Serializable {
    /**
     * 订单操作记录id
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
     * 操作人 用户/系统/后台管理员
     *
     * @mbggenerated
     */
    private String operateMan;

    /**
     * 操作时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->已取消
     *
     * @mbggenerated
     */
    private Integer orderStatus;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", createTime=").append(createTime);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}