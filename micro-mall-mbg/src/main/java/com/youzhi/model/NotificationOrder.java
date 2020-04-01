package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/01
*/
@Data
@Accessors(chain = true)
public class NotificationOrder implements Serializable {
    /**
     * 订单通知id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 订单通知标题
     *
     * @mbggenerated
     */
    private String title;

    /**
     * 订单通知内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 订单通知图片
     *
     * @mbggenerated
     */
    private String img;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * 订单id
     *
     * @mbggenerated
     */
    private Integer orderId;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", img=").append(img);
        sb.append(", createTime=").append(createTime);
        sb.append(", userId=").append(userId);
        sb.append(", orderId=").append(orderId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}