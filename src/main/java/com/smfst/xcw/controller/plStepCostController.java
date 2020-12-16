package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.plStepCost;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName plStepCostController
 *@Author lan
 *@Date 2020/10/26 9:39
 **/
@RestController
@RequestMapping("plStepCost")
@Api(tags = "生产环节原料消耗接口控制器")
public class plStepCostController {

    @Autowired
    private com.smfst.xcw.service.plStepCostService plStepCostService;

    /**
     * 查询全部生产环节原料消耗
     * @return
     */
    @ApiOperation(value="查询全部生产环节原料消耗", notes="查询全部生产环节原料消耗")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<plStepCost> list = plStepCostService.selectplStepCostList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 通过id查询生产环节原料消耗
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询生产环节原料消耗", notes="通过id查询生产环节原料消耗")
    public ResultObjectModel selectplStepCostById(@RequestBody plStepCost plStepCost) throws Exception {
        List<com.smfst.xcw.model.plStepCost> lists = new ArrayList<>();
        lists.add( plStepCostService.selectplStepCostById(plStepCost.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询生产环节原料消耗
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询生产环节原料消耗", notes="通过指定参数查询生产环节原料消耗")
    public ResultObjectModel selectplStepCostByPartment(@RequestBody plStepCost plStepCost) throws Exception {
        List<com.smfst.xcw.model.plStepCost> lists = plStepCostService.selectplStepCostByParameter(plStepCost);
        return ResultObjectModel.success("成功",lists);
    }

}
