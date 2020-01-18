package com.youzhi.controller;

import com.youzhi.dto.CommonResult;
import com.youzhi.dto.GoodParam;
import com.youzhi.dto.GoodQueryParam;
import com.youzhi.model.Good;
import com.youzhi.service.GoodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 13:55
 * 商品管理Controller
 */
@Controller
@Api(tags = "goodController",description = "商品管理")
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @ApiOperation("添加商品")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('good:create')")
    public Object add(@RequestBody GoodParam goodParam, BindingResult bindingResult){
        int count = goodService.addGood(goodParam);
        if(count > 0){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("分页查询商品")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('good:read')")
    public Object getList(GoodQueryParam goodQueryParam,
                          @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                          @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<Good> goodList = goodService.list(goodQueryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(goodList);
    }
}
