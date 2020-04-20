package com.youzhi.model;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/19
*/
@Data
@Accessors(chain = true)
public class OmsCompanyAddress implements Serializable {
    /**
     * 公司地址id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 地址名称
     *
     * @mbggenerated
     */
    private String addressName;

    /**
     * 默认发货地址 0-否 1-是
     *
     * @mbggenerated
     */
    private Integer sendStatus;

    /**
     * 是否为默认收货地址 0-否 1-是
     *
     * @mbggenerated
     */
    private Integer receiveStatus;

    /**
     * 收发货人姓名
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 收货人电话
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * 省/直辖市
     *
     * @mbggenerated
     */
    private String province;

    /**
     * 市
     *
     * @mbggenerated
     */
    private String city;

    /**
     * 区
     *
     * @mbggenerated
     */
    private String region;

    /**
     * 详细地址
     *
     * @mbggenerated
     */
    private String detailAddress;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", addressName=").append(addressName);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", receiveStatus=").append(receiveStatus);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}