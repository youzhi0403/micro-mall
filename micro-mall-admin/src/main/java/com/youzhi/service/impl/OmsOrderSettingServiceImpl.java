package com.youzhi.service.impl;

import com.youzhi.mapper.OmsOrderSettingMapper;
import com.youzhi.model.OmsOrderSetting;
import com.youzhi.service.OmsOrderSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author youzhi
 * @date 2020/4/3 9:32
 */
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {

    @Autowired
    private OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting detail(Integer id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Integer id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
