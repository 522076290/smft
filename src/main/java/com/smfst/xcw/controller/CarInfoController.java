package com.smfst.xcw.controller;

import com.smfst.xcw.model.CarInfo;
import com.smfst.xcw.service.CarInfoService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 车辆信息接口控制器
 * @quthor lan 2020/10/11
 */

@RestController
@RequestMapping("CarInfo")
@Api(tags = "车辆信息接口控制器")
public class CarInfoController {

    @Autowired
    private CarInfoService carInfoService;
    /**
     * 查询全部车辆
     * @return
     */
    @ApiOperation(value="查询全部车辆信息", notes="查询全部车辆信息")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<CarInfo> list = carInfoService.selectCarInfoList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 通过id查询车辆信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询车辆", notes="通过id查询车辆")
    public ResultObjectModel selectCarById(@RequestBody CarInfo carInfo) throws Exception {
        List<CarInfo> lists = new ArrayList<>();
        lists.add( carInfoService.selectCarInfoById(carInfo.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询车辆
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="按指定参数查询车辆", notes="按指定参数查询车辆")
    public ResultObjectModel selectCarByPartment(@RequestBody CarInfo carInfo) throws Exception {
        List<CarInfo> lists = carInfoService.selectCarInfoByParameter(carInfo);
        return ResultObjectModel.success("成功",lists);
    }

}
