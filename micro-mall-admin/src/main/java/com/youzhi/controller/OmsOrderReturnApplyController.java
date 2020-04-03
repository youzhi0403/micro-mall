package com.youzhi.controller;

import com.youzhi.dto.CommonResult;
import com.youzhi.dto.OmsOrderReturnApplyParam;
import com.youzhi.dto.OmsOrderReturnApplyVo;
import com.youzhi.dto.OmsOrderReturnApplyQueryParam;
import com.youzhi.model.OmsOrderReturnApply;
import com.youzhi.service.OmsOrderReturnApplyService;
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
 * @date 2020/4/3 9:26
 */
@Controller
@Api(tags = "OmsOrderReturnApplyController",description = "订单退货申请管理")
@RequestMapping("/returnApply")
public class OmsOrderReturnApplyController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OmsOrderReturnApplyController.class);

    @Autowired
    private OmsOrderReturnApplyService returnApplyService;

    @ApiOperation("分页查询退货申请")
    @RequestMapping(value = "/listPage", method = RequestMethod.GET)
    @ResponseBody
    public Object list(OmsOrderReturnApplyQueryParam queryParam,
                       @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<OmsOrderReturnApply> returnApplyList = returnApplyService.listPage(queryParam, pageSize, pageNum);
        return new CommonResult().pageSuccess(returnApplyList);
    }

    @ApiOperation("批量删除申请")
    @RequestMapping(value = "/deleteBatch", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBatch(@RequestParam("ids") List<Integer> ids) {
        int count = returnApplyService.deleteBatch(ids);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("获取退货申请详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object detail(@PathVariable Integer id) {
        OmsOrderReturnApplyVo result = returnApplyService.detail(id);
        return new CommonResult().success(result);
    }

    @ApiOperation("修改申请状态")
    @RequestMapping(value = "/update/status/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object updateStatus(@PathVariable Integer id, @RequestBody OmsOrderReturnApplyParam returnApplyParam) {
        int count = returnApplyService.updateStatus(id, returnApplyParam);
        if (count > 0) {
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }
}
