package com.smfst.xcw.controller;

import com.smfst.xcw.model.UserQuestion;
import com.smfst.xcw.service.UserQuestionService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserQuestionController
 * @Author lan
 * @Date 2020/11/7 11:25
 **/
@RestController
@RequestMapping("UserQuestion")
@Api(tags = "学生问题车辆仓库接口控制器")
public class UserQuestionController {
    @Autowired
    private UserQuestionService userQuestionService;

    /**
     * 查询全部学生问题车辆仓库
     * @return
     */
    @ApiOperation(value="查询全部学生问题车辆仓库", notes="查询全部学生问题车辆仓库")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserQuestion> list = userQuestionService.selectUserQuestionList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生问题车辆仓库
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生问题车辆仓库", notes="通过id查询学生问题车辆仓库")
    public ResultObjectModel selectUserQuestionById(@RequestBody UserQuestion userQuestion) throws Exception {
        List<UserQuestion> lists = new ArrayList<>();
        lists.add(userQuestionService.selectUserQuestionById(userQuestion.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生问题车辆仓库
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生问题车辆仓库", notes="通过指定参数查询学生问题车辆仓库")
    public ResultObjectModel selectUserQuestionByPartment(@RequestBody UserQuestion userQuestion) throws Exception {
        List<UserQuestion> lists = userQuestionService.selectUserQuestionByParameter(userQuestion);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生问题车辆仓库
     * @param userQuestion
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生问题车辆仓库", notes="新增学生问题车辆仓库")
    public ResultObjectModel createUserUserQuestion(@RequestBody UserQuestion userQuestion) throws Exception {
        userQuestionService.createUserQuestion(userQuestion);
        List<UserQuestion> lists = new ArrayList<>();
        lists.add(userQuestionService.selectUserQuestionById(userQuestion.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生问题车辆仓库
     * @param userQuestion
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生问题车辆仓库", notes="修改学生问题车辆仓库")
    public ResultObjectModel updateUserQuestion(@RequestBody UserQuestion userQuestion) throws Exception {
        userQuestionService.updateUserQuestion(userQuestion);
        List<UserQuestion> lists = new ArrayList<>();
        lists.add( userQuestionService.selectUserQuestionById(userQuestion.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生问题车辆仓库学生工厂
     * @param userQuestion
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生问题车辆仓库学生工厂", notes="修改学生问题车辆仓库学生工厂")
    public ResultObjectModel updateUserQuestionWorkId(@RequestBody UserQuestion userQuestion) throws Exception {

        //获取所需参数
        UserQuestion userQuestion1 = new UserQuestion();
        userQuestion1.setId(userQuestion.getId());
        userQuestion1.setUserWorkId(userQuestion.getUserWorkId());

        //更新
        userQuestionService.updateUserQuestion(userQuestion1);
        //添加到结果集
        List<UserQuestion> lists = new ArrayList<>();
        lists.add(userQuestionService.selectUserQuestionById(userQuestion1.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生问题车辆仓库学生生产线
     * @param userQuestion
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生问题车辆仓库学生工厂", notes="修改学生问题车辆仓库学生工厂")
    public ResultObjectModel updateUserQuestionUserProductionLineId(@RequestBody UserQuestion userQuestion) throws Exception {

        //获取所需参数
        UserQuestion userQuestion1 = new UserQuestion();
        userQuestion1.setId(userQuestion.getId());
        userQuestion1.setUserProductionLineId(userQuestion.getUserProductionLineId());

        //更新
        userQuestionService.updateUserQuestion(userQuestion1);
        //添加到结果集
        List<UserQuestion> lists = new ArrayList<>();
        lists.add(userQuestionService.selectUserQuestionById(userQuestion1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生问题车辆仓库汽车
     * @param userQuestion
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateCarId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生问题车辆仓库汽车", notes="修改学生问题车辆仓库汽车")
    public ResultObjectModel updateUserQuestionCarId(@RequestBody UserQuestion userQuestion) throws Exception {

        //获取所需参数
        UserQuestion userQuestion1 = new UserQuestion();
        userQuestion1.setId(userQuestion.getId());
        userQuestion1.setCarId(userQuestion.getCarId());
        //更新
        userQuestionService.updateUserQuestion(userQuestion1);
        //添加到结果集
        List<UserQuestion> lists = new ArrayList<>();
        lists.add(userQuestionService.selectUserQuestionById(userQuestion1.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除学生问题车辆仓库
     * @param userQuestion
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生问题车辆仓库", notes="删除学生问题车辆仓库")
    public ResultObjectModel deletById(@RequestBody UserQuestion userQuestion) throws Exception {
        List<UserQuestion> lists = new ArrayList<>();
        lists.add( userQuestionService.selectUserQuestionById(userQuestion.getId()));
        userQuestionService.deletUserQuestion(userQuestion);
        return ResultObjectModel.success("成功",lists);
    }

}
