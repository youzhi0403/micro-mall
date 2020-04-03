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
public class UmsFeedback implements Serializable {
    /**
     * 意见反馈id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 意见反馈内容
     *
     * @mbggenerated
     */
    private String message;

    /**
     * 意见反馈图片
     *
     * @mbggenerated
     */
    private String imgs;

    /**
     * 反馈用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * 反馈时间
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
        sb.append(", message=").append(message);
        sb.append(", imgs=").append(imgs);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}