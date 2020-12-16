package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/28
 */

import com.smfst.xcw.model.UserPartLog;
import com.smfst.xcw.model.UserPartLog;
import com.smfst.xcw.service.UserPartLogService;
import com.smfst.xcw.utils.ResultObjectModel;
import com.smfst.xcw.utils.UserPartLogUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *@ClassName UserPartLogMapper
 *@Author lan
 *@Date 2020/10/28 9:38
 **/
@RestController
@RequestMapping("UserPartLog")
@Api(tags = "学生购买原材料日志接口控制器")
public class UserPartLogController {

    @Autowired
    private UserPartLogService userPartLogService;

    /**
     * 查询全部学生购买原材料日志
     * @return
     */
    @ApiOperation(value="查询全部学生购买原材料日志", notes="查询全部学生购买原材料日志")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserPartLog> list = userPartLogService.selectUserPartLogList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生购买原材料日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生购买原材料日志", notes="通过id查询学生购买原材料日志")
    public ResultObjectModel selectUserPartLogById(@RequestBody UserPartLog UserPartLog) throws Exception {
        List<com.smfst.xcw.model.UserPartLog> lists = new ArrayList<>();
        lists.add(userPartLogService.selectUserPartLogById(UserPartLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生购买原材料日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生购买原材料日志", notes="通过指定参数查询学生购买原材料日志")
    public ResultObjectModel selectUserPartLogByPartment(@RequestBody UserPartLog UserPartLog) throws Exception {
        List<com.smfst.xcw.model.UserPartLog> lists = userPartLogService.selectUserPartLogByParameter(UserPartLog);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生购买原材料日志
     * @param userPartLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生购买原材料日志", notes="新增学生购买原材料日志")
    public ResultObjectModel createUserPartLog(@RequestBody UserPartLog userPartLog) throws Exception {
        userPartLogService.createUserPartLog(userPartLog);
        List<com.smfst.xcw.model.UserPartLog> lists = new ArrayList<>();
        lists.add( userPartLogService.selectUserPartLogById(userPartLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生购买原材料日志
     * @param userPartLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生购买原材料日志", notes="修改学生购买原材料日志")
    public ResultObjectModel updateUserPartLog(@RequestBody UserPartLog userPartLog) throws Exception {
        userPartLogService.updateUserPartLog(userPartLog);
        List<com.smfst.xcw.model.UserPartLog> lists = new ArrayList<>();
        lists.add( userPartLogService.selectUserPartLogById(userPartLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生购买原材料日志学生工厂
     * @param userPartLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生购买原材料日志学生工厂", notes="修改学生购买原材料日志学生工厂")
    public ResultObjectModel updateUserPartLogUserWorkId(@RequestBody UserPartLog userPartLog) throws Exception {
        //获取所需参数
        UserPartLog userPartLog1 = new UserPartLog();
        userPartLog1.setId(userPartLog.getId());
        userPartLog1.setUserWorkId(userPartLog.getUserWorkId());

        //更新
        userPartLogService.updateUserPartLog(userPartLog1);
        //添加到结果集
        List<UserPartLog> lists = new ArrayList<>();
        lists.add(userPartLogService.selectUserPartLogById(userPartLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生购买原材料日志供货列表
     * @param userPartLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateSuppierListId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生购买原材料日志供货列表", notes="修改学生购买原材料日志供货列表")
    public ResultObjectModel updateUserPartLogSuppierListId(@RequestBody UserPartLog userPartLog) throws Exception {
        //获取所需参数
        UserPartLog userPartLog1 = new UserPartLog();
        userPartLog1.setId(userPartLog.getId());
        userPartLog1.setSuppierListId(userPartLog.getSuppierListId());

        //更新
        userPartLogService.updateUserPartLog(userPartLog1);
        //添加到结果集
        List<UserPartLog> lists = new ArrayList<>();
        lists.add(userPartLogService.selectUserPartLogById(userPartLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生购买原材料日志数量
     * @param userPartLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateNum",method = RequestMethod.POST)
    @ApiOperation(value="修改学生购买原材料日志数量", notes="修改学生购买原材料日志数量")
    public ResultObjectModel updateUserPartLogNum(@RequestBody UserPartLog userPartLog) throws Exception {
        //获取所需参数
        UserPartLog userPartLog1 = new UserPartLog();
        userPartLog1.setId(userPartLog.getId());
        userPartLog1.setNum(userPartLog.getNum());

        //更新
        userPartLogService.updateUserPartLog(userPartLog1);
        //添加到结果集
        List<UserPartLog> lists = new ArrayList<>();
        lists.add(userPartLogService.selectUserPartLogById(userPartLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生购买原材料日志购买时间
     * @param userPartLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改学生购买原材料日志购买时间", notes="修改学生购买原材料日志购买时间")
    public ResultObjectModel updateUserPartLogTime(@RequestBody UserPartLog userPartLog) throws Exception {
        //获取所需参数
        UserPartLog userPartLog1 = new UserPartLog();
        userPartLog1.setId(userPartLog.getId());
        userPartLog1.setTime(userPartLog.getTime());

        //更新
        userPartLogService.updateUserPartLog(userPartLog1);
        //添加到结果集
        List<UserPartLog> lists = new ArrayList<>();
        lists.add(userPartLogService.selectUserPartLogById(userPartLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生购买原材料日志价格
     * @param userPartLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateGold",method = RequestMethod.POST)
    @ApiOperation(value="修改学生购买原材料日志价格", notes="修改学生购买原材料日志价格")
    public ResultObjectModel updateUserPartLogGold(@RequestBody UserPartLog userPartLog) throws Exception {
        //获取所需参数
        UserPartLog userPartLog1 = new UserPartLog();
        userPartLog1.setId(userPartLog.getId());
        userPartLog1.setGold(userPartLog.getGold());

        //更新
        userPartLogService.updateUserPartLog(userPartLog1);
        //添加到结果集
        List<UserPartLog> lists = new ArrayList<>();
        lists.add(userPartLogService.selectUserPartLogById(userPartLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除学生购买原材料日志
     * @param userPartLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生购买原材料日志", notes="删除学生购买原材料日志")
    public ResultObjectModel deletById(@RequestBody UserPartLog userPartLog) throws Exception {
        List<UserPartLog> lists = new ArrayList<>();
        lists.add( userPartLogService.selectUserPartLogById(userPartLog.getId()));
        userPartLogService.deletUserPartLog(userPartLog);
        return ResultObjectModel.success("成功",lists);
    }


    
}
