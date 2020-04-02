package com.youzhi.controller;

import com.youzhi.dto.UmsAddressQueryParam;
import com.youzhi.dto.UmsAddressVo;
import com.youzhi.dto.CommonResult;
import com.youzhi.service.UmsAddressService;
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
 * @date 2020/3/28 13:27
 */
@Api(tags = "UmsAddressController", description = "地址管理")
@Controller
@RequestMapping("/address")
public class UmsAddressController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAddressController.class);

    @Autowired
    private UmsAddressService umsAddressService;

    @ApiOperation("分页查询用户地址")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority(':read')")*/
    public Object listPage(UmsAddressQueryParam queryParam,
                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<UmsAddressVo> list = umsAddressService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }

}
