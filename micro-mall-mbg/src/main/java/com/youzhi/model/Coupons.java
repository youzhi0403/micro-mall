package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;

public class Coupons implements Serializable {
    /**
     * 优惠券id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 优惠券类型 1满减限品券 2满减不限品券 3邮费券
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 优惠券开始时间
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * 优惠券结束时间
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * 优惠券内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 优惠券金额
     *
     * @mbggenerated
     */
    private Integer money;

    /**
     * 优惠券满减金额
     *
     * @mbggenerated
     */
    private Integer fullReductionMoney;

    /**
     * 优惠券状态 1未领取 2已领取 3已使用
     *
     * @mbggenerated
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getFullReductionMoney() {
        return fullReductionMoney;
    }

    public void setFullReductionMoney(Integer fullReductionMoney) {
        this.fullReductionMoney = fullReductionMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", content=").append(content);
        sb.append(", money=").append(money);
        sb.append(", fullReductionMoney=").append(fullReductionMoney);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}