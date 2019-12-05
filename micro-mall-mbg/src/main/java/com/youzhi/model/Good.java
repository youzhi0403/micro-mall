package com.youzhi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
    private String function;

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
    private String usage;

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
     * 商品状态 1正常 2无货 3下架
     *
     * @mbggenerated
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(String goodNumber) {
        this.goodNumber = goodNumber;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getUntowardEffect() {
        return untowardEffect;
    }

    public void setUntowardEffect(String untowardEffect) {
        this.untowardEffect = untowardEffect;
    }

    public String getTaboo() {
        return taboo;
    }

    public void setTaboo(String taboo) {
        this.taboo = taboo;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

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
        sb.append(", function=").append(function);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", goodNumber=").append(goodNumber);
        sb.append(", goodType=").append(goodType);
        sb.append(", approvalNumber=").append(approvalNumber);
        sb.append(", specification=").append(specification);
        sb.append(", usage=").append(usage);
        sb.append(", commonName=").append(commonName);
        sb.append(", untowardEffect=").append(untowardEffect);
        sb.append(", taboo=").append(taboo);
        sb.append(", inventory=").append(inventory);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}