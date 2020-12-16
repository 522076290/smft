package com.smfst.xcw.controller;

import com.smfst.xcw.model.UserPeople;
import com.smfst.xcw.model.UserPeopleLog;
import com.smfst.xcw.service.UserPeopleLogService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserPeopleLogLogController
 * @Author lan
 * @Date 2020/11/5 23:51
 **/
@RestController
@RequestMapping("UserPeopleLogLog")
@Api(tags = "学生招募员工日志接口控制器")
public class UserPeopleLogController {
    @Autowired
    private UserPeopleLogService userPeopleLogLogService;


    /**
     * 查询全部学生招募员工日志
     * @return
     */
    @ApiOperation(value="查询全部学生招募员工日志", notes="查询全部学生招募员工日志")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserPeopleLog> list = userPeopleLogLogService.selectUserPeopleLogList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生招募员工日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生招募员工日志", notes="通过id查询学生招募员工日志")
    public ResultObjectModel selectUserPeopleLogById(@RequestBody UserPeopleLog userPeopleLog) throws Exception {
        List<UserPeopleLog> lists = new ArrayList<>();
        lists.add(userPeopleLogLogService.selectUserPeopleLogById(userPeopleLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生招募员工日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生招募员工日志", notes="通过指定参数查询学生招募员工日志")
    public ResultObjectModel selectUserPeopleLogByPartment(@RequestBody UserPeopleLog userPeopleLog) throws Exception {
        List<UserPeopleLog> lists = userPeopleLogLogService.selectUserPeopleLogByParameter(userPeopleLog);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生招募员工日志
     * @param userPeopleLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生招募员工日志", notes="新增学生招募员工日志")
    public ResultObjectModel createUserUserPeopleLog(@RequestBody UserPeopleLog userPeopleLog) throws Exception {
        userPeopleLogLogService.createUserPeopleLog(userPeopleLog);
        List<UserPeopleLog> lists = new ArrayList<>();
        lists.add(userPeopleLogLogService.selectUserPeopleLogById(userPeopleLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生招募员工日志
     * @param userPeopleLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生招募员工日志", notes="修改学生招募员工日志")
    public ResultObjectModel updateUserPeopleLog(@RequestBody UserPeopleLog userPeopleLog) throws Exception {
        userPeopleLogLogService.updateUserPeopleLog(userPeopleLog);
        List<UserPeopleLog> lists = new ArrayList<>();
        lists.add( userPeopleLogLogService.selectUserPeopleLogById(userPeopleLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生招募员工日志学生工厂
     * @param userPeopleLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生招募员工日志学生工厂", notes="修改学生招募员工日志学生工厂")
    public ResultObjectModel updateUserPeopleLogWorkId(@RequestBody UserPeopleLog userPeopleLog) throws Exception {

        //获取所需参数
        UserPeopleLog userPeopleLog1 = new UserPeopleLog();
        userPeopleLog1.setId(userPeopleLog.getId());
        userPeopleLog1.setUserWorkId(userPeopleLog.getUserWorkId());

        //更新
        userPeopleLogLogService.updateUserPeopleLog(userPeopleLog1);
        //添加到结果集
        List<UserPeopleLog> lists = new ArrayList<>();
        lists.add(userPeopleLogLogService.selectUserPeopleLogById(userPeopleLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生招募员工日志学生员工
     * @param userPeopleLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserPeopleId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生招募员工日志学生员工", notes="修改学生招募员工日志学生员工")
    public ResultObjectModel updateUserPeopleLogUserPeopleId(@RequestBody UserPeopleLog userPeopleLog) throws Exception {

        //获取所需参数
        UserPeopleLog userPeopleLog1 = new UserPeopleLog();
        userPeopleLog1.setId(userPeopleLog.getId());
        userPeopleLog1.setUserPeopleId(userPeopleLog.getUserPeopleId());

        //更新
        userPeopleLogLogService.updateUserPeopleLog(userPeopleLog1);
        //添加到结果集
        List<UserPeopleLog> lists = new ArrayList<>();
        lists.add(userPeopleLogLogService.selectUserPeopleLogById(userPeopleLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生招募员工日志时间
     * @param userPeopleLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改学生招募员工日志时间", notes="修改学生招募员工日志时间")
    public ResultObjectModel updateTime(@RequestBody UserPeopleLog userPeopleLog) throws Exception {

        //获取所需参数
        UserPeopleLog userPeopleLog1 = new UserPeopleLog();
        userPeopleLog1.setId(userPeopleLog.getId());
        userPeopleLog1.setTime(userPeopleLog.getTime());

        //更新
        userPeopleLogLogService.updateUserPeopleLog(userPeopleLog1);
        //添加到结果集
        List<UserPeopleLog> lists = new ArrayList<>();
        lists.add(userPeopleLogLogService.selectUserPeopleLogById(userPeopleLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 删除学生招募员工日志
     * @param userPeople
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生招募员工日志", notes="删除学生招募员工日志")
    public ResultObjectModel deletById(@RequestBody UserPeopleLog userPeople) throws Exception {
        List<UserPeopleLog> lists = new ArrayList<>();
        lists.add( userPeopleLogLogService.selectUserPeopleLogById(userPeople.getId()));
        userPeopleLogLogService.deletUserPeopleLog(userPeople);
        return ResultObjectModel.success("成功",lists);
    }
}
