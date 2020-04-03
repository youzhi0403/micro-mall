package com.youzhi.controller;

import com.youzhi.dto.CommonResult;
import com.youzhi.model.OmsOrderSetting;
import com.youzhi.service.OmsOrderSettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author youzhi
 * @date 2020/4/3 9:27
 */
@Controller
@Api(tags = "OmsOrderSettingController",description = "订单设置管理")
@RequestMapping("/orderSetting")
public class OmsOrderSettingController {
    @Autowired
    private OmsOrderSettingService orderSettingService;

    @ApiOperation("获取指定订单设置")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object detail(@PathVariable Integer id) {
        OmsOrderSetting orderSetting = orderSettingService.detail(id);
        return new CommonResult().success(orderSetting);
    }

    @ApiOperation("修改指定订单设置")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable Integer id, @RequestBody OmsOrderSetting orderSetting) {
        int count = orderSettingService.update(id,orderSetting);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }
}
