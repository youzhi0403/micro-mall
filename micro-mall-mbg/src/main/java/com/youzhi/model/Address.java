package com.youzhi.model;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/01/21
*/
@Data
@Accessors(chain = true)
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