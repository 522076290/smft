package com.smfst.xcw.controller;

import com.smfst.xcw.model.UserNormalCarLog;
import com.smfst.xcw.model.UserNormalCarLog;
import com.smfst.xcw.model.UserNormalCarLog;
import com.smfst.xcw.service.UserNormalCarLogService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserNormalCarLogController
 * @Author lan
 * @Date 2020/11/5 0:31
 **/
@RestController
@RequestMapping("UserNormalCarLog")
@Api(tags = "正常车辆出厂日志接口控制器")
public class UserNormalCarLogController {

    @Autowired
    private UserNormalCarLogService userNormalCarStoreService;

    /**
     * 查询全部正常车辆出厂日志
     * @return
     */
    @ApiOperation(value="查询全部正常车辆出厂日志", notes="查询全部正常车辆出厂日志")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserNormalCarLog> list = userNormalCarStoreService.selectUserNormalCarLogList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询正常车辆出厂日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询正常车辆出厂日志", notes="通过id查询正常车辆出厂日志")
    public ResultObjectModel selectUserNormalCarLogById(@RequestBody UserNormalCarLog userNormalCarStore) throws Exception {
        List<UserNormalCarLog> lists = new ArrayList<>();
        lists.add(userNormalCarStoreService.selectUserNormalCarLogById(userNormalCarStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询正常车辆出厂日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询正常车辆出厂日志", notes="通过指定参数查询正常车辆出厂日志")
    public ResultObjectModel selectUserNormalCarLogByPartment(@RequestBody UserNormalCarLog userNormalCarStore) throws Exception {
        List<UserNormalCarLog> lists = userNormalCarStoreService.selectUserNormalCarLogByParameter(userNormalCarStore);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增正常车辆出厂日志
     * @param userNormalCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增正常车辆出厂日志", notes="新增正常车辆出厂日志")
    public ResultObjectModel createUserUserNormalCarLog(@RequestBody UserNormalCarLog userNormalCarStore) throws Exception {
        userNormalCarStoreService.createUserNormalCarLog(userNormalCarStore);
        List<UserNormalCarLog> lists = new ArrayList<>();
        lists.add( userNormalCarStoreService.selectUserNormalCarLogById(userNormalCarStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改正常车辆出厂日志
     * @param userNormalCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改正常车辆出厂日志", notes="修改正常车辆出厂日志")
    public ResultObjectModel updateUserNormalCarLog(@RequestBody UserNormalCarLog userNormalCarStore) throws Exception {
        userNormalCarStoreService.updateUserNormalCarLog(userNormalCarStore);
        List<UserNormalCarLog> lists = new ArrayList<>();
        lists.add( userNormalCarStoreService.selectUserNormalCarLogById(userNormalCarStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改正常车辆出厂日志学生工厂
     * @param userNormalCarLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改正常车辆出厂日志学生工厂", notes="修改正常车辆出厂日志学生工厂")
    public ResultObjectModel updateUserNormalCarLogWorkId(@RequestBody UserNormalCarLog userNormalCarLog) throws Exception {

        //获取所需参数
        UserNormalCarLog userNormalCarLog1 = new UserNormalCarLog();
        userNormalCarLog1.setId(userNormalCarLog.getId());
        userNormalCarLog1.setUserWorkId(userNormalCarLog.getUserWorkId());

        //更新
        userNormalCarStoreService.updateUserNormalCarLog(userNormalCarLog1);
        //添加到结果集
        List<UserNormalCarLog> lists = new ArrayList<>();
        lists.add(userNormalCarStoreService.selectUserNormalCarLogById(userNormalCarLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改正常车辆出厂日志学生生产线
     * @param userNormalCarLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改正常车辆出厂日志学生工厂", notes="修改正常车辆出厂日志学生工厂")
    public ResultObjectModel updateUserNormalCarLogUserProductionLineId(@RequestBody UserNormalCarLog userNormalCarLog) throws Exception {

        //获取所需参数
        UserNormalCarLog userNormalCarLog1 = new UserNormalCarLog();
        userNormalCarLog1.setId(userNormalCarLog.getId());
        userNormalCarLog1.setUserProductionLineId(userNormalCarLog.getUserProductionLineId());

        //更新
        userNormalCarStoreService.updateUserNormalCarLog(userNormalCarLog1);
        //添加到结果集
        List<UserNormalCarLog> lists = new ArrayList<>();
        lists.add(userNormalCarStoreService.selectUserNormalCarLogById(userNormalCarLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改正常车辆出厂日志时间
     * @param userNormalCarLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改正常车辆出厂日志时间", notes="修改正常车辆出厂日志时间")
    public ResultObjectModel updateUserNormalCarLogTime(@RequestBody UserNormalCarLog userNormalCarLog) throws Exception {

        //获取所需参数
        UserNormalCarLog userNormalCarLog1 = new UserNormalCarLog();
        userNormalCarLog1.setId(userNormalCarLog.getId());
        userNormalCarLog1.setTime(userNormalCarLog.getTime());

        //更新
        userNormalCarStoreService.updateUserNormalCarLog(userNormalCarLog1);
        //添加到结果集
        List<UserNormalCarLog> lists = new ArrayList<>();
        lists.add(userNormalCarStoreService.selectUserNormalCarLogById(userNormalCarLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改正常车辆出厂日志汽车
     * @param userNormalCarLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateCarId",method = RequestMethod.POST)
    @ApiOperation(value="修改正常车辆出厂日志汽车", notes="修改正常车辆出厂日志汽车")
    public ResultObjectModel updateUserNormalCarLogCarId(@RequestBody UserNormalCarLog userNormalCarLog) throws Exception {

        //获取所需参数
        UserNormalCarLog userNormalCarLog1 = new UserNormalCarLog();
        userNormalCarLog1.setId(userNormalCarLog.getId());
        userNormalCarLog1.setCarId(userNormalCarLog.getCarId());

        //更新
        userNormalCarStoreService.updateUserNormalCarLog(userNormalCarLog1);
        //添加到结果集
        List<UserNormalCarLog> lists = new ArrayList<>();
        lists.add(userNormalCarStoreService.selectUserNormalCarLogById(userNormalCarLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }
    

    /**
     * 删除正常车辆出厂日志
     * @param userNormalCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除正常车辆出厂日志", notes="删除正常车辆出厂日志")
    public ResultObjectModel deletById(@RequestBody UserNormalCarLog userNormalCarStore) throws Exception {
        List<UserNormalCarLog> lists = new ArrayList<>();
        lists.add( userNormalCarStoreService.selectUserNormalCarLogById(userNormalCarStore.getId()));
        userNormalCarStoreService.deletUserNormalCarLog(userNormalCarStore);
        return ResultObjectModel.success("成功",lists);
    }
    
}
