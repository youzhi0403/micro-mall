package com.youzhi.model;

import java.io.Serializable;

public class Feedback implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}