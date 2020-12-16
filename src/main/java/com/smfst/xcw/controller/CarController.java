package com.smfst.xcw.controller;


import com.smfst.xcw.model.Car;
import com.smfst.xcw.service.CarService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 车辆接口控制器
 * @author My VM
 */
@RestController
@RequestMapping("Car")
@Api(tags = "车辆接口控制器")
public class CarController {

    @Autowired
    private CarService carService;


    /**
     * 查询全部车辆
     * @return
     */
    @ApiOperation(value="查询全部车辆", notes="查询全部车辆")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel  selectList() {
        List<Car> list = carService.selectCarList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 通过id查询车辆
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询车辆", notes="通过id查询车辆")
    public ResultObjectModel selectCarById(@RequestBody Car car) throws Exception {
        List<Car> lists = new ArrayList<>();
        lists.add( carService.selectCarById(car.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询车辆
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="按指定参数查询车辆", notes="按指定参数查询车辆")
    public ResultObjectModel selectCarByPartment(@RequestBody Car car) throws Exception {
        List<Car> lists = carService.selectCarByParameter(car);
        return ResultObjectModel.success("成功",lists);
    }


}
