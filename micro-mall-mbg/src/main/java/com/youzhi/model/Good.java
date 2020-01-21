package com.youzhi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 created by mybatis generator 2020/01/21
*/
@Data
@Accessors(chain = true)
public class Good implements Serializable {
    /**
     * 商品id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 商品名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 商品全称
     *
     * @mbggenerated
     */
    private String fullName;

    /**
     * 图片
     *
     * @mbggenerated
     */
    private String imgs;

    /**
     * 价格
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * 销量
     *
     * @mbggenerated
     */
    private Integer sales;

    /**
     * 功能主治
     *
     * @mbggenerated
     */
    private String goodFunction;

    /**
     * 生产厂家
     *
     * @mbggenerated
     */
    private String manufacturer;

    /**
     * 商品编号
     *
     * @mbggenerated
     */
    private String goodNumber;

    /**
     * 商品类型
     *
     * @mbggenerated
     */
    private String goodType;

    /**
     * 批准文号
     *
     * @mbggenerated
     */
    private String approvalNumber;

    /**
     * 产品规格
     *
     * @mbggenerated
     */
    private String specification;

    /**
     * 用法用量
     *
     * @mbggenerated
     */
    private String goodUsage;

    /**
     * 通用名称
     *
     * @mbggenerated
     */
    private String commonName;

    /**
     * 不良反应
     *
     * @mbggenerated
     */
    private String untowardEffect;

    /**
     * 禁忌
     *
     * @mbggenerated
     */
    private String taboo;

    /**
     * 库存
     *
     * @mbggenerated
     */
    private Integer inventory;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建人id
     *
     * @mbggenerated
     */
    private Integer createUserId;

    /**
     * 更新人id
     *
     * @mbggenerated
     */
    private Integer updateUserId;

    /**
     * 商品状态 1-正常 2-无货 3-下架
     *
     * @mbggenerated
     */
    private Integer status;

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
        sb.append(", name=").append(name);
        sb.append(", fullName=").append(fullName);
        sb.append(", imgs=").append(imgs);
        sb.append(", price=").append(price);
        sb.append(", sales=").append(sales);
        sb.append(", goodFunction=").append(goodFunction);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", goodNumber=").append(goodNumber);
        sb.append(", goodType=").append(goodType);
        sb.append(", approvalNumber=").append(approvalNumber);
        sb.append(", specification=").append(specification);
        sb.append(", goodUsage=").append(goodUsage);
        sb.append(", commonName=").append(commonName);
        sb.append(", untowardEffect=").append(untowardEffect);
        sb.append(", taboo=").append(taboo);
        sb.append(", inventory=").append(inventory);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", status=").append(status);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}