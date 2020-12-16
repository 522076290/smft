package com.smfst.xcw.controller;

import com.smfst.xcw.model.UserSellOutLog;
import com.smfst.xcw.service.UserSellOutLogService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserSellOutLogController
 * @Author lan
 * @Date 2020/11/7 15:37
 **/
@RestController
@RequestMapping("UserSellOutLog")
@Api(tags = "学生卖出记录接口控制器")
public class UserSellOutLogController {


    @Autowired
    private UserSellOutLogService userSellOutLogService;

    /**
     * 查询全部学生卖出记录
     * @return
     */
    @ApiOperation(value="查询全部学生卖出记录", notes="查询全部学生卖出记录")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserSellOutLog> list = userSellOutLogService.selectUserSellOutLogList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生卖出记录
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生卖出记录", notes="通过id查询学生卖出记录")
    public ResultObjectModel selectUserSellOutLogById(@RequestBody UserSellOutLog userSellOutLog) throws Exception {
        List<UserSellOutLog> lists = new ArrayList<>();
        lists.add(userSellOutLogService.selectUserSellOutLogById(userSellOutLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生卖出记录
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生卖出记录", notes="通过指定参数查询学生卖出记录")
    public ResultObjectModel selectUserSellOutLogByPartment(@RequestBody UserSellOutLog userSellOutLog) throws Exception {
        List<UserSellOutLog> lists = userSellOutLogService.selectUserSellOutLogByParameter(userSellOutLog);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生卖出记录
     * @param userSellOutLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生卖出记录", notes="新增学生卖出记录")
    public ResultObjectModel createUserUserSellOutLog(@RequestBody UserSellOutLog userSellOutLog) throws Exception {
        userSellOutLogService.createUserSellOutLog(userSellOutLog);
        List<UserSellOutLog> lists = new ArrayList<>();
        lists.add(userSellOutLogService.selectUserSellOutLogById(userSellOutLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生卖出记录
     * @param userSellOutLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生卖出记录", notes="修改学生卖出记录")
    public ResultObjectModel updateUserSellOutLog(@RequestBody UserSellOutLog userSellOutLog) throws Exception {
        userSellOutLogService.updateUserSellOutLog(userSellOutLog);
        List<UserSellOutLog> lists = new ArrayList<>();
        lists.add( userSellOutLogService.selectUserSellOutLogById(userSellOutLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生卖出记录学生工厂
     * @param userSellOutLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生卖出记录学生工厂", notes="修改学生卖出记录学生工厂")
    public ResultObjectModel updateUserSellOutLogWorkId(@RequestBody UserSellOutLog userSellOutLog) throws Exception {

        //获取所需参数
        UserSellOutLog userSellOutLog1 = new UserSellOutLog();
        userSellOutLog1.setId(userSellOutLog.getId());
        userSellOutLog1.setUserWorkId(userSellOutLog.getUserWorkId());

        //更新
        userSellOutLogService.updateUserSellOutLog(userSellOutLog1);
        //添加到结果集
        List<UserSellOutLog> lists = new ArrayList<>();
        lists.add(userSellOutLogService.selectUserSellOutLogById(userSellOutLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生卖出记录汽车
     * @param userSellOutLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateCarId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生卖出记录汽车", notes="修改学生卖出记录汽车")
    public ResultObjectModel updateUserSellOutLogCarId(@RequestBody UserSellOutLog userSellOutLog) throws Exception {

        //获取所需参数
        UserSellOutLog userSellOutLog1 = new UserSellOutLog();
        userSellOutLog1.setId(userSellOutLog.getId());
        userSellOutLog1.setCarId(userSellOutLog.getCarId());

        //更新
        userSellOutLogService.updateUserSellOutLog(userSellOutLog1);
        //添加到结果集
        List<UserSellOutLog> lists = new ArrayList<>();
        lists.add(userSellOutLogService.selectUserSellOutLogById(userSellOutLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生卖出记录时间
     * @param userSellOutLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改学生卖出记录时间", notes="修改学生卖出记录时间")
    public ResultObjectModel updateUserSellOutLogTime(@RequestBody UserSellOutLog userSellOutLog) throws Exception {

        //获取所需参数
        UserSellOutLog userSellOutLog1 = new UserSellOutLog();
        userSellOutLog1.setId(userSellOutLog.getId());
        userSellOutLog1.setTime(userSellOutLog.getTime());
        //更新
        userSellOutLogService.updateUserSellOutLog(userSellOutLog1);
        //添加到结果集
        List<UserSellOutLog> lists = new ArrayList<>();
        lists.add(userSellOutLogService.selectUserSellOutLogById(userSellOutLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改学生卖出记录价格
     * @param userSellOutLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateGold",method = RequestMethod.POST)
    @ApiOperation(value="修改学生卖出记录价格", notes="修改学生卖出记录价格")
    public ResultObjectModel updateUserSellOutLogGold(@RequestBody UserSellOutLog userSellOutLog) throws Exception {

        //获取所需参数
        UserSellOutLog userSellOutLog1 = new UserSellOutLog();
        userSellOutLog1.setId(userSellOutLog.getId());
        userSellOutLog1.setGold(userSellOutLog.getGold());
        //更新
        userSellOutLogService.updateUserSellOutLog(userSellOutLog1);
        //添加到结果集
        List<UserSellOutLog> lists = new ArrayList<>();
        lists.add(userSellOutLogService.selectUserSellOutLogById(userSellOutLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改学生卖出记录数量
     * @param userSellOutLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateNum",method = RequestMethod.POST)
    @ApiOperation(value="修改学生卖出记录数量", notes="修改学生卖出记录数量")
    public ResultObjectModel updateUserSellOutLogNum(@RequestBody UserSellOutLog userSellOutLog) throws Exception {

        //获取所需参数
        UserSellOutLog userSellOutLog1 = new UserSellOutLog();
        userSellOutLog1.setId(userSellOutLog.getId());
        userSellOutLog1.setNum(userSellOutLog.getNum());
        //更新
        userSellOutLogService.updateUserSellOutLog(userSellOutLog1);
        //添加到结果集
        List<UserSellOutLog> lists = new ArrayList<>();
        lists.add(userSellOutLogService.selectUserSellOutLogById(userSellOutLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 删除学生卖出记录
     * @param userSellOutLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生卖出记录", notes="删除学生卖出记录")
    public ResultObjectModel deletById(@RequestBody UserSellOutLog userSellOutLog) throws Exception {
        List<UserSellOutLog> lists = new ArrayList<>();
        lists.add( userSellOutLogService.selectUserSellOutLogById(userSellOutLog.getId()));
        userSellOutLogService.deletUserSellOutLog(userSellOutLog);
        return ResultObjectModel.success("成功",lists);
    }
}

