package com.smfst.xcw.controller;

import com.smfst.xcw.model.UserQuestionLog;
import com.smfst.xcw.service.UserQuestionLogService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserQuestionLogController
 * @Author lan
 * @Date 2020/11/7 11:45
 **/
@RestController
@RequestMapping("UserQuestionLog")
@Api(tags = "学生问题车辆修复日志接口控制器")
public class UserQuestionLogController {
    @Autowired
    private UserQuestionLogService userQuestionLogService;

    /**
     * 查询全部学生问题车辆修复日志
     * @return
     */
    @ApiOperation(value="查询全部学生问题车辆修复日志", notes="查询全部学生问题车辆修复日志")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserQuestionLog> list = userQuestionLogService.selectUserQuestionLogList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生问题车辆修复日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生问题车辆修复日志", notes="通过id查询学生问题车辆修复日志")
    public ResultObjectModel selectUserQuestionLogById(@RequestBody UserQuestionLog userQuestionLog) throws Exception {
        List<UserQuestionLog> lists = new ArrayList<>();
        lists.add(userQuestionLogService.selectUserQuestionLogById(userQuestionLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生问题车辆修复日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生问题车辆修复日志", notes="通过指定参数查询学生问题车辆修复日志")
    public ResultObjectModel selectUserQuestionLogByPartment(@RequestBody UserQuestionLog userQuestionLog) throws Exception {
        List<UserQuestionLog> lists = userQuestionLogService.selectUserQuestionLogByParameter(userQuestionLog);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生问题车辆修复日志
     * @param userQuestionLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生问题车辆修复日志", notes="新增学生问题车辆修复日志")
    public ResultObjectModel createUserUserQuestionLog(@RequestBody UserQuestionLog userQuestionLog) throws Exception {
        userQuestionLogService.createUserQuestionLog(userQuestionLog);
        List<UserQuestionLog> lists = new ArrayList<>();
        lists.add(userQuestionLogService.selectUserQuestionLogById(userQuestionLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生问题车辆修复日志
     * @param userQuestionLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生问题车辆修复日志", notes="修改学生问题车辆修复日志")
    public ResultObjectModel updateUserQuestionLog(@RequestBody UserQuestionLog userQuestionLog) throws Exception {
        userQuestionLogService.updateUserQuestionLog(userQuestionLog);
        List<UserQuestionLog> lists = new ArrayList<>();
        lists.add( userQuestionLogService.selectUserQuestionLogById(userQuestionLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生问题车辆修复日志学生工厂
     * @param userQuestionLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生问题车辆修复日志学生工厂", notes="修改学生问题车辆修复日志学生工厂")
    public ResultObjectModel updateUserQuestionLogWorkId(@RequestBody UserQuestionLog userQuestionLog) throws Exception {

        //获取所需参数
        UserQuestionLog userQuestionLog1 = new UserQuestionLog();
        userQuestionLog1.setId(userQuestionLog.getId());
        userQuestionLog1.setUserWorkId(userQuestionLog.getUserWorkId());

        //更新
        userQuestionLogService.updateUserQuestionLog(userQuestionLog1);
        //添加到结果集
        List<UserQuestionLog> lists = new ArrayList<>();
        lists.add(userQuestionLogService.selectUserQuestionLogById(userQuestionLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生问题车辆修复日志学生生产线
     * @param userQuestionLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生问题车辆修复日志学生工厂", notes="修改学生问题车辆修复日志学生工厂")
    public ResultObjectModel updateUserQuestionLogUserProductionLineId(@RequestBody UserQuestionLog userQuestionLog) throws Exception {

        //获取所需参数
        UserQuestionLog userQuestionLog1 = new UserQuestionLog();
        userQuestionLog1.setId(userQuestionLog.getId());
        userQuestionLog1.setUserProductionLineId(userQuestionLog.getUserProductionLineId());

        //更新
        userQuestionLogService.updateUserQuestionLog(userQuestionLog1);
        //添加到结果集
        List<UserQuestionLog> lists = new ArrayList<>();
        lists.add(userQuestionLogService.selectUserQuestionLogById(userQuestionLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生问题车辆修复日志时间
     * @param userQuestionLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改学生问题车辆修复日志时间", notes="修改学生问题车辆修复日志时间")
    public ResultObjectModel updateUserQuestionLogTime(@RequestBody UserQuestionLog userQuestionLog) throws Exception {

        //获取所需参数
        UserQuestionLog userQuestionLog1 = new UserQuestionLog();
        userQuestionLog1.setId(userQuestionLog.getId());
        userQuestionLog1.setTime(userQuestionLog.getTime());
        //更新
        userQuestionLogService.updateUserQuestionLog(userQuestionLog1);
        //添加到结果集
        List<UserQuestionLog> lists = new ArrayList<>();
        lists.add(userQuestionLogService.selectUserQuestionLogById(userQuestionLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改学生问题车辆修复日志学生问题车辆
     * @param userQuestionLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserQuestionId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生问题车辆修复日志学生问题车辆", notes="修改学生问题车辆修复日志学生问题车辆")
    public ResultObjectModel updateUserQuestionLogUserQuestionId(@RequestBody UserQuestionLog userQuestionLog) throws Exception {

        //获取所需参数
        UserQuestionLog userQuestionLog1 = new UserQuestionLog();
        userQuestionLog1.setId(userQuestionLog.getId());
        userQuestionLog1.setUserQuestionId(userQuestionLog.getUserQuestionId());
        //更新
        userQuestionLogService.updateUserQuestionLog(userQuestionLog1);
        //添加到结果集
        List<UserQuestionLog> lists = new ArrayList<>();
        lists.add(userQuestionLogService.selectUserQuestionLogById(userQuestionLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除学生问题车辆修复日志
     * @param userQuestionLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生问题车辆修复日志", notes="删除学生问题车辆修复日志")
    public ResultObjectModel deletById(@RequestBody UserQuestionLog userQuestionLog) throws Exception {
        List<UserQuestionLog> lists = new ArrayList<>();
        lists.add( userQuestionLogService.selectUserQuestionLogById(userQuestionLog.getId()));
        userQuestionLogService.deletUserQuestionLog(userQuestionLog);
        return ResultObjectModel.success("成功",lists);
    }
}
