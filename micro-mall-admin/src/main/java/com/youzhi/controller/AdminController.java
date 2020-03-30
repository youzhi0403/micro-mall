package com.youzhi.controller;

import com.youzhi.dto.*;
import com.youzhi.model.Admin;
import com.youzhi.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cwj
 * @date 2020/1/6 10:24
 * 后台用户管理
 */
@Api(tags = "AdminController", description = "后台用户管理")
@Controller
@RequestMapping("/admin")
public class AdminController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private AdminService adminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户添加")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Object add(@Validated @RequestBody AdminParam adminParam,BindingResult result){
        int count = adminService.add(adminParam);
        if(count == 1){
            return new CommonResult().success(count);
        }else if(count < 1){
            return new CommonResult().validateFailed("已经存在用户名");
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "登录后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Object login(@Validated @RequestBody AdminLoginParam adminLoginParam, BindingResult result){
        String token = adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword());
        if(token == null){
            return new CommonResult().validateFailed("用户名或密码错误");
        }
        Map<String,String> tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return new CommonResult().success(tokenMap);
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    @ResponseBody
    public Object getAdminInfo(Principal principal){
        String username = principal.getName();
        AdminVo admin = adminService.getAdminByUsername(username);
        LOGGER.info("admin:{}" + admin);
        Map<String,Object> data = new HashMap<>();
        data.put("username",admin.getUsername());
        data.put("roles",admin.getRoleList());
        data.put("icon",admin.getIcon());
        return new CommonResult().success(data);
    }

    @ApiOperation(value = "登出功能")
    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    @ResponseBody
    public Object logout(){
        return new CommonResult().success(null);
    }


    @ApiOperation("分页查询后台管理员")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority(':read')")*/
    public Object listPage(AdminQueryParam queryParam,
                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<AdminVo> list = adminService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }


    @ApiOperation("更新后台管理员")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('good:update')")*/
    public Object update(@PathVariable("id") Integer id,
                         @Validated @RequestBody AdminParam adminParam,
                         BindingResult result){
        int count = adminService.update(id,adminParam);
        if(count == 1){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("删除后台管理员")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('good:delete')")*/
    public Object delete(@PathVariable("id") Integer id){
        int count = adminService.delete(id);
        if(count == 1){
            return new CommonResult().success(null);
        }else{
            return new CommonResult().failed();
        }
    }

}
