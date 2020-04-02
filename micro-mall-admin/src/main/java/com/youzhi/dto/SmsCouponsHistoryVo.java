package com.youzhi.dto;

import com.youzhi.model.*;
import lombok.Data;

/**
 * @author youzhi
 * @date 2020/4/1 15:44
 */
@Data
public class SmsCouponsHistoryVo extends SmsCouponsHistory {
    private SmsCoupons coupons;
}
