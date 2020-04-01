package com.youzhi.dto;

import com.youzhi.model.Coupons;
import com.youzhi.model.CouponsHistory;
import lombok.Data;

/**
 * @author youzhi
 * @date 2020/4/1 15:44
 */
@Data
public class CouponsHistoryVo extends CouponsHistory {
    private Coupons coupons;
}
