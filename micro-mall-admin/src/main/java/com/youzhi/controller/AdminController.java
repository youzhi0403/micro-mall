package com.youzhi.controller;

import com.youzhi.dto.AdminLoginParam;
import com.youzhi.dto.AdminParam;
import com.youzhi.dto.CommonResult;
import com.youzhi.model.Admin;
import com.youzhi.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.HashMap;
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
    @Autowired
    private AdminService adminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public Object register(@RequestBody AdminParam adminParam,BindingResult result){
        Admin admin = adminService.register(adminParam);
        if(admin == null){
            return new CommonResult().failed();
        }
        return new CommonResult().success(admin);
    }

    @ApiOperation(value = "登录后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Object login(@RequestBody AdminLoginParam adminLoginParam, BindingResult result){
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
        Admin admin = adminService.getAdminByUsername(username);
        Map<String,Object> data = new HashMap<>();
        data.put("username",admin.getUsername());
        data.put("roles",new String[]{"TEST"});
        data.put("icon",admin.getIcon());
        return new CommonResult().success(data);
    }

}
