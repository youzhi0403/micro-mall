package com.youzhi.controller;

import com.youzhi.dto.AdminLoginParam;
import com.youzhi.dto.AdminParam;
import com.youzhi.dto.AdminVo;
import com.youzhi.dto.CommonResult;
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
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private AdminService adminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public Object register(@Validated @RequestBody AdminParam adminParam,BindingResult result){
        Admin admin = adminService.register(adminParam);
        if(admin == null){
            return new CommonResult().failed();
        }
        return new CommonResult().success(admin);
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

}
