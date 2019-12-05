package com.youzhi.model;

import java.io.Serializable;

public class Address implements Serializable {
    /**
     * 地址id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 地址收件人名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 手机号码
     *
     * @mbggenerated
     */
    private String telephone;

    /**
     * 具体地址
     *
     * @mbggenerated
     */
    private String addressInfo;

    /**
     * 是否为默认地址 1默认 2非默认
     *
     * @mbggenerated
     */
    private Integer isDefault;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", telephone=").append(telephone);
        sb.append(", addressInfo=").append(addressInfo);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}