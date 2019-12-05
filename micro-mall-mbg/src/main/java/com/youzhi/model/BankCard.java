package com.youzhi.model;

import java.io.Serializable;

public class BankCard implements Serializable {
    /**
     * 银行卡id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 用户名
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 卡号
     *
     * @mbggenerated
     */
    private String cardNumber;

    /**
     * 银行名称
     *
     * @mbggenerated
     */
    private String bank;

    /**
     * 支行名称
     *
     * @mbggenerated
     */
    private String subBranchBank;

    /**
     * 手机号码
     *
     * @mbggenerated
     */
    private String telephone;

    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getSubBranchBank() {
        return subBranchBank;
    }

    public void setSubBranchBank(String subBranchBank) {
        this.subBranchBank = subBranchBank;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", bank=").append(bank);
        sb.append(", subBranchBank=").append(subBranchBank);
        sb.append(", telephone=").append(telephone);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}