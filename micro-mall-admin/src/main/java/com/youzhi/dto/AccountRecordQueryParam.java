package com.youzhi.dto;

import com.youzhi.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @author youzhi
 * @date 2020/3/24 16:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountRecordQueryParam {
    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "创建时间")
    private String createTime;


}
