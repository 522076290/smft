package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.Suppier;
import com.smfst.xcw.service.SuppierService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName SuppierController
 *@Author lan
 *@Date 2020/10/23 14:10
 **/
@RestController
@RequestMapping("Suppier")
@Api(tags = "供货商接口控制器")
public class SuppierController {

    @Autowired
    private SuppierService suppierService;

    /**
     * 查询全部供货商
     * @return
     */
    @ApiOperation(value="查询全部供货商", notes="查询全部供货商")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<Suppier> list = suppierService.selectSuppierList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询供货商
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询供货商", notes="通过id查询供货商")
    public ResultObjectModel selectSuppierById(@RequestBody Suppier suppier) throws Exception {
        List<Suppier> lists = new ArrayList<>();
        lists.add( suppierService.selectSuppierById(suppier.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询供货商
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询供货商", notes="通过指定参数查询供货商")
    public ResultObjectModel selectSuppierByPartment(@RequestBody Suppier suppier) throws Exception {
        List<Suppier> lists =  suppierService.selectSuppierByParameter(suppier);
        return ResultObjectModel.success("成功",lists);
    }

}
