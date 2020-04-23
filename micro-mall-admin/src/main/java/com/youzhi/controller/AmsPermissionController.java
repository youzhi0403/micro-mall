package com.youzhi.controller;

import com.youzhi.dto.AmsPermissionVo;
import com.youzhi.dto.CommonResult;
import com.youzhi.dto.AmsPermissionNode;
import com.youzhi.dto.AmsPermissionParam;
import com.youzhi.model.AmsPermission;
import com.youzhi.service.AmsPermissionService;
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
 * @date 2020/3/30 13:18
 */
@Controller
@Api(tags = "AmsPermissionController", description = "后台用户权限管理")
@RequestMapping("/permission")
public class AmsPermissionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AmsPermissionController.class);
    @Autowired
    private AmsPermissionService permissionService;

    @ApiOperation("添加权限")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@Validated @RequestBody AmsPermissionParam amsPermissionParam, BindingResult result) {
        int count = permissionService.add(amsPermissionParam);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("修改权限")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable Integer id, @Validated @RequestBody AmsPermissionParam amsPermissionParam, BindingResult result) {
        /*做校验，parentId和id不可相同*/
        if(id.equals(amsPermissionParam.getParentId())){
            return new CommonResult().validateFailed("不可选择自己作为父元素");
        }
        int count = permissionService.update(id, amsPermissionParam);
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
        List<AmsPermissionNode> amsPermissionNodeList = permissionService.treeList();
        return new CommonResult().success(amsPermissionNodeList);
    }

    @ApiOperation("分页获取所有权限列表")
    @RequestMapping(value = "/listPage", method = RequestMethod.GET)
    @ResponseBody
    public Object listPage(@RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                       @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum) {
        List<AmsPermission> list = permissionService.listPage(pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }

    @ApiOperation("获取权限详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object detail(@PathVariable Integer id){
        AmsPermissionVo amsPermissionVo = permissionService.detail(id);
        return new CommonResult().success(amsPermissionVo);
    }



}
