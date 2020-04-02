package com.youzhi.controller;

import com.youzhi.dto.*;
import com.youzhi.service.SmsCouponsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:29
 */
@Controller
@Api(tags = "SmsCouponsController",description = "优惠券管理")
@RequestMapping("/coupons")
public class SmsCouponsController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SmsCouponsController.class);
    @Autowired
    private SmsCouponsService couponsService;

    @ApiOperation("分页查询优惠券")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority(':read')")*/
    public Object listPage(SmsCouponsQueryParam queryParam,
                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<SmsCouponsVo> list = couponsService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }

    @ApiOperation("发布优惠券")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('classification:add')")*/
    public Object add(@Validated @RequestBody SmsCouponsParam smsCouponsParam, BindingResult result){
        int count = couponsService.add(smsCouponsParam);
        if(count > 0){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("删除优惠券")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('classification:delete')")*/
    public Object delete(@PathVariable("id") Integer id){
        int count = couponsService.delete(id);
        if(count == 1){
            return new CommonResult().success(null);
        }else{
            return new CommonResult().failed();
        }
    }



}
