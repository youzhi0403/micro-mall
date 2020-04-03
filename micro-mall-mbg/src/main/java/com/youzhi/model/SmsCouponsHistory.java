package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/03
*/
@Data
@Accessors(chain = true)
public class SmsCouponsHistory implements Serializable {
    /**
     * 优惠券使用记录表id
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
     * 用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * 领取人昵称
     *
     * @mbggenerated
     */
    private String userNickname;

    /**
     * 获取类型 0-后台赠送 1-主动获取
     *
     * @mbggenerated
     */
    private Integer getType;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 使用状态 0-未使用 1-已使用 2-已过期
     *
     * @mbggenerated
     */
    private Integer useStatus;

    /**
     * 使用时间
     *
     * @mbggenerated
     */
    private Date useTime;

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

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponsId=").append(couponsId);
        sb.append(", userId=").append(userId);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", getType=").append(getType);
        sb.append(", createTime=").append(createTime);
        sb.append(", useStatus=").append(useStatus);
        sb.append(", useTime=").append(useTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}