package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/27
 */

import com.smfst.xcw.model.UserPlStepInfo;
import com.smfst.xcw.service.UserPlStepInfoService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName UserPlStepInfoController
 *@Author lan
 *@Date 2020/10/27 10:10
 **/
@RestController
@RequestMapping("UserPlStepInfo")
@Api(tags = "学生生产环节接口信息控制器")
public class UserPlStepInfoController {
    @Autowired
    private UserPlStepInfoService userPlStepInfoService;

    /**
     * 查询全部学生生产环节信息
     * @return
     */
    @ApiOperation(value="查询全部学生生产环节信息", notes="查询全部学生生产环节信息")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserPlStepInfo> list = userPlStepInfoService.selectUserPlStepInfoList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生生产环节信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生生产环节信息", notes="通过id查询学生生产环节信息")
    public ResultObjectModel selectUserPlStepById(@RequestBody UserPlStepInfo userPlStepInfo) throws Exception {
        List<UserPlStepInfo> lists = new ArrayList<>();
        lists.add(userPlStepInfoService.selectUserPlStepInfoById(userPlStepInfo.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生生产环节信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生生产环节信息", notes="通过指定参数查询学生生产环节信息")
    public ResultObjectModel selectUserPlStepByPartment(@RequestBody UserPlStepInfo userPlStepInfo) throws Exception {
        List<UserPlStepInfo> lists = userPlStepInfoService.selectUserPlStepInfoByParameter(userPlStepInfo);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生生产环节信息
     * @param userPlStepInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生生产环节信息", notes="新增学生生产环节信息")
    public ResultObjectModel createUserPlStep(@RequestBody UserPlStepInfo userPlStepInfo) throws Exception {
        userPlStepInfoService.createUserPlStepInfo(userPlStepInfo);
        List<UserPlStepInfo> lists = new ArrayList<>();
        lists.add( userPlStepInfoService.selectUserPlStepInfoById(userPlStepInfo.getId()));
        return ResultObjectModel.success("成功",lists);
    }



    /**
     * 修改学生生产环节信息
     * @param userPlStepInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节信息", notes="修改学生生产环节信息")
    public ResultObjectModel updateUserPlStep(@RequestBody UserPlStepInfo userPlStepInfo) throws Exception {
        userPlStepInfoService.updateUserPlStepInfo(userPlStepInfo);
        List<UserPlStepInfo> lists = new ArrayList<>();
        lists.add( userPlStepInfoService.selectUserPlStepInfoById(userPlStepInfo.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生生产环节信息生产环节名称
     * @param userPlStepInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePlStepName",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节信息生产环节名称", notes="修改学生生产环节信息生产环节名称")
    public ResultObjectModel updateUserPlStepPlStepName(@RequestBody UserPlStepInfo userPlStepInfo) throws Exception {
        //获取所需参数
        UserPlStepInfo userPlStepInfo1 = new UserPlStepInfo();
        userPlStepInfo1.setId(userPlStepInfo.getId());
        userPlStepInfo1.setPlStepName(userPlStepInfo.getPlStepName());

        //更新
        userPlStepInfoService.updateUserPlStepInfo(userPlStepInfo1);
        //添加到结果集
        List<UserPlStepInfo> lists = new ArrayList<>();
        lists.add(userPlStepInfoService.selectUserPlStepInfoById(userPlStepInfo.getId()));

        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改学生生产环节信息生产工序
     * @param userPlStepInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateStageId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节信息生产工序", notes="修改学生生产环节信息生产工序")
    public ResultObjectModel updateUserPlStepStageId(@RequestBody UserPlStepInfo userPlStepInfo) throws Exception {
        //获取所需参数
        UserPlStepInfo userPlStepInfo1 = new UserPlStepInfo();
        userPlStepInfo1.setId(userPlStepInfo.getId());
        userPlStepInfo1.setStageId(userPlStepInfo.getStageId());

        //更新
        userPlStepInfoService.updateUserPlStepInfo(userPlStepInfo1);
        //添加到结果集
        List<UserPlStepInfo> lists = new ArrayList<>();
        lists.add(userPlStepInfoService.selectUserPlStepInfoById(userPlStepInfo.getId()));

        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改学生生产环节信息耗时
     * @param userPlStepInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateCostTime",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节信息耗时", notes="修改学生生产环节信息耗时")
    public ResultObjectModel updateUserPlStepCostTime(@RequestBody UserPlStepInfo userPlStepInfo) throws Exception {
        //获取所需参数
        UserPlStepInfo userPlStepInfo1 = new UserPlStepInfo();
        userPlStepInfo1.setId(userPlStepInfo.getId());
        userPlStepInfo1.setCostTime(userPlStepInfo.getCostTime());

        //更新
        userPlStepInfoService.updateUserPlStepInfo(userPlStepInfo1);
        //添加到结果集
        List<UserPlStepInfo> lists = new ArrayList<>();
        lists.add(userPlStepInfoService.selectUserPlStepInfoById(userPlStepInfo.getId()));

        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改学生生产环节信息步骤
     * @param userPlStepInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateStep",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节信息步骤", notes="修改学生生产环节信息步骤")
    public ResultObjectModel updateUserPlStepStep(@RequestBody UserPlStepInfo userPlStepInfo) throws Exception {
        //获取所需参数
        UserPlStepInfo userPlStepInfo1 = new UserPlStepInfo();
        userPlStepInfo1.setId(userPlStepInfo.getId());
        userPlStepInfo1.setStep(userPlStepInfo.getStep());

        //更新
        userPlStepInfoService.updateUserPlStepInfo(userPlStepInfo1);
        //添加到结果集
        List<UserPlStepInfo> lists = new ArrayList<>();
        lists.add(userPlStepInfoService.selectUserPlStepInfoById(userPlStepInfo.getId()));

        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改学生生产环节信息耐久
     * @param userPlStepInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePower",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节信息耐久", notes="修改学生生产环节信息耐久")
    public ResultObjectModel updateUserPlStepUserWorkPower(@RequestBody UserPlStepInfo userPlStepInfo) throws Exception {
        //获取所需参数
        UserPlStepInfo userPlStepInfo1 = new UserPlStepInfo();
        userPlStepInfo1.setId(userPlStepInfo.getId());
        userPlStepInfo1.setPower(userPlStepInfo.getPower());

        //更新
        userPlStepInfoService.updateUserPlStepInfo(userPlStepInfo1);
        //添加到结果集
        List<UserPlStepInfo> lists = new ArrayList<>();
        lists.add(userPlStepInfoService.selectUserPlStepInfoById(userPlStepInfo.getId()));

        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改学生生产环节信息生产所耗
     * @param userPlStepInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePIStepConsume",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节信息生产所耗", notes="修改学生生产环节信息生产所耗")
    public ResultObjectModel updateUserPlStepUserConsume(@RequestBody UserPlStepInfo userPlStepInfo) throws Exception {
        //获取所需参数
        UserPlStepInfo userPlStepInfo1 = new UserPlStepInfo();
        userPlStepInfo1.setId(userPlStepInfo.getId());
        userPlStepInfo1.setConsume(userPlStepInfo.getConsume());

        //更新
        userPlStepInfoService.updateUserPlStepInfo(userPlStepInfo1);
        //添加到结果集
        List<UserPlStepInfo> lists = new ArrayList<>();
        lists.add(userPlStepInfoService.selectUserPlStepInfoById(userPlStepInfo.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除学生生产环节信息
     * @param userPlStepInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生生产环节信息", notes="删除学生生产环节信息")
    public ResultObjectModel deletById(@RequestBody UserPlStepInfo userPlStepInfo) throws Exception {
        List<UserPlStepInfo> lists = new ArrayList<>();
        lists.add( userPlStepInfoService.selectUserPlStepInfoById(userPlStepInfo.getId()));
        userPlStepInfoService.deletUserPlStepInfo(userPlStepInfo);
        return ResultObjectModel.success("成功",lists);
    }


}
