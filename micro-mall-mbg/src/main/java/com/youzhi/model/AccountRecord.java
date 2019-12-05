package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;

public class AccountRecord implements Serializable {
    /**
     * 支入支出明细id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 明细编号
     *
     * @mbggenerated
     */
    private String number;

    /**
     * 明细类型 1支出 2支入
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 金额
     *
     * @mbggenerated
     */
    private Integer money;

    /**
     * 类型名称
     *
     * @mbggenerated
     */
    private String typename;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", number=").append(number);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", money=").append(money);
        sb.append(", typename=").append(typename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}