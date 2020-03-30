package com.youzhi.controller;

import com.youzhi.dto.CommonResult;
import com.youzhi.dto.PermissionNode;
import com.youzhi.dto.PermissionParam;
import com.youzhi.model.Permission;
import com.youzhi.service.PermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 13:18
 */
@Controller
@Api(tags = "PermissionController", description = "后台用户权限管理")
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @ApiOperation("添加权限")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@Validated @RequestBody PermissionParam permissionParam, BindingResult result) {
        int count = permissionService.add(permissionParam);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("修改权限")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable Integer id,@Validated @RequestBody PermissionParam permissionParam, BindingResult result) {
        int count = permissionService.update(id,permissionParam);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("根据id批量删除权限")
    @RequestMapping(value = "/deleteBatch", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBatch(@RequestParam("ids") List<Integer> ids) {
        int count = permissionService.deleteBatch(ids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("以层级结构返回所有权限")
    @RequestMapping(value = "/treeList", method = RequestMethod.GET)
    @ResponseBody
    public Object treeList() {
        List<PermissionNode> permissionNodeList = permissionService.treeList();
        return new CommonResult().success(permissionNodeList);
    }

    @ApiOperation("分页获取所有权限列表")
    @RequestMapping(value = "/listPage", method = RequestMethod.GET)
    @ResponseBody
    public Object listPage(@RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                       @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum) {
        List<Permission> list = permissionService.listPage(pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }

}
