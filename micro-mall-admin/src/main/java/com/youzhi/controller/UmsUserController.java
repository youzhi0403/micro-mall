package com.youzhi.controller;
import com.youzhi.dto.CommonResult;
import com.youzhi.dto.UmsUserParam;
import com.youzhi.dto.UmsUserQueryParam;
import com.youzhi.model.UmsUser;
import com.youzhi.service.UmsUserService;
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
 * @date 2020/3/30 11:09
 */
@Api(tags = "UmsUserController", description = "商城用户管理")
@Controller
@RequestMapping("/user")
public class UmsUserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsUserController.class);
    @Autowired
    private UmsUserService userService;

    @ApiOperation("分页查询商城用户")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority(':read')")*/
    public Object listPage(UmsUserQueryParam queryParam,
                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<UmsUser> list = userService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }

    @ApiOperation(value = "用户添加")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Object add(@Validated @RequestBody UmsUserParam umsUserParam, BindingResult result){
        int count = userService.add(umsUserParam);
        if(count == 1){
            return new CommonResult().success(count);
        }else if(count < 1){
            return new CommonResult().validateFailed("已经存在用户名");
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("更新后台管理员")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('good:update')")*/
    public Object update(@PathVariable("id") Integer id,
                         @Validated @RequestBody UmsUserParam umsUserParam,
                         BindingResult result){
        int count = userService.update(id, umsUserParam);
        if(count == 1){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("删除用户")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('good:delete')")*/
    public Object delete(@PathVariable("id") Integer id){
        int count = userService.delete(id);
        if(count == 1){
            return new CommonResult().success(null);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("禁用用户")
    @RequestMapping(value = "/forbidden/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Object forbidden(@PathVariable("id") Integer id){
        int count = userService.forbidden(id);
        if(count == 1){
            return new CommonResult().success(null);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("启用用户")
    @RequestMapping(value = "/launch/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Object launch(@PathVariable("id") Integer id){
        int count = userService.launch(id);
        if(count == 1){
            return new CommonResult().success(null);
        }else{
            return new CommonResult().failed();
        }
    }



}
