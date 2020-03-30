package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/03/30
*/
@Data
@Accessors(chain = true)
public class Admin implements Serializable {
    /**
     * 后台管理员id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 登录账号
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 密码
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 头像
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * 邮箱
     *
     * @mbggenerated
     */
    private String email;

    /**
     * 昵称
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * 备注信息
     *
     * @mbggenerated
     */
    private String note;

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
    private Date udpateTime;

    /**
     * 更新人id
     *
     * @mbggenerated
     */
    private Integer updateAdminId;

    /**
     * 最后登录时间
     *
     * @mbggenerated
     */
    private Date loginTime;

    /**
     * 帐号启用状态：0->禁用；1->启用
     *
     * @mbggenerated
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", icon=").append(icon);
        sb.append(", email=").append(email);
        sb.append(", nickName=").append(nickName);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", createAdminId=").append(createAdminId);
        sb.append(", udpateTime=").append(udpateTime);
        sb.append(", updateAdminId=").append(updateAdminId);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}