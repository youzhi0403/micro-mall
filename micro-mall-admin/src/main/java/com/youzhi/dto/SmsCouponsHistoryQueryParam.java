package com.youzhi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author youzhi
 * @date 2020/4/1 15:40
 */
@Data
public class SmsCouponsHistoryQueryParam {
    @ApiModelProperty("分类的种类")
    private Integer couponsId;

    @ApiModelProperty("用户昵称")
    private String userNickname;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("优惠券类型 0-全场通用 1-指定分类 2-指定商品 3-邮费券")
    private Integer useType;
}
