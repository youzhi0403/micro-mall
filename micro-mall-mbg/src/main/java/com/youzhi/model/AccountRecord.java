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
public class AccountRecord implements Serializable {
    /**
     * 支入支出明细id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 明细编号
     *
     * @mbggenerated
     */
    private String number;

    /**
     * 明细类型 1支出 2支入
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 金额
     *
     * @mbggenerated
     */
    private Integer money;

    /**
     * 类型名称
     *
     * @mbggenerated
     */
    private String typeName;

    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Integer userId;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", number=").append(number);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", money=").append(money);
        sb.append(", typeName=").append(typeName);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}