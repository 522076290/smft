package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/28
 */

import com.smfst.xcw.model.UserPartLog;
import com.smfst.xcw.model.UserPartPurchaseLog;
import com.smfst.xcw.service.UserPartPurchaseLogService;
import com.smfst.xcw.utils.ResultObjectModel;
import com.smfst.xcw.utils.UserPartPurchaseLogUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *@ClassName UserPartPurchaseLogController
 *@Author lan
 *@Date 2020/10/28 10:18
 **/
@RestController
@RequestMapping("UserPartPurchaseLog")
@Api(tags = "学生流通原材料日志接口控制器")
public class UserPartPurchaseLogController {

    @Autowired
    private UserPartPurchaseLogService userPartPurchaseLogService;

    /**
     * 查询全部学生流通原材料日志
     * @return
     */
    @ApiOperation(value="查询全部学生流通原材料日志", notes="查询全部学生流通原材料日志")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserPartPurchaseLog> list = userPartPurchaseLogService.selectUserPartPurchaseLogList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生流通原材料日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生流通原材料日志", notes="通过id查询学生流通原材料日志")
    public ResultObjectModel selectUserPartPurchaseLogById(@RequestBody UserPartPurchaseLog UserPartPurchaseLog) throws Exception {
        List<com.smfst.xcw.model.UserPartPurchaseLog> lists = new ArrayList<>();
        lists.add(userPartPurchaseLogService.selectUserPartPurchaseLogById(UserPartPurchaseLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生流通原材料日志
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生流通原材料日志", notes="通过指定参数查询学生流通原材料日志")
    public ResultObjectModel selectUserPartPurchaseLogByPartment(@RequestBody UserPartPurchaseLog UserPartPurchaseLog) throws Exception {
        List<com.smfst.xcw.model.UserPartPurchaseLog> lists = userPartPurchaseLogService.selectUserPartPurchaseLogByParameter(UserPartPurchaseLog);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生流通原材料日志
     * @param UserPartPurchaseLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生流通原材料日志", notes="新增学生流通原材料日志")
    public ResultObjectModel createUserPartPurchaseLog(@RequestBody UserPartPurchaseLog UserPartPurchaseLog) throws Exception {
        userPartPurchaseLogService.createUserPartPurchaseLog(UserPartPurchaseLog);
        List<com.smfst.xcw.model.UserPartPurchaseLog> lists = new ArrayList<>();
        lists.add( userPartPurchaseLogService.selectUserPartPurchaseLogById(UserPartPurchaseLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生流通原材料日志
     * @param UserPartPurchaseLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生流通原材料日志", notes="修改学生流通原材料日志")
    public ResultObjectModel updateUserPartPurchaseLog(@RequestBody UserPartPurchaseLog UserPartPurchaseLog) throws Exception {
        userPartPurchaseLogService.updateUserPartPurchaseLog(UserPartPurchaseLog);
        List<com.smfst.xcw.model.UserPartPurchaseLog> lists = new ArrayList<>();
        lists.add( userPartPurchaseLogService.selectUserPartPurchaseLogById(UserPartPurchaseLog.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生流通原材料日志学生工厂
     * @param userPartPurchaseLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生流通原材料日志学生工厂", notes="修改学生流通原材料日志学生工厂")
    public ResultObjectModel updateUserPartPurchaseLogUserWorkId(@RequestBody UserPartPurchaseLog userPartPurchaseLog) throws Exception {
        //获取所需参数
        UserPartPurchaseLog userPartPurchaseLog1 = new UserPartPurchaseLog();
        userPartPurchaseLog1.setId(userPartPurchaseLog.getId());
        userPartPurchaseLog1.setUserWorkId(userPartPurchaseLog.getUserWorkId());

        //更新
        userPartPurchaseLogService.updateUserPartPurchaseLog(userPartPurchaseLog1);
        //添加到结果集
        List<UserPartPurchaseLog> lists = new ArrayList<>();
        lists.add(userPartPurchaseLogService.selectUserPartPurchaseLogById(userPartPurchaseLog.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生流通原材料日志学生生产线
     * @param userPartPurchaseLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生流通原材料日志学生生产线", notes="修改学生流通原材料日志学生生产线")
    public ResultObjectModel updateUserPartPurchaseLogUserProductionLineId(@RequestBody UserPartPurchaseLog userPartPurchaseLog) throws Exception {
        //获取所需参数
        UserPartPurchaseLog userPartPurchaseLog1 = new UserPartPurchaseLog();
        userPartPurchaseLog1.setId(userPartPurchaseLog.getId());
        userPartPurchaseLog1.setUserProductionLineId(userPartPurchaseLog.getUserProductionLineId());

        //更新
        userPartPurchaseLogService.updateUserPartPurchaseLog(userPartPurchaseLog1);
        //添加到结果集
        List<UserPartPurchaseLog> lists = new ArrayList<>();
        lists.add(userPartPurchaseLogService.selectUserPartPurchaseLogById(userPartPurchaseLog.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生流通原材料日志生产工序
     * @param userPartPurchaseLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserStageId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生流通原材料日志生产工序", notes="修改学生流通原材料日志生产工序")
    public ResultObjectModel updateUserPartPurchaseLogUserStageId(@RequestBody UserPartPurchaseLog userPartPurchaseLog) throws Exception {
        //获取所需参数
        UserPartPurchaseLog userPartPurchaseLog1 = new UserPartPurchaseLog();
        userPartPurchaseLog1.setId(userPartPurchaseLog.getId());
        userPartPurchaseLog1.setUserStageId(userPartPurchaseLog.getUserStageId());

        //更新
        userPartPurchaseLogService.updateUserPartPurchaseLog(userPartPurchaseLog1);
        //添加到结果集
        List<UserPartPurchaseLog> lists = new ArrayList<>();
        lists.add(userPartPurchaseLogService.selectUserPartPurchaseLogById(userPartPurchaseLog.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生流通原材料日志原材料
     * @param userPartPurchaseLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePartId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生流通原材料日志原材料", notes="修改学生流通原材料日志原材料")
    public ResultObjectModel updateUserPartPurchaseLogPartId(@RequestBody UserPartPurchaseLog userPartPurchaseLog) throws Exception {
        //获取所需参数
        UserPartPurchaseLog userPartPurchaseLog1 = new UserPartPurchaseLog();
        userPartPurchaseLog1.setId(userPartPurchaseLog.getId());
        userPartPurchaseLog1.setPartId(userPartPurchaseLog.getPartId());

        //更新
        userPartPurchaseLogService.updateUserPartPurchaseLog(userPartPurchaseLog1);
        //添加到结果集
        List<UserPartPurchaseLog> lists = new ArrayList<>();
        lists.add(userPartPurchaseLogService.selectUserPartPurchaseLogById(userPartPurchaseLog.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生流通原材料日志数量
     * @param userPartPurchaseLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateNum",method = RequestMethod.POST)
    @ApiOperation(value="修改学生流通原材料日志数量", notes="修改学生流通原材料日志数量")
    public ResultObjectModel updateUserPartPurchaseLogNum(@RequestBody UserPartPurchaseLog userPartPurchaseLog) throws Exception {
        //获取所需参数
        UserPartPurchaseLog userPartPurchaseLog1 = new UserPartPurchaseLog();
        userPartPurchaseLog1.setId(userPartPurchaseLog.getId());
        userPartPurchaseLog1.setNum(userPartPurchaseLog.getNum());

        //更新
        userPartPurchaseLogService.updateUserPartPurchaseLog(userPartPurchaseLog1);
        //添加到结果集
        List<UserPartPurchaseLog> lists = new ArrayList<>();
        lists.add(userPartPurchaseLogService.selectUserPartPurchaseLogById(userPartPurchaseLog.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生流通原材料日志时间
     * @param userPartPurchaseLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改学生流通原材料日志时间", notes="修改学生流通原材料日志时间")
    public ResultObjectModel updateUserPartPurchaseLogTime(@RequestBody UserPartPurchaseLog userPartPurchaseLog) throws Exception {
        //获取所需参数
        UserPartPurchaseLog userPartPurchaseLog1 = new UserPartPurchaseLog();
        userPartPurchaseLog1.setId(userPartPurchaseLog.getId());
        userPartPurchaseLog1.setTime(userPartPurchaseLog.getTime());

        //更新
        userPartPurchaseLogService.updateUserPartPurchaseLog(userPartPurchaseLog1);
        //添加到结果集
        List<UserPartPurchaseLog> lists = new ArrayList<>();
        lists.add(userPartPurchaseLogService.selectUserPartPurchaseLogById(userPartPurchaseLog.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除学生流通原材料日志
     * @param userPartLog
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生流通原材料日志", notes="删除学生流通原材料日志")
    public ResultObjectModel deletById(@RequestBody UserPartPurchaseLog userPartLog) throws Exception {
        List<UserPartPurchaseLog> lists = new ArrayList<>();
        lists.add( userPartPurchaseLogService.selectUserPartPurchaseLogById(userPartLog.getId()));
        userPartPurchaseLogService.deletUserPartPurchaseLog(userPartLog);
        return ResultObjectModel.success("成功",lists);
    }


  

}
