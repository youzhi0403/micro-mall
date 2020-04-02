package com.youzhi.controller;

import com.youzhi.dto.UmsAccountRecordQueryParam;
import com.youzhi.dto.CommonResult;
import com.youzhi.model.UmsAccountRecord;
import com.youzhi.service.UmsAccountRecordService;
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
 * @date 2020/3/24 16:01
 */
@Api(tags = "UmsAccountRecordController", description = "支入支出明细管理")
@Controller
@RequestMapping("/accountRecord")
public class UmsAccountRecordController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAccountRecordController.class);

    @Autowired
    private UmsAccountRecordService accountRecordService;

    @ApiOperation("分页查询支入支出明细")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority(':read')")*/
    public Object listPage(UmsAccountRecordQueryParam queryParam,
                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<UmsAccountRecord> list = accountRecordService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }
}
