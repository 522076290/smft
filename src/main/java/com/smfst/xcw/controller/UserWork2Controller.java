package com.smfst.xcw.controller;

import com.smfst.xcw.model.*;
import com.smfst.xcw.service.UserWork2Service;
import com.smfst.xcw.service.UserWorkEnvironmentalService;
import com.smfst.xcw.service.UserWorkInfoService;
import com.smfst.xcw.service.UserWorkService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *@ClassName UserWork2Controller
 *@Author tyx
 *@Date 2020/11/24 15:30
 **/
@RestController
@RequestMapping("UserWork2")
@Api(tags = "学生工厂接口控制器2")
public class UserWork2Controller {
    @Autowired
    private UserWork2Service userWork2Service;
    @Autowired
    private UserWorkService userWorkService;
    @Autowired
    private UserWorkInfoService userWorkInfoService;
    @Autowired
    private UserWorkEnvironmentalService userWorkEnvironmentalService;
    /**
     * 查询全部学生工厂
     * @return
     */
    @ApiOperation(value="查询全部学生工厂", notes="查询全部学生工厂")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserWork2> list = userWork2Service.selectUserWorkList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生工厂
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生工厂", notes="通过id查询学生工厂")
    public ResultObjectModel selectUserWorkById(@RequestBody UserWork2 userWork2) throws Exception {
        List<UserWork2> lists = new ArrayList<>();
        lists.add(userWork2Service.selectUserWorkById(userWork2.getId()));
        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改学生工厂
     * @param userWork2
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂", notes="修改学生工厂")
    public ResultObjectModel updateUserWorkEnvironmentalLog(@RequestBody UserWork2 userWork2) throws Exception {
        UserWork userWork = new UserWork();
        userWork.setId(userWork2.getId());
        userWork.setLoginName(userWork2.getLoginName());
        userWorkService.updateUserWork(userWork);

        UserWorkInfo userWorkInfo = new UserWorkInfo();
        userWorkInfo.setId(userWork2.getId());
        userWorkInfo.setPrice(userWork2.getPrice());
        userWorkInfo.setCarCapacity(userWork2.getCarCapacity());
        userWorkInfo.setPartCapacity(userWork2.getPartCapacity());
        userWorkInfoService.updateUserWorkInfo(userWorkInfo);

        UserWorkEnvironmental userWorkEnvironmental = new UserWorkEnvironmental();
        userWorkEnvironmental.setId(userWork2.getId());
        userWorkEnvironmental.setAcOnOff(userWork2.getAcOnOff());
        userWorkEnvironmental.setBeam(userWork2.getBeam());
        userWorkEnvironmental.setDay(userWork2.getDay());
        userWorkEnvironmental.setLightSwitch(userWork2.getLightSwitch());
        userWorkEnvironmental.setOutTemp(userWork2.getOutTemp());
        userWorkEnvironmental.setPowerConsume(userWork2.getPowerConsume());
        userWorkEnvironmental.setTime(userWork2.getTime());
        userWorkEnvironmental.setWorkshopTemp(userWork2.getWorkshopTemp());
        userWorkEnvironmental.setPower(userWork2.getPower());
        userWorkEnvironmentalService.updateUserWorkEnvironmental(userWorkEnvironmental);

        return ResultObjectModel.success("成功","修改成功");
    }
}
