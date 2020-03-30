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
public class User implements Serializable {
    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 用户头像
     *
     * @mbggenerated
     */
    private String avatar;

    /**
     * 用户昵称
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * 手机号
     *
     * @mbggenerated
     */
    private String telephone;

    /**
     * 登陆密码
     *
     * @mbggenerated
     */
    private String loginPassword;

    /**
     * 支付密码
     *
     * @mbggenerated
     */
    private String payPassword;

    /**
     * 账号
     *
     * @mbggenerated
     */
    private String account;

    /**
     * 余额
     *
     * @mbggenerated
     */
    private Integer balance;

    /**
     * 注册时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 0-未删除 1-删除
     *
     * @mbggenerated
     */
    private Integer deleteStatus;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", avatar=").append(avatar);
        sb.append(", nickname=").append(nickname);
        sb.append(", telephone=").append(telephone);
        sb.append(", loginPassword=").append(loginPassword);
        sb.append(", payPassword=").append(payPassword);
        sb.append(", account=").append(account);
        sb.append(", balance=").append(balance);
        sb.append(", createTime=").append(createTime);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}