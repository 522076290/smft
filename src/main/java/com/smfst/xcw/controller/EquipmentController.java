package com.smfst.xcw.controller;


import com.smfst.xcw.model.Equipment;
import com.smfst.xcw.model.UserProductionLine;
import com.smfst.xcw.service.EquipmentService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName EquipmentController
 *@Author tyx
 *@Date 2020/12/3
 **/
@RestController
@RequestMapping("Equipment")
@Api(tags = "生产设备")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    /**
     * 查询全部生产设备
     * @return
     */
    @ApiOperation(value="查询全部生产设备", notes="查询全部生产设备")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<Equipment> list = equipmentService.selectEquipmentList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 新增设备
     * @param equipment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增设备", notes="新增设备")
    public ResultObjectModel createEquipment(@RequestBody Equipment equipment) throws Exception {
        equipmentService.createEquipment(equipment);
        return ResultObjectModel.success("成功","新增成功");
    }

    /**
     * 修改设备
     * @param equipment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改设备", notes="修改设备")
    public ResultObjectModel updateEquipment(@RequestBody Equipment equipment) throws Exception {
        equipmentService.updateEquipment(equipment);
        return ResultObjectModel.success("成功","修改成功");
    }

    /**
     * 删除设备
     * @param equipment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除设备", notes="删除设备")
    public ResultObjectModel deleteEquipment(@RequestBody Equipment equipment) throws Exception {
        equipmentService.deleteEquipment(equipment);
        return ResultObjectModel.success("成功","删除成功");
    }
}
