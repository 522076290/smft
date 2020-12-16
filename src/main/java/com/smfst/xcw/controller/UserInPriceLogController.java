package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.UserAppointment;
import com.smfst.xcw.model.UserInPriceLog;
import com.smfst.xcw.service.UserInPriceLogService;
import com.smfst.xcw.utils.ResultObjectModel;
import com.smfst.xcw.utils.UserInPriceUtils;
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
@RequestMapping("UserInPriceLog")
@Api(tags = "学生金币收入日志接口控制器")
public class UserInPriceLogController {

    @Autowired
    private UserInPriceLogService userInPriceLogService;

    /**
     * 查询全部学生金币收入日志
     * @return
     */
    @ApiOperation(value="查询全部学生金币收入日志", notes="查询全部学生金币收入日志")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserInPriceLog> list = userInPriceLogService.selectUserInPriceLogList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生金币收入日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生金币收入日志", notes="通过id查询学生金币收入日志")
    public ResultObjectModel selectUserInPriceLogById(@RequestBody UserInPriceLog userInPriceLog) throws Exception {
        List<UserInPriceLog> lists = new ArrayList<>();
        lists.add(userInPriceLogService.selectUserInPriceLogById(userInPriceLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生金币收入日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生金币收入日志", notes="通过指定参数查询学生金币收入日志")
    public ResultObjectModel selectUserInPriceLogByPartment(@RequestBody UserInPriceLog userInPriceLog) throws Exception {
        List<UserInPriceLog> lists = userInPriceLogService.selectUserInPriceLogByParameter(userInPriceLog);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生金币收入日志
     * @param userInPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生金币收入日志", notes="新增学生金币收入日志")
    public ResultObjectModel createUserUserInPriceLog(@RequestBody UserInPriceLog userInPriceLog) throws Exception {
        userInPriceLogService.createUserInPriceLog(userInPriceLog);
        List<UserInPriceLog> lists = new ArrayList<>();
        lists.add( userInPriceLogService.selectUserInPriceLogById(userInPriceLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生金币收入日志
     * @param userInPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币收入日志", notes="修改学生金币收入日志")
    public ResultObjectModel updateUserInPriceLog(@RequestBody UserInPriceLog userInPriceLog) throws Exception {
        userInPriceLogService.updateUserInPriceLog(userInPriceLog);
        List<UserInPriceLog> lists = new ArrayList<>();
        lists.add( userInPriceLogService.selectUserInPriceLogById(userInPriceLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生金币日志学生工厂
     * @param userInPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币日志学生工厂", notes="修改学生金币日志学生工厂")
    public ResultObjectModel updateUserInPriceLogWorkId(@RequestBody UserInPriceLog userInPriceLog) throws Exception {

        //获取所需参数
        UserInPriceLog userInPriceLog1 = new UserInPriceLog();
        userInPriceLog1.setId(userInPriceLog.getId());
        userInPriceLog1.setUserWorkId(userInPriceLog.getUserWorkId());
        //更新
        userInPriceLogService.updateUserInPriceLog(userInPriceLog1);
        //添加到结果集
        List<UserInPriceLog> lists = new ArrayList<>();
        lists.add(userInPriceLogService.selectUserInPriceLogById(userInPriceLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生金币日志收入日志金币
     * @param userInPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePrice",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币日志收入日志金币", notes="修改学生金币日志收入日志金币")
    public ResultObjectModel updateUserInPriceLogPrice(@RequestBody UserInPriceLog userInPriceLog) throws Exception {
        //获取所需参数
        UserInPriceLog userInPriceLog1 = new UserInPriceLog();
        userInPriceLog1.setId(userInPriceLog.getId());
        userInPriceLog1.setPrice(userInPriceLog.getPrice());
        //更新
        userInPriceLogService.updateUserInPriceLog(userInPriceLog1);
        //添加到结果集
        List<UserInPriceLog> lists = new ArrayList<>();
        lists.add(userInPriceLogService.selectUserInPriceLogById(userInPriceLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改学生金币日志剩余金币
     * @param userInPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateEndPrice",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币日志剩余金币", notes="修改学生金币日志剩余金币")
    public ResultObjectModel updateUserInPriceLogEndPrice(@RequestBody UserInPriceLog userInPriceLog) throws Exception {
        //获取所需参数
        UserInPriceLog userInPriceLog1 = new UserInPriceLog();
        userInPriceLog1.setId(userInPriceLog.getId());
        userInPriceLog1.setEndPrice(userInPriceLog.getEndPrice());
        //更新
        userInPriceLogService.updateUserInPriceLog(userInPriceLog1);
        //添加到结果集
        List<UserInPriceLog> lists = new ArrayList<>();
        lists.add(userInPriceLogService.selectUserInPriceLogById(userInPriceLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生金币收入日志时间
     * @param userInPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币收入日志时间", notes="修改学生金币收入日志时间")
    public ResultObjectModel updateUserInPriceLogTime(@RequestBody UserInPriceLog userInPriceLog) throws Exception {
        //获取所需参数
        UserInPriceLog userInPriceLog1 = new UserInPriceLog();
        userInPriceLog1.setId(userInPriceLog.getId());
        userInPriceLog1.setTime(userInPriceLog.getTime());
        //更新
        userInPriceLogService.updateUserInPriceLog(userInPriceLog1);
        //添加到结果集
        List<UserInPriceLog> lists = new ArrayList<>();
        lists.add(userInPriceLogService.selectUserInPriceLogById(userInPriceLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生金币收入日志类型
     * @param userInPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateType",method = RequestMethod.POST)
    @ApiOperation(value="修改学生金币收入日志类型", notes="修改学生金币收入日志类型")
    public ResultObjectModel updateUserInPriceLogType(@RequestBody UserInPriceLog userInPriceLog) throws Exception {
        //获取所需参数
        UserInPriceLog userInPriceLog1 = new UserInPriceLog();
        userInPriceLog1.setId(userInPriceLog.getId());
        userInPriceLog1.setType(userInPriceLog.getType());
        //更新
        userInPriceLogService.updateUserInPriceLog(userInPriceLog1);
        //添加到结果集
        List<UserInPriceLog> lists = new ArrayList<>();
        lists.add(userInPriceLogService.selectUserInPriceLogById(userInPriceLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除学生金币收入日志
     * @param userInPriceLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生金币收入日志", notes="删除学生金币收入日志")
    public ResultObjectModel deletById(@RequestBody UserInPriceLog userInPriceLog) throws Exception {
        List<UserInPriceLog> lists = new ArrayList<>();
        lists.add( userInPriceLogService.selectUserInPriceLogById(userInPriceLog.getId()));
        userInPriceLogService.deletUserInPriceLog(userInPriceLog);
        return ResultObjectModel.success("成功",lists);
    }


//    /**
//     * 更新集合生产
//     * @param params
//     * @param alog
//     * @return
//     */
//    private List<UserInPriceLog> createUserInPriceLog(Map<String,String> params, String alog){
//        UserInPriceLog userInPriceLog = (UserInPriceLog) UserInPriceUtils.updateutils(params,alog);
//        userInPriceLogService.updateUserInPriceLog(userInPriceLog);
//        List<UserInPriceLog> lists = new ArrayList<>();
//        lists.add( userInPriceLogService.selectUserInPriceLogById(userInPriceLog.getId()));
//        return lists;
//    }
}
