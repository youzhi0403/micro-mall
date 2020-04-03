package com.youzhi.controller;

import com.youzhi.dto.CommonResult;
import com.youzhi.model.OmsOrderReturnReason;
import com.youzhi.service.OmsOrderReturnReasonService;
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
 * @date 2020/4/3 10:21
 */
@Controller
@Api(tags = "OmsOrderReturnReasonController",description = "退货原因管理")
@RequestMapping("/returnReason")
public class OmsOrderReturnReasonController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OmsOrderReturnReasonController.class);

    @Autowired
    private OmsOrderReturnReasonService returnReasonService;

    @ApiOperation("添加退货原因")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestBody OmsOrderReturnReason returnReason) {
        int count = returnReasonService.add(returnReason);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("修改退货原因")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable Integer id, @RequestBody OmsOrderReturnReason returnReason) {
        int count = returnReasonService.update(id,returnReason);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("批量删除退货原因")
    @RequestMapping(value = "/deleteBatch", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBatch(@RequestParam("ids") List<Integer> ids) {
        int count = returnReasonService.deleteBatch(ids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("分页查询全部退货原因")
    @RequestMapping(value = "/listPage", method = RequestMethod.GET)
    @ResponseBody
    public Object listPage(@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<OmsOrderReturnReason> reasonList = returnReasonService.listPage(pageSize,pageNum);
        return new CommonResult().pageSuccess(reasonList);
    }

    @ApiOperation("获取单个退货原因详情信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object detail(@PathVariable Integer id) {
        OmsOrderReturnReason reason = returnReasonService.detail(id);
        return new CommonResult().success(reason);
    }

    @ApiOperation("修改退货原因启用状态")
    @RequestMapping(value = "/update/status", method = RequestMethod.POST)
    @ResponseBody
    public Object updateStatus(@RequestParam(value = "status") Integer status,
                               @RequestParam("ids") List<Integer> ids) {
        int count = returnReasonService.updateStatus(ids,status);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

}
