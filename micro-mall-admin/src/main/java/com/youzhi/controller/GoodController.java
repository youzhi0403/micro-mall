package com.youzhi.controller;

import com.youzhi.dto.CommonResult;
import com.youzhi.dto.GoodParam;
import com.youzhi.dto.GoodQueryParam;
import com.youzhi.dto.GoodResult;
import com.youzhi.model.Good;
import com.youzhi.service.GoodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    private static final Logger LOGGER = LoggerFactory.getLogger(GoodController.class);

    @Autowired
    private GoodService goodService;

    @ApiOperation("分页查询商品")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('good:read')")
    public Object getList(GoodQueryParam goodQueryParam,
                          @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                          @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<GoodResult> goodList = goodService.list(goodQueryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(goodList);
    }

    @ApiOperation("添加商品")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('good:add')")
    public Object add(@RequestBody GoodParam goodParam, BindingResult bindingResult){
        int count = goodService.addGood(goodParam);
        if(count > 0){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("更新商品")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('good:update')")
    public Object update(@PathVariable("id") Integer id,
                         @Validated @RequestBody GoodParam goodParam,
                         BindingResult result){
        int count = goodService.updateGood(id,goodParam);
        if(count == 1){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("删除商品")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('good:delete')")
    public Object delete(@PathVariable("id") Integer id){
        int count = goodService.deleteGood(id);
        if(count == 1){
            return new CommonResult().success(null);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "导入商品excel表",httpMethod = "POST",notes = "notes")
    @RequestMapping(value = "/import",method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('good:add')")
    public Object importGoods(@RequestParam(value = "file",required = true)
                                          @ApiParam(value = "上传的文件",required = true) MultipartFile file){
        LOGGER.info("{}",file.getName());
        return new CommonResult().success(null);
    }

}