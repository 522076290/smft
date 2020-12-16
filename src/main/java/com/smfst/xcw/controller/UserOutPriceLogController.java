package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.UserOutPriceLog;
import com.smfst.xcw.model.UserOutPriceLog;
import com.smfst.xcw.service.UserOutPriceLogService;
import com.smfst.xcw.utils.ResultObjectModel;
import com.smfst.xcw.utils.UserOutPriceUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *@ClassName UserInPriceLogController
 *@Author lan
 *@Date 2020/10/26 9:59
 **/
@RestController
@RequestMapping("UserOutPriceLog")
@Api(tags = "学生金币支出日志接口控制器")
public class UserOutPriceLogController {

    @Autowired
    private UserOutPriceLogService userOutPriceLogService;

    /**
     * 查询全部学生金币支出日志
     * @return
     */
    @ApiOperation(value="查询全部学生金币支出日志", notes="查询全部学生金币支出日志")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserOutPriceLog> list = userOutPriceLogService.selectUserOutPriceLogList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生金币支出日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生金币支出日志", notes="通过id查询学生金币支出日志")
    public ResultObjectModel selectUserOutPriceLogById(@RequestBody UserOutPriceLog userOutPriceLog) throws Exception {
        List<UserOutPriceLog> lists = new ArrayList<>();
        lists.add(userOutPriceLogService.selectUserOutPriceLogById(userOutPriceLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生金币支出日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生金币支出日志", notes="通过指定参数查询学生金币支出日志")
    public ResultObjectModel selectUserOutPriceLogByPartment(@RequestBody UserOutPriceLog userOutPriceLog) throws Exception {
        List<UserOutPriceLog> lists = userOutPriceLogService.selectUserOutPriceLogByParameter(userOutPriceLog);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生金币支出日志
     * @param userOutPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生金币支出日志", notes="新增学生金币支出日志")
    public ResultObjectModel createUserUserOutPriceLog(@RequestBody UserOutPriceLog userOutPriceLog) throws Exception {
        userOutPriceLogService.createUserOutPriceLog(userOutPriceLog);
        List<UserOutPriceLog> lists = new ArrayList<>();
        lists.add( userOutPriceLogService.selectUserOutPriceLogById(userOutPriceLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生金币支出日志
     * @param userOutPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币支出日志", notes="修改学生金币支出日志")
    public ResultObjectModel updateUserOutPriceLog(@RequestBody UserOutPriceLog userOutPriceLog) throws Exception {
        userOutPriceLogService.updateUserOutPriceLog(userOutPriceLog);
        List<UserOutPriceLog> lists = new ArrayList<>();
        lists.add( userOutPriceLogService.selectUserOutPriceLogById(userOutPriceLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生金币支出日志学生工厂
     * @param userOutPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币支出日志学生工厂", notes="修改学生金币支出日志学生工厂")
    public ResultObjectModel updateUserOutPriceLogWorkId(@RequestBody UserOutPriceLog userOutPriceLog) throws Exception {
        //获取所需参数
        UserOutPriceLog userOutPriceLog1 = new UserOutPriceLog();
        userOutPriceLog1.setId(userOutPriceLog.getId());
        userOutPriceLog1.setUserWorkId(userOutPriceLog.getUserWorkId());

        //更新
        userOutPriceLogService.updateUserOutPriceLog(userOutPriceLog1);
        //添加到结果集
        List<UserOutPriceLog> lists = new ArrayList<>();
        lists.add(userOutPriceLogService.selectUserOutPriceLogById(userOutPriceLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生金币日志支出日志金币
     * @param userOutPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePrice",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币日志支出日志金币", notes="修改学生金币日志支出日志金币")
    public ResultObjectModel updateUserOutPriceLogPrice(@RequestBody UserOutPriceLog userOutPriceLog) throws Exception {
        //获取所需参数
        UserOutPriceLog userOutPriceLog1 = new UserOutPriceLog();
        userOutPriceLog1.setId(userOutPriceLog.getId());
        userOutPriceLog1.setPrice(userOutPriceLog.getPrice());

        //更新
        userOutPriceLogService.updateUserOutPriceLog(userOutPriceLog1);
        //添加到结果集
        List<UserOutPriceLog> lists = new ArrayList<>();
        lists.add(userOutPriceLogService.selectUserOutPriceLogById(userOutPriceLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改学生金币支出日志剩余金币
     * @param userOutPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateEndPrice",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币支出日志剩余金币", notes="修改学生金币支出日志剩余金币")
    public ResultObjectModel updateUserOutPriceLogEndPrice(@RequestBody UserOutPriceLog userOutPriceLog) throws Exception {
        //获取所需参数
        UserOutPriceLog userOutPriceLog1 = new UserOutPriceLog();
        userOutPriceLog1.setId(userOutPriceLog.getId());
        userOutPriceLog1.setEndPrice(userOutPriceLog.getEndPrice());

        //更新
        userOutPriceLogService.updateUserOutPriceLog(userOutPriceLog1);
        //添加到结果集
        List<UserOutPriceLog> lists = new ArrayList<>();
        lists.add(userOutPriceLogService.selectUserOutPriceLogById(userOutPriceLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生金币支出日志时间
     * @param userOutPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币支出日志时间", notes="修改学生金币支出日志时间")
    public ResultObjectModel updateUserOutPriceLogTime(@RequestBody UserOutPriceLog userOutPriceLog) throws Exception {
        //获取所需参数
        UserOutPriceLog userOutPriceLog1 = new UserOutPriceLog();
        userOutPriceLog1.setId(userOutPriceLog.getId());
        userOutPriceLog1.setTime(userOutPriceLog.getTime());

        //更新
        userOutPriceLogService.updateUserOutPriceLog(userOutPriceLog1);
        //添加到结果集
        List<UserOutPriceLog> lists = new ArrayList<>();
        lists.add(userOutPriceLogService.selectUserOutPriceLogById(userOutPriceLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生金币收入日志类型
     * @param userOutPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateType",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币收入日志类型", notes="修改学生金币收入日志类型")
    public ResultObjectModel updateUserOutPriceLogType(@RequestBody UserOutPriceLog userOutPriceLog) throws Exception {
        //获取所需参数
        UserOutPriceLog userOutPriceLog1 = new UserOutPriceLog();
        userOutPriceLog1.setId(userOutPriceLog.getId());
        userOutPriceLog1.setType(userOutPriceLog.getType());

        //更新
        userOutPriceLogService.updateUserOutPriceLog(userOutPriceLog1);
        //添加到结果集
        List<UserOutPriceLog> lists = new ArrayList<>();
        lists.add(userOutPriceLogService.selectUserOutPriceLogById(userOutPriceLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除学生金币支出日志
     * @param userOutPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delet",method = RequestMethod.POST)
    @ApiOperation(value="删除学生金币支出日志", notes="删除学生金币支出日志")
    public ResultObjectModel deletById(@RequestBody UserOutPriceLog userOutPriceLog) throws Exception {
        List<UserOutPriceLog> lists = new ArrayList<>();
        lists.add( userOutPriceLogService.selectUserOutPriceLogById(userOutPriceLog.getId()));
        userOutPriceLogService.deletUserOutPriceLog(userOutPriceLog);
        return ResultObjectModel.success("成功",lists);
    }




}
