package com.youzhi.controller;

import com.youzhi.dto.CommonResult;
import com.youzhi.dto.GmsGoodParam;
import com.youzhi.dto.GmsGoodQueryParam;
import com.youzhi.dto.GmsGoodVo;
import com.youzhi.service.GmsGoodService;
import com.youzhi.util.ExcelUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 13:55
 * 商品管理Controller
 */
@Controller
@Api(tags = "GmsGoodController",description = "商品管理")
@RequestMapping("/good")
public class GmsGoodController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GmsGoodController.class);

    @Autowired
    private GmsGoodService goodService;

    @ApiOperation("分页查询商品")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('good:read')")*/
    public Object listPage(GmsGoodQueryParam queryParam,
                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<GmsGoodVo> list = goodService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }

    @ApiOperation("添加商品")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('good:add')")*/
    public Object add(@Validated @RequestBody GmsGoodParam gmsGoodParam, BindingResult result){
        int count = goodService.add(gmsGoodParam);
        if(count > 0){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("更新商品")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('good:update')")*/
    public Object update(@PathVariable("id") Integer id,
                         @Validated @RequestBody GmsGoodParam gmsGoodParam,
                         BindingResult result){
        int count = goodService.update(id, gmsGoodParam);
        if(count == 1){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("删除商品")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('good:delete')")*/
    public Object delete(@PathVariable("id") Integer id){
        int count = goodService.delete(id);
        if(count == 1){
            return new CommonResult().success(null);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "导入商品excel表",httpMethod = "POST",notes = "notes")
    @RequestMapping(value = "/import",method = RequestMethod.POST)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('good:add')")*/
    public Object importGoods(@RequestParam(value = "file",required = true)
                                          @ApiParam(value = "上传的文件",required = true) MultipartFile file){
        int count = goodService.importGoods(file);
        return new CommonResult().success(count);
    }

    @ApiOperation(value = "下载商品导入模板",httpMethod = "GET")
    @RequestMapping(value = "/downloadTemplate",method = RequestMethod.GET)
    /*@PreAuthorize("hasAuthority('good:add')")*/
    public void downloadTemplate(HttpServletResponse response) throws IOException {
        ExcelUtil.downloadTemplate(response,"goodsTemplate","商品导入模板");
    }

}
