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
public class GmsClassification implements Serializable {
    /**
     * 分类id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 分类名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 所属级别
     *
     * @mbggenerated
     */
    private Integer level;

    /**
     * 父id
     *
     * @mbggenerated
     */
    private Integer parentId;

    /**
     * 分类的种类 0正常分类 1身体部位分类 2科室分类
     *
     * @mbggenerated
     */
    private Integer kind;

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
    private Integer createAdminId;

    /**
     * 修改人id
     *
     * @mbggenerated
     */
    private Integer updateAdminId;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", parentId=").append(parentId);
        sb.append(", kind=").append(kind);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createAdminId=").append(createAdminId);
        sb.append(", updateAdminId=").append(updateAdminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}