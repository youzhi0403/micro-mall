package com.youzhi.controller;

import com.youzhi.dto.AccountRecordQueryParam;
import com.youzhi.dto.CommonResult;
import com.youzhi.model.AccountRecord;
import com.youzhi.service.AccountRecordService;
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
@Api(tags = "AccountRecordController", description = "支入支出明细管理")
@Controller
@RequestMapping("/accountRecord")
public class AccountRecordController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountRecordController.class);

    @Autowired
    private AccountRecordService accountRecordService;

    @ApiOperation("分页查询支入支出明细")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority(':read')")*/
    public Object listPage(AccountRecordQueryParam queryParam,
                          @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                          @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<AccountRecord> list = accountRecordService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }
}
