package com.youzhi.model;

import java.io.Serializable;
import java.util.Date;

public class Permission implements Serializable {
    /**
     * 权限id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 权限父id
     *
     * @mbggenerated
     */
    private Integer parentId;

    /**
     * 权限名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 权限描述
     *
     * @mbggenerated
     */
    private String description;

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
    private Integer createUserId;

    /**
     * 所处层级
     *
     * @mbggenerated
     */
    private Integer level;

    /**
     * 权限类型 1目录 2菜单 3功能
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 权限值
     *
     * @mbggenerated
     */
    private String value;

    /**
     * 图标
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * 前端资源路径
     *
     * @mbggenerated
     */
    private String uri;

    /**
     * 排序
     *
     * @mbggenerated
     */
    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", level=").append(level);
        sb.append(", type=").append(type);
        sb.append(", value=").append(value);
        sb.append(", icon=").append(icon);
        sb.append(", uri=").append(uri);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}