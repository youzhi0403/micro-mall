package com.youzhi.controller;

import com.youzhi.dto.CommonResult;
import com.youzhi.dto.AmsRoleParam;
import com.youzhi.model.AmsPermission;
import com.youzhi.model.AmsRole;
import com.youzhi.service.AmsRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 14:04
 */
@Controller
@Api(tags = "AmsRoleController", description = "后台角色管理")
@RequestMapping("/role")
public class AmsRoleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AmsRoleController.class);

    @Autowired
    private AmsRoleService roleService;

    @ApiOperation("添加角色")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestBody AmsRoleParam amsRoleParam) {
        int count = roleService.add(amsRoleParam);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("修改角色")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable Integer id, @RequestBody AmsRoleParam amsRoleParam) {
        int count = roleService.update(id, amsRoleParam);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("批量删除角色")
    @RequestMapping(value = "/deleteBatch", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBatch(@RequestParam("ids") List<Integer> ids) {
        int count = roleService.deleteBatch(ids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("获取相应角色权限")
    @RequestMapping(value = "/permission/{roleId}", method = RequestMethod.GET)
    @ResponseBody
    public Object getPermissionList(@PathVariable Integer roleId) {
        List<AmsPermission> permissionList =roleService.getPermissionList(roleId);
        return new CommonResult().success(permissionList);
    }

    @ApiOperation("修改角色权限")
    @RequestMapping(value = "/permission/update", method = RequestMethod.POST)
    @ResponseBody
    public Object updatePermission(@RequestParam Integer roleId,
                                   @RequestParam("permissionIds") List<Integer> permissionIds) {
        int count = roleService.updatePermission(roleId,permissionIds);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("获取所有角色")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    public Object listPage(@RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                       @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<AmsRole> roleList = roleService.listPage(pageSize,pageNum);
        return new CommonResult().pageSuccess(roleList);
    }

    @ApiOperation("获取所有角色(用于前端下拉列表)")
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    @ResponseBody
    public Object getList(){
        List<AmsRole> roleList = roleService.getList();
        return new CommonResult().success(roleList);
    }

}
