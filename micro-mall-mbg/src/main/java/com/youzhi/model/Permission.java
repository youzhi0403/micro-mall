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
    private Integer createAdminId;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 更新人id
     *
     * @mbggenerated
     */
    private Integer updateAdminId;

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
        sb.append(", createAdminId=").append(createAdminId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateAdminId=").append(updateAdminId);
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