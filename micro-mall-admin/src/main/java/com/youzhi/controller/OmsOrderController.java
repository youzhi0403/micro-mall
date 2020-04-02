package com.youzhi.controller;

import com.youzhi.dto.*;
import com.youzhi.model.OmsOrder;
import com.youzhi.service.OmsOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/31 15:15
 */
@Controller
@Api(tags = "OmsOrderController",description = "订单管理")
@RequestMapping("/order")
public class OmsOrderController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OmsOrderController.class);

    @Autowired
    private OmsOrderService orderService;

    @ApiOperation("分页查询订单")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('good:read')")*/
    public Object listPage(OmsOrderQueryParam queryParam,
                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<OmsOrder> list = orderService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }

    @ApiOperation("批量发货")
    @RequestMapping(value = "/update/delivery", method = RequestMethod.POST)
    @ResponseBody
    public Object delivery(@RequestBody List<OmsOrderDeliveryParam> omsOrderDeliveryParamList) {
        int count = orderService.delivery(omsOrderDeliveryParamList);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("批量关闭订单")
    @RequestMapping(value = "/update/close", method = RequestMethod.POST)
    @ResponseBody
    public Object close(@RequestParam("ids") List<Integer> ids,@RequestParam String remark) {
        int count = orderService.close(ids,remark);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("批量删除订单")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object delete(@RequestParam("ids") List<Integer> ids) {
        int count = orderService.delete(ids);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("获取订单详情:订单信息、商品信息、操作记录")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object detail(@PathVariable Integer id) {
        OmsOrderVo omsOrderVo = orderService.detail(id);
        return new CommonResult().success(omsOrderVo);
    }

    @ApiOperation("修改收货人信息")
    @RequestMapping(value = "/update/receiverInfo", method = RequestMethod.POST)
    @ResponseBody
    public Object updateReceiverInfo(@RequestBody OmsOrderReceiverInfoParam omsOrderReceiverInfoParam) {
        int count = orderService.updateReceiverInfo(omsOrderReceiverInfoParam);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("备注订单")
    @RequestMapping(value = "/update/remark", method = RequestMethod.POST)
    @ResponseBody
    public Object updateRemark(@RequestParam("id") Integer id,
                             @RequestParam("remark") String remark,
                             @RequestParam("status") Integer status) {
        int count = orderService.updateRemark(id,remark,status);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }



}
