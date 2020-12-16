package com.smfst.xcw.controller;

import com.smfst.xcw.model.UserWorkEnvironmental;
import com.smfst.xcw.model.UserWorkEnvironmentalLog;
import com.smfst.xcw.service.UserWorkEnvironmentalLogService;
import com.smfst.xcw.utils.ResultObjectModel;
import com.smfst.xcw.utils.UserWorkUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("UserWorkEnvironmentalLog")
@Api(tags = "学生工厂环境日志控制器")
/**
 * 学生工厂环境日志控制器
 * @Author lan
 * @Date 2020/10/12
 */
public class UserWorkEnvironmentalLogController {

    @Autowired
    private UserWorkEnvironmentalLogService userWorkEnvironmentalLogService;

    /**
     * 查询全部学生工厂日志
     * @return
     */
    @ApiOperation(value="查询全部学生工厂日志", notes="查询全部学生工厂日志")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserWorkEnvironmentalLog> list = userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogList();
        return ResultObjectModel.success("成功",list);

    }


    /**
     * 通过id查询学生工厂日志
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询车辆", notes="通过id查询车辆")
    public ResultObjectModel selectUserWorkEnvironmentalLogById(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add( userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生工厂日志
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生工厂日志", notes="通过指定参数查询学生工厂日志")
    public ResultObjectModel selectUserWorkEnvironmentalLogByContent(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        List<UserWorkEnvironmentalLog> lists = userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogByParameter(userWorkEnvironmentalLog);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生工厂日志
     * @param userWorkEnvironMentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生工厂日志", notes="通过指定参数查询学生工厂日志")
    public ResultObjectModel createUserWorkEnvironmentalLog(@RequestBody UserWorkEnvironmentalLog userWorkEnvironMentalLog) throws Exception {
        userWorkEnvironmentalLogService.createUserWorkEnvironmentalLog(userWorkEnvironMentalLog);
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add( userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironMentalLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生工厂日志
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂日志", notes="修改学生工厂日志")
    public ResultObjectModel updateUserWorkEnvironmentalLog(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        userWorkEnvironmentalLogService.updateUserWorkEnvironmentalLog(userWorkEnvironmentalLog);
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add( userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境日志学生工厂
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境日志学生工厂", notes="修改学生工厂环境日志学生工厂")
    public ResultObjectModel updateUserWorkEnvironmentalLogByWorkId(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        //获取所需参数
        UserWorkEnvironmentalLog userWorkEnvironmentalLog1 = new UserWorkEnvironmentalLog();
        userWorkEnvironmentalLog1.setId(userWorkEnvironmentalLog.getId());
        userWorkEnvironmentalLog1.setUserWorkId(userWorkEnvironmentalLog.getUserWorkId());
        //更新
        userWorkEnvironmentalLogService.updateUserWorkEnvironmentalLog(userWorkEnvironmentalLog1);
        //添加到结果集
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生工厂环境日志当前天数
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateDay",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境日志当前天数", notes="修改学生工厂环境日志当前天数")
    public ResultObjectModel updateUserWorkEnvironmentalLogByDay(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        //获取所需参数
        UserWorkEnvironmentalLog userWorkEnvironmentalLog1 = new UserWorkEnvironmentalLog();
        userWorkEnvironmentalLog1.setId(userWorkEnvironmentalLog.getId());
        userWorkEnvironmentalLog1.setDay(userWorkEnvironmentalLog.getDay());
        //更新
        userWorkEnvironmentalLogService.updateUserWorkEnvironmentalLog(userWorkEnvironmentalLog1);
        //添加到结果集
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生工厂环境日志灯光开启
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateLightSwitch",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境日志灯光开启", notes="修改学生工厂环境日志灯光开启")
    public ResultObjectModel updateUserWorkEnvironmentalLogByLightSwitch(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        //获取所需参数
        UserWorkEnvironmentalLog userWorkEnvironmentalLog1 = new UserWorkEnvironmentalLog();
        userWorkEnvironmentalLog1.setId(userWorkEnvironmentalLog.getId());
        userWorkEnvironmentalLog1.setLightSwitch(userWorkEnvironmentalLog.getLightSwitch());
        //更新
        userWorkEnvironmentalLogService.updateUserWorkEnvironmentalLog(userWorkEnvironmentalLog1);
        //添加到结果集
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境日志空调开关
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateAcOnOff",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境日志空调开关", notes="修改学生工厂环境日志空调开关")
    public ResultObjectModel updateUserWorkEnvironmentalLogByAcOnOff(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        //获取所需参数
        UserWorkEnvironmentalLog userWorkEnvironmentalLog1 = new UserWorkEnvironmentalLog();
        userWorkEnvironmentalLog1.setId(userWorkEnvironmentalLog.getId());
        userWorkEnvironmentalLog1.setAcOnOff(userWorkEnvironmentalLog.getAcOnOff());
        //更新
        userWorkEnvironmentalLogService.updateUserWorkEnvironmentalLog(userWorkEnvironmentalLog1);
        //添加到结果集
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生工厂环境日志光照
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateBeam",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境日志光照", notes="修改学生工厂环境日志光照")
    public ResultObjectModel updateUserWorkEnvironmentalLogByBeam(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        //获取所需参数
        UserWorkEnvironmentalLog userWorkEnvironmentalLog1 = new UserWorkEnvironmentalLog();
        userWorkEnvironmentalLog1.setId(userWorkEnvironmentalLog.getId());
        userWorkEnvironmentalLog1.setBeam(userWorkEnvironmentalLog.getBeam());
        //更新
        userWorkEnvironmentalLogService.updateUserWorkEnvironmentalLog(userWorkEnvironmentalLog1);
        //添加到结果集
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境日志车间温度
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateWorkshopTemp",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境日志车间温度", notes="修改学生工厂环境日志车间温度")
    public ResultObjectModel updateUserWorkEnvironmentalLogByWorkshopTemp(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        //获取所需参数
        UserWorkEnvironmentalLog userWorkEnvironmentalLog1 = new UserWorkEnvironmentalLog();
        userWorkEnvironmentalLog1.setId(userWorkEnvironmentalLog.getId());
        userWorkEnvironmentalLog1.setWorkshopTemp(userWorkEnvironmentalLog.getWorkshopTemp());
        //更新
        userWorkEnvironmentalLogService.updateUserWorkEnvironmentalLog(userWorkEnvironmentalLog1);
        //添加到结果集
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境日志室外温度
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateOutTemp",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境日志室外温度", notes="修改学生工厂环境日志室外温度")
    public ResultObjectModel updateUserWorkEnvironmentalLogByOutTemp(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        //获取所需参数
        UserWorkEnvironmentalLog userWorkEnvironmentalLog1 = new UserWorkEnvironmentalLog();
        userWorkEnvironmentalLog1.setId(userWorkEnvironmentalLog.getId());
        userWorkEnvironmentalLog1.setOutTemp(userWorkEnvironmentalLog.getOutTemp());
        //更新
        userWorkEnvironmentalLogService.updateUserWorkEnvironmentalLog(userWorkEnvironmentalLog1);
        //添加到结果集
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境日志电力消耗
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePowerConsume",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境日志电力消耗", notes="修改学生工厂环境日志电力消耗")
    public ResultObjectModel updateUserWorkEnvironmentalLogByPowerConsume(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        //获取所需参数
        UserWorkEnvironmentalLog userWorkEnvironmentalLog1 = new UserWorkEnvironmentalLog();
        userWorkEnvironmentalLog1.setId(userWorkEnvironmentalLog.getId());
        userWorkEnvironmentalLog1.setPowerConsume(userWorkEnvironmentalLog.getPowerConsume());
        //更新
        userWorkEnvironmentalLogService.updateUserWorkEnvironmentalLog(userWorkEnvironmentalLog1);
        //添加到结果集
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境日志时间
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境日志时间", notes="修改学生工厂环境日志时间")
    public ResultObjectModel updateUserWorkEnvironmentalLogByTime(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        //获取所需参数
        UserWorkEnvironmentalLog userWorkEnvironmentalLog1 = new UserWorkEnvironmentalLog();
        userWorkEnvironmentalLog1.setId(userWorkEnvironmentalLog.getId());
        userWorkEnvironmentalLog1.setTime(userWorkEnvironmentalLog.getTime());
        //更新
        userWorkEnvironmentalLogService.updateUserWorkEnvironmentalLog(userWorkEnvironmentalLog1);
        //添加到结果集
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除学生工厂环境日志
     * @param userWorkEnvironmentalLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生工厂环境日志", notes="删除学生工厂环境日志")
    public ResultObjectModel deletById(@RequestBody UserWorkEnvironmentalLog userWorkEnvironmentalLog) throws Exception {
        List<UserWorkEnvironmentalLog> lists = new ArrayList<>();
        lists.add( userWorkEnvironmentalLogService.selectUserWorkEnvironmentalLogById(userWorkEnvironmentalLog.getId()));
        userWorkEnvironmentalLogService.deletUserWorkEnvironmentalLog(userWorkEnvironmentalLog);
        return ResultObjectModel.success("成功",lists);
    }


}
