package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/19
*/
@Data
@Accessors(chain = true)
public class UmsBankCard implements Serializable {
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

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

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
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}