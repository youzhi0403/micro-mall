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
public class Notification implements Serializable {
    /**
     * 活动id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 活动标题
     *
     * @mbggenerated
     */
    private String title;

    /**
     * 活动内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 活动图片
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
     * 创建人id
     *
     * @mbggenerated
     */
    private Integer createAdminId;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 更新人id
     *
     * @mbggenerated
     */
    private Integer updateAdminId;

    /**
     * 活动状态 1正在进行 2活动结束
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 通知类型 1优惠促销通知 2系统通知
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
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", img=").append(img);
        sb.append(", createTime=").append(createTime);
        sb.append(", createAdminId=").append(createAdminId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateAdminId=").append(updateAdminId);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}