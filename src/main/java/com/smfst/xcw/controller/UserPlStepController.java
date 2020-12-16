package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.UserPlStep;
import com.smfst.xcw.model.UserPartStore;
import com.smfst.xcw.service.UserPlStepService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *@ClassName UserPlStepController
 *@Author lan
 *@Date 2020/10/26 16:56
 **/
@RestController
@RequestMapping("UserPlStep")
@Api(tags = "学生生产环节接口控制器")
public class UserPlStepController {

    @Autowired
    private UserPlStepService userPlStepService;

    /**
     * 查询全部学生生产环节
     * @return
     */
    @ApiOperation(value="查询全部学生生产环节", notes="查询全部学生生产环节")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserPlStep> list = userPlStepService.selectUserPlStepList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生生产环节
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生生产环节", notes="通过id查询学生生产环节")
    public ResultObjectModel selectUserPlStepById(@RequestBody UserPlStep userPlStep) throws Exception {
        List<UserPlStep> lists = new ArrayList<>();
        lists.add(userPlStepService.selectUserPlStepById(userPlStep.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生生产环节
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生生产环节", notes="通过指定参数查询学生生产环节")
    public ResultObjectModel selectUserPlStepByPartment(@RequestBody UserPlStep userPlStep) throws Exception {
        List<UserPlStep> lists = userPlStepService.selecUserPlStepByParameter(userPlStep);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生生产环节
     * @param userPlStep
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生生产环节", notes="新增学生生产环节")
    public ResultObjectModel createUserPlStep(@RequestBody UserPlStep userPlStep) throws Exception {
        userPlStepService.createUserPlStep(userPlStep);
        List<UserPlStep> lists = new ArrayList<>();
        lists.add( userPlStepService.selectUserPlStepById(userPlStep.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生生产环节
     * @param userPlStep
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节", notes="修改学生生产环节")
    public ResultObjectModel updateUserPlStep(@RequestBody UserPlStep userPlStep) throws Exception {
        userPlStepService.updateUserPlStep(userPlStep);
        List<UserPlStep> lists = new ArrayList<>();
        lists.add( userPlStepService.selectUserPlStepById(userPlStep.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生生产环节学生工厂
     * @param userPlStep
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节学生工厂", notes="修改学生生产环节学生工厂")
    public ResultObjectModel updateUserPlStepUserWorkId(@RequestBody UserPlStep userPlStep) throws Exception {
        //获取所需参数
        UserPlStep userPlStep1 = new UserPlStep();
        userPlStep1.setId(userPlStep.getId());
        userPlStep1.setUserWorkId(userPlStep.getUserWorkId());

        //更新
        userPlStepService.updateUserPlStep(userPlStep1);
        //添加到结果集
        List<UserPlStep> lists = new ArrayList<>();
        lists.add(userPlStepService.selectUserPlStepById(userPlStep.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生生产环节学生生产线
     * @param userPlStep
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节学生生产线", notes="修改学生生产环节学生生产线")
    public ResultObjectModel updateUserPlStepUserProductionLineId(@RequestBody UserPlStep userPlStep) throws Exception {
        //获取所需参数
        UserPlStep userPlStep1 = new UserPlStep();
        userPlStep1.setId(userPlStep.getId());
        userPlStep1.setUserProductionLineId(userPlStep.getUserProductionLineId());

        //更新
        userPlStepService.updateUserPlStep(userPlStep1);
        //添加到结果集
        List<UserPlStep> lists = new ArrayList<>();
        lists.add(userPlStepService.selectUserPlStepById(userPlStep.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生生产环节下一个学生学生生产环节
     * @param userPlStep
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateNextUserPlStepid",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节学生生产线", notes="修改学生生产环节学生生产线")
    public ResultObjectModel updateUserPlStepNextUserPlStepid(@RequestBody UserPlStep userPlStep) throws Exception {
        //获取所需参数
        UserPlStep userPlStep1 = new UserPlStep();
        userPlStep1.setId(userPlStep.getId());
        userPlStep1.setNextUserPlStepId(userPlStep.getNextUserPlStepId());

        //更新
        userPlStepService.updateUserPlStep(userPlStep1);
        //添加到结果集
        List<UserPlStep> lists = new ArrayList<>();
        lists.add(userPlStepService.selectUserPlStepById(userPlStep.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除学生生产环节
     * @param userPlStep
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生生产环节", notes="删除学生生产环节")
    public ResultObjectModel deletById(@RequestBody UserPlStep userPlStep) throws Exception {
        List<UserPlStep> lists = new ArrayList<>();
        lists.add( userPlStepService.selectUserPlStepById(userPlStep.getId()));
        userPlStepService.deletUserPlStep(userPlStep);
        return ResultObjectModel.success("成功",lists);
    }

    

}
