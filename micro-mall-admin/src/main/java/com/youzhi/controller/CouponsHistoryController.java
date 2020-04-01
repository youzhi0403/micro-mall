package com.youzhi.controller;

import com.youzhi.dto.CommonResult;
import com.youzhi.dto.CouponsHistoryQueryParam;
import com.youzhi.dto.CouponsHistoryVo;
import com.youzhi.service.CouponsHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 11:34
 */
@Controller
@Api(tags = "CouponsHistoryController",description = "优惠券使用记录管理")
@RequestMapping("/couponsHistory")
public class CouponsHistoryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CouponsHistoryController.class);
    @Autowired
    private CouponsHistoryService couponsHistoryService;

    @ApiOperation("分页查询优惠券使用记录")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority(':read')")*/
    public Object listPage(CouponsHistoryQueryParam queryParam,
                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<CouponsHistoryVo> list = couponsHistoryService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }




}
