package com.youzhi.model;

import java.io.Serializable;

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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}