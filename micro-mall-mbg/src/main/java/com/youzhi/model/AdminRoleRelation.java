package com.youzhi.model;

import java.io.Serializable;

public class AdminRoleRelation implements Serializable {
    /**
     * 关联表id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 角色id
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * 管理员id
     *
     * @mbggenerated
     */
    private Integer adminId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", adminId=").append(adminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}