package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/14
 */

import com.smfst.xcw.model.ProductionLineInfo;
import com.smfst.xcw.service.ProductionLineInfoService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName ProductionLineInfoController
 *@Author lan
 *@Date 2020/10/14 16:52
 **/
@RestController
@RequestMapping("ProductionLineInfo")
@Api(tags = "生产线信息接口控制器")
public class ProductionLineInfoController {

    @Autowired
    ProductionLineInfoService productionLineInfoService;

    /**
     * 查询全部生产线信息
     * @return
     */
    @ApiOperation(value="查询全部生产线信息", notes="查询全部生产线信息")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<ProductionLineInfo> list = productionLineInfoService.selectProductionLineInfoList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 通过id查询生产线信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询生产线信息", notes="通过id查询生产线信息")
    public ResultObjectModel selectProductionLineInfoById(@RequestBody ProductionLineInfo productionLineInfo) throws Exception {
        List<ProductionLineInfo> lists = new ArrayList<>();
        lists.add( productionLineInfoService.selectProductionLineInfoById(productionLineInfo.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询车辆
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="按指定参数查询车辆", notes="按指定参数查询车辆")
    public ResultObjectModel selectProductionLineInfoByPartment(@RequestBody ProductionLineInfo productionLineInfo) throws Exception {
        List<ProductionLineInfo> lists = productionLineInfoService.selectProductionLineInfoByParameter(productionLineInfo);
        return ResultObjectModel.success("成功",lists);
    }
}
