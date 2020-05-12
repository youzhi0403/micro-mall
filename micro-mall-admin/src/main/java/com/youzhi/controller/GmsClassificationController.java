package com.youzhi.controller;

import com.youzhi.dto.*;
import com.youzhi.model.GmsClassification;
import com.youzhi.service.GmsClassificationService;
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
 * @author cwj
 * @date 2020/3/24 13:44
 * 后台用户管理
 */
@Api(tags = "GmsClassificationController", description = "商品分类管理")
@Controller
@RequestMapping("/classification")
public class GmsClassificationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GmsClassificationController.class);

    @Autowired
    private GmsClassificationService classificationService;

    @ApiOperation("分页查询商品分类")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority(':read')")*/
    public Object listPage(GmsClassificationQueryParam queryParam,
                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<GmsClassification> list = classificationService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }

    @ApiOperation("添加商品分类")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('classification:add')")*/
    public Object add(@Validated @RequestBody GmsClassificationParam gmsClassificationParam, BindingResult result){
        int count = classificationService.add(gmsClassificationParam);
        if(count > 0){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("更新商品分类")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('classification:update')")*/
    public Object update(@PathVariable("id") Integer id,
                         @Validated @RequestBody GmsClassificationParam gmsClassificationParam,
                         BindingResult result){
        /*做校验，parentId和id不可相同*/
        if(id.equals(gmsClassificationParam.getParentId())){
            return new CommonResult().validateFailed("不可选择自己作为父元素");
        }
        int count = classificationService.update(id, gmsClassificationParam);
        if(count == 1){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("删除商品分类")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('classification:delete')")*/
    public Object delete(@PathVariable("id") Integer id){
        int count = classificationService.delete(id);
        if(count == 1){
            return new CommonResult().success(null);
        }else{
            return new CommonResult().failed();
        }
    }

    /*todo delete*/
    @ApiOperation("查询所有商品分类(用于前端下拉框展示)")
    @RequestMapping(value = "/getList/{kind}",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('classification:read')")*/
    public Object getList(@PathVariable Integer kind){
        List<GmsClassification> list = classificationService.getList(kind);
        return new CommonResult().success(list);
    }

    @ApiOperation("以层级结构返回指定类型分类")
    @RequestMapping(value = "/treeList/{kind}", method = RequestMethod.GET)
    @ResponseBody
    public Object treeList(@PathVariable Integer kind){
        List<GmsClassificationNode> classificationNodeList = classificationService.treeList(kind);
        return new CommonResult().success(classificationNodeList);
    }

    @ApiOperation("以层级结构返回所有分类")
    @RequestMapping(value = "/treeList", method = RequestMethod.GET)
    @ResponseBody
    public Object treeList(){
        List<GmsClassificationNode> classificationNodeList = classificationService.treeList();
        return new CommonResult().success(classificationNodeList);
    }

    @ApiOperation("获取分类详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object detail(@PathVariable Integer id){
        GmsClassificationVo gmsClassificationVo = classificationService.detail(id);
        return new CommonResult().success(gmsClassificationVo);
    }

}
