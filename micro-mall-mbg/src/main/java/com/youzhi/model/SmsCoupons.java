package com.youzhi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/04/19
*/
@Data
@Accessors(chain = true)
public class SmsCoupons implements Serializable {
    /**
     * 优惠券id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 优惠券类型 0-全场通用 1-指定分类 2-指定商品 3-邮费券
     *
     * @mbggenerated
     */
    private Integer useType;

    /**
     * 优惠券开始时间
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * 优惠券结束时间
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * 优惠券内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 优惠券金额
     *
     * @mbggenerated
     */
    private BigDecimal money;

    /**
     * 优惠券满减金额
     *
     * @mbggenerated
     */
    private BigDecimal fullReductionMoney;

    /**
     * 使用平台 0-全部 1-移动 2-PC
     *
     * @mbggenerated
     */
    private Integer platform;

    /**
     * 每人限领张数
     *
     * @mbggenerated
     */
    private Integer perLimit;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 可领取日期
     *
     * @mbggenerated
     */
    private Date enableTime;

    /**
     * 优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 发行数量
     *
     * @mbggenerated
     */
    private Integer publishCount;

    /**
     * 已使用数量
     *
     * @mbggenerated
     */
    private Integer useCount;

    /**
     * 领取数量
     *
     * @mbggenerated
     */
    private Integer receiveCount;

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

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", useType=").append(useType);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", content=").append(content);
        sb.append(", money=").append(money);
        sb.append(", fullReductionMoney=").append(fullReductionMoney);
        sb.append(", platform=").append(platform);
        sb.append(", perLimit=").append(perLimit);
        sb.append(", remark=").append(remark);
        sb.append(", enableTime=").append(enableTime);
        sb.append(", type=").append(type);
        sb.append(", publishCount=").append(publishCount);
        sb.append(", useCount=").append(useCount);
        sb.append(", receiveCount=").append(receiveCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", createAdminId=").append(createAdminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}