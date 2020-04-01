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
public class AdminLoginLog implements Serializable {
    /**
     * 登录日志id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 登录人id
     *
     * @mbggenerated
     */
    private Integer adminId;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 登陆ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * 登陆地址
     *
     * @mbggenerated
     */
    private String address;

    /**
     * 浏览器登陆类型
     *
     * @mbggenerated
     */
    private String userAgent;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adminId=").append(adminId);
        sb.append(", createTime=").append(createTime);
        sb.append(", ip=").append(ip);
        sb.append(", address=").append(address);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}