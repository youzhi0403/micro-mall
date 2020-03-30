package com.youzhi.controller;

import com.youzhi.dto.ClassificationParam;
import com.youzhi.dto.ClassificationQueryParam;
import com.youzhi.dto.CommonResult;
import com.youzhi.model.Classification;
import com.youzhi.service.ClassificationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@Api(tags = "ClassificationController", description = "商品分类管理")
@Controller
@RequestMapping("/classification")
public class ClassificationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassificationController.class);

    @Autowired
    private ClassificationService classificationService;

    @ApiOperation("分页查询商品分类")
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority(':read')")*/
    public Object listPage(ClassificationQueryParam queryParam,
                          @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                          @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<Classification> list = classificationService.listPage(queryParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(list);
    }

    @ApiOperation("添加商品分类")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('classification:add')")*/
    public Object add(@Validated @RequestBody ClassificationParam classificationParam, BindingResult result){
        int count = classificationService.add(classificationParam);
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
                         @Validated @RequestBody ClassificationParam classificationParam,
                         BindingResult result){
        int count = classificationService.update(id,classificationParam);
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

    @ApiOperation("查询所有商品分类(用于前端下拉框展示)")
    @RequestMapping(value = "/getList/{kind}",method = RequestMethod.GET)
    @ResponseBody
    /*@PreAuthorize("hasAuthority('classification:read')")*/
    public Object getList(@PathVariable Integer kind){
        List<Classification> list = classificationService.getList(kind);
        return new CommonResult().success(list);
    }

}
