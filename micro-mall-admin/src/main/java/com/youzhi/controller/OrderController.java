package com.youzhi.controller;

import com.youzhi.dto.CommonResult;
import com.youzhi.dto.OrderQueryParam;
import com.youzhi.dto.OrderVo;
import com.youzhi.service.OrderService;
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
 * @date 2020/3/31 15:15
 */
@Controller
@Api(tags = "OrderController",description = "订单管理")
@RequestMapping("/order")
public class OrderController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @ApiOperation("分页查询订单")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('good:read')")*/
    public Object listPage(OrderQueryParam queryParam,
                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<OrderVo> list = orderService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }



}
