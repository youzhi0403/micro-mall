package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/01/21
*/
@Data
@Accessors(chain = true)
public class UserLoginLog implements Serializable {
    /**
     * 用户登录日志id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * 登录城市
     *
     * @mbggenerated
     */
    private String city;

    /**
     * 登录类型：0->PC；1->android;2->ios;3->小程序
     *
     * @mbggenerated
     */
    private Integer loginType;

    /**
     * 登录省份
     *
     * @mbggenerated
     */
    private String province;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", ip=").append(ip);
        sb.append(", city=").append(city);
        sb.append(", loginType=").append(loginType);
        sb.append(", province=").append(province);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}