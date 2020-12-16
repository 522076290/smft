package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.model.WorkPost;
import com.smfst.xcw.service.WorkPostService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName WorkPostController
 *@Author lan
 *@Date 2020/10/20 18:48
 **/
@RestController
@RequestMapping("WorkPost")
@Api(tags = "岗位接口控制器")
public class WorkPostController {
    @Autowired
    private WorkPostService workPostService;

    /**
     * 查询全部岗位
     * @return
     */
    @ApiOperation(value="查询全部岗位", notes="查询全部岗位")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<WorkPost> list = workPostService.selectWorkPostList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询岗位
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询岗位", notes="通过id查询岗位")
    public ResultObjectModel selectWorkPostById(@RequestBody WorkPost workPost) throws Exception {
        List<WorkPost> lists = new ArrayList<>();
        lists.add(workPostService.selectWorkPostById(workPost.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询岗位
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询岗位", notes="通过指定参数查询岗位")
    public ResultObjectModel selectWorkPostByPartment(@RequestBody WorkPost workPost) throws Exception {
        List<WorkPost> lists =  workPostService.selectWorkPostByParameter(workPost);
        return ResultObjectModel.success("成功",lists);
    }
}
