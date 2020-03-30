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
public class Role implements Serializable {
    /**
     * 角色id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 角色名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 角色描述
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
     * 角色值
     *
     * @mbggenerated
     */
    private String value;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", createAdminId=").append(createAdminId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateAdminId=").append(updateAdminId);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}