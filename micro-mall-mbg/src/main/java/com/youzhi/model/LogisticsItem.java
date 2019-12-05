package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

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