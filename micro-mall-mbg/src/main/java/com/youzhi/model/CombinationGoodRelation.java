package com.youzhi.model;

import java.io.Serializable;

public class CombinationGoodRelation implements Serializable {
    /**
     * 关联表id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 商品id
     *
     * @mbggenerated
     */
    private Integer goodId;

    /**
     * 商品数量
     *
     * @mbggenerated
     */
    private Integer goodNum;

    /**
     * 组合套餐id
     *
     * @mbggenerated
     */
    private Integer combinationId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public Integer getCombinationId() {
        return combinationId;
    }

    public void setCombinationId(Integer combinationId) {
        this.combinationId = combinationId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodId=").append(goodId);
        sb.append(", goodNum=").append(goodNum);
        sb.append(", combinationId=").append(combinationId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}