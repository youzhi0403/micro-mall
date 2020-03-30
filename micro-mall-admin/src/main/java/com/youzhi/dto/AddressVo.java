package com.youzhi.dto;

import com.youzhi.model.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author youzhi
 * @date 2020/3/28 13:37
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AddressVo extends Address {
    private String account;

    private String nickname;
}
