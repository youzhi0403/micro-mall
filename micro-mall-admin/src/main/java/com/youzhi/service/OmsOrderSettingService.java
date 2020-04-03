package com.youzhi.service;

import com.youzhi.model.OmsOrderSetting;

/**
 * @author youzhi
 * @date 2020/4/3 9:31
 */
public interface OmsOrderSettingService {
    OmsOrderSetting detail(Integer id);

    int update(Integer id, OmsOrderSetting orderSetting);
}
