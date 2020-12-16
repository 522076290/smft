package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/23
 */


import com.smfst.xcw.model.SuppierList;
import com.smfst.xcw.service.SuppierListService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName SuppierListController
 *@Author lan
 *@Date 2020/10/23 14:10
 **/
@RestController
@RequestMapping("SuppierList")
@Api(tags = "供货列表接口控制器")
public class SuppierListController {

    @Autowired
    private SuppierListService suppierListService;

    /**
     * 查询全部供货列表
     * @return
     */
    @ApiOperation(value="查询全部供货列表", notes="查询全部供货列表")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectListAll() {
        List<SuppierList> list = suppierListService.selectSuppierListAll();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询供货列表
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询供货列表", notes="通过id查询供货列表")
    public ResultObjectModel selectSuppierListById(@RequestBody SuppierList suppierList) throws Exception {
        List<SuppierList> lists = new ArrayList<>();
        lists.add( suppierListService.selectSuppierListById(suppierList.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询供货列表
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询供货列表", notes="通过指定参数查询供货列表")
    public ResultObjectModel selectSuppierListByPartment(@RequestBody SuppierList suppierList) throws Exception {
        List<SuppierList> lists =  suppierListService.selectSuppierListByParameter(suppierList);
        return ResultObjectModel.success("成功",lists);
    }

}
