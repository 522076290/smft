package com.smfst.xcw.controller;

import com.smfst.xcw.model.UserNormalCarStore;
import com.smfst.xcw.model.UserRepairCarLog;
import com.smfst.xcw.model.UserRepairCarLog;
import com.smfst.xcw.model.UserRepairCarLog;
import com.smfst.xcw.service.UserRepairCarLogService;
import com.smfst.xcw.utils.ResultObjectModel;
import com.smfst.xcw.utils.UserNormalCarStoreUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserRepairCarLogController
 * @Author lan
 * @Date 2020/11/5 11:29
 **/
@RestController
@RequestMapping("UserRepairCarLog")
@Api(tags = "维修车辆出厂日志接口控制器")
public class UserRepairCarLogController {

    @Autowired
    private UserRepairCarLogService userRepairCarLogService;

    /**
     * 查询全部维修车辆出厂日志
     * @return
     */
    @ApiOperation(value="查询全部维修车辆出厂日志", notes="查询全部维修车辆出厂日志")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserRepairCarLog> list = userRepairCarLogService.selectUserRepairCarLogList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询维修车辆出厂日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询维修车辆出厂日志", notes="通过id查询维修车辆出厂日志")
    public ResultObjectModel selectUserRepairCarLogById(@RequestBody UserRepairCarLog userRepairCarLog) throws Exception {
        List<UserRepairCarLog> lists = new ArrayList<>();
        lists.add(userRepairCarLogService.selectUserRepairCarLogById(userRepairCarLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询维修车辆出厂日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询维修车辆出厂日志", notes="通过指定参数查询维修车辆出厂日志")
    public ResultObjectModel selectUserRepairCarLogByPartment(@RequestBody UserRepairCarLog userRepairCarLog) throws Exception {
        List<UserRepairCarLog> lists = userRepairCarLogService.selectUserRepairCarLogByParameter(userRepairCarLog);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增维修车辆出厂日志
     * @param userRepairCarLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增维修车辆出厂日志", notes="新增维修车辆出厂日志")
    public ResultObjectModel createUserUserRepairCarLog(@RequestBody UserRepairCarLog userRepairCarLog) throws Exception {
        userRepairCarLogService.createUserRepairCarLog(userRepairCarLog);
        List<UserRepairCarLog> lists = new ArrayList<>();
        lists.add(userRepairCarLogService.selectUserRepairCarLogById(userRepairCarLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改维修车辆出厂日志
     * @param userRepairCarLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改维修车辆出厂日志", notes="修改维修车辆出厂日志")
    public ResultObjectModel updateUserRepairCarLog(@RequestBody UserRepairCarLog userRepairCarLog) throws Exception {
        userRepairCarLogService.updateUserRepairCarLog(userRepairCarLog);
        List<UserRepairCarLog> lists = new ArrayList<>();
        lists.add( userRepairCarLogService.selectUserRepairCarLogById(userRepairCarLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改维修车辆出厂日志学生工厂
     * @param userRepairCarLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改维修车辆出厂日志学生工厂", notes="修改维修车辆出厂日志学生工厂")
    public ResultObjectModel updateUserRepairCarLogWorkId(@RequestBody UserRepairCarLog userRepairCarLog) throws Exception {

        //获取所需参数
        UserRepairCarLog userRepairCarLog1 = new UserRepairCarLog();
        userRepairCarLog1.setId(userRepairCarLog.getId());
        userRepairCarLog1.setUserWorkId(userRepairCarLog.getUserWorkId());

        //更新
        userRepairCarLogService.updateUserRepairCarLog(userRepairCarLog1);
        //添加到结果集
        List<UserRepairCarLog> lists = new ArrayList<>();
        lists.add(userRepairCarLogService.selectUserRepairCarLogById(userRepairCarLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改维修车辆出厂日志学生生产线
     * @param userRepairCarLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改维修车辆出厂日志学生工厂", notes="修改维修车辆出厂日志学生工厂")
    public ResultObjectModel updateUserRepairCarLogUserProductionLineId(@RequestBody UserRepairCarLog userRepairCarLog) throws Exception {

        //获取所需参数
        UserRepairCarLog userRepairCarLog1 = new UserRepairCarLog();
        userRepairCarLog1.setId(userRepairCarLog.getId());
        userRepairCarLog1.setUserProductionLineId(userRepairCarLog.getUserProductionLineId());

        //更新
        userRepairCarLogService.updateUserRepairCarLog(userRepairCarLog1);
        //添加到结果集
        List<UserRepairCarLog> lists = new ArrayList<>();
        lists.add(userRepairCarLogService.selectUserRepairCarLogById(userRepairCarLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改维修车辆出厂日志汽车
     * @param userRepairCarLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateCarId",method = RequestMethod.POST)
    @ApiOperation(value="修改维修车辆出厂日志汽车", notes="修改维修车辆出厂日志汽车")
    public ResultObjectModel updateUserRepairCarLogCarId(@RequestBody UserRepairCarLog userRepairCarLog) throws Exception {

        //获取所需参数
        UserRepairCarLog userRepairCarLog1 = new UserRepairCarLog();
        userRepairCarLog1.setId(userRepairCarLog.getId());
        userRepairCarLog1.setCarId(userRepairCarLog.getCarId());
        //更新
        userRepairCarLogService.updateUserRepairCarLog(userRepairCarLog1);
        //添加到结果集
        List<UserRepairCarLog> lists = new ArrayList<>();
        lists.add(userRepairCarLogService.selectUserRepairCarLogById(userRepairCarLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改维修车辆出厂日志汽车
     * @param userRepairCarLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改维修车辆出厂日志汽车", notes="修改维修车辆出厂日志汽车")
    public ResultObjectModel updateUserRepairCarLogTime(@RequestBody UserRepairCarLog userRepairCarLog) throws Exception {

        //获取所需参数
        UserRepairCarLog userRepairCarLog1 = new UserRepairCarLog();
        userRepairCarLog1.setId(userRepairCarLog.getId());
        userRepairCarLog1.setTime(userRepairCarLog.getTime());
        //更新
        userRepairCarLogService.updateUserRepairCarLog(userRepairCarLog1);
        //添加到结果集
        List<UserRepairCarLog> lists = new ArrayList<>();
        lists.add(userRepairCarLogService.selectUserRepairCarLogById(userRepairCarLog1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 删除维修车辆出厂日志
     * @param userRepairCarLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除维修车辆出厂日志", notes="删除维修车辆出厂日志")
    public ResultObjectModel deletById(@RequestBody UserRepairCarLog userRepairCarLog) throws Exception {
        List<UserRepairCarLog> lists = new ArrayList<>();
        lists.add( userRepairCarLogService.selectUserRepairCarLogById(userRepairCarLog.getId()));
        userRepairCarLogService.deletUserRepairCarLog(userRepairCarLog);
        return ResultObjectModel.success("成功",lists);
    }

}
