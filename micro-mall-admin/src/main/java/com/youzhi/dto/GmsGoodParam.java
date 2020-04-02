package com.youzhi.dto;

import com.youzhi.model.GmsClassification;
import com.youzhi.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 14:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GmsGoodParam {
    @ApiModelProperty(value = "商品名称",required = true)
    @NotEmpty(message = "名称不能为空")
    private String name;

    @ApiModelProperty(value = "商品全称")
    private String fullName;

    @ApiModelProperty(value = "商品图片集")
    private String imgs;

    @ApiModelProperty(value = "商品价格")
    private BigDecimal price;

    @ApiModelProperty(value = "功能主治")
    private String function;

    @ApiModelProperty(value = "生产厂家")
    private String manufacturer;

    @ApiModelProperty(value = "商品编号")
    private String goodNumber;

    @ApiModelProperty(value = "商品类型")
    private String goodType;

    @ApiModelProperty(value = "批准文号")
    private String approvalNumber;

    @ApiModelProperty(value = "产品规格")
    private String specification;

    @ApiModelProperty(value = "用法用量")
    private String usage;

    @ApiModelProperty(value = "通用名称")
    private String commonName;

    @ApiModelProperty(value = "不良反应")
    private String untowardEffect;

    @ApiModelProperty(value = "禁忌")
    private String taboo;

    @ApiModelProperty(value = "商品状态")
    @FlagValidator(value = {"1","2","3"},message = "商品状态错误 1-正常 2-无货 3-下架")
    private Integer status;

    @ApiModelProperty(value = "商品分类")
    private List<GmsClassification> classificationList;

}
