package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.UserWork;
import com.smfst.xcw.model.UserWorkEnvironmentalLog;
import com.smfst.xcw.service.UserWorkService;
import com.smfst.xcw.utils.ResultObjectModel;
import com.smfst.xcw.utils.UserWorkUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *@ClassName UserWorkController
 *@Author lan
 *@Date 2020/10/23 15:30
 **/
@RestController
@RequestMapping("UserWork")
@Api(tags = "学生工厂接口控制器")
public class UserWorkController {

    @Autowired
    private UserWorkService userWorkService;

    /**
     * 查询全部学生工厂
     * @return
     */
    @ApiOperation(value="查询全部学生工厂", notes="查询全部学生工厂")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserWork> list = userWorkService.selectUserWorkList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生工厂
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生工厂", notes="通过id查询学生工厂")
    public ResultObjectModel selectUserWorkById(@RequestBody UserWork userWork) throws Exception {
        List<UserWork> lists = new ArrayList<>();
        lists.add(userWorkService.selectUserWorkById(userWork.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生工厂
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生工厂", notes="通过指定参数查询学生工厂")
    public ResultObjectModel selectUserWorkByPartment(@RequestBody UserWork userWork) throws Exception {
        List<UserWork> lists =  userWorkService.selectUserWorkByParameter(userWork);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂
     * @param userWork
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂", notes="修改学生工厂")
    public ResultObjectModel updateUserWorkEnvironmentalLog(@RequestBody UserWork userWork) throws Exception {
        userWorkService.updateUserWork(userWork);
        List<UserWork> lists = new ArrayList<>();
        lists.add( userWorkService.selectUserWorkById(userWork.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂昵称
     * @param userWork
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateNickName",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂昵称", notes="修改学生工厂昵称")
    public ResultObjectModel updateUserWorkByNickName(@RequestBody UserWork userWork) throws Exception {

        //获取所需参数
        UserWork userWork1 = new UserWork();
        userWork1.setId(userWork.getId());
        userWork1.setNickName(userWork.getNickName());
        //更新
        userWorkService.updateUserWork(userWork1);
        //添加到结果集
        List<UserWork> lists = new ArrayList<>();
        lists.add(userWorkService.selectUserWorkById(userWork.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生登陆昵称
     * @param userWork
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateLoginName",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂昵称", notes="修改学生工厂昵称")
    public ResultObjectModel updateUserWorkByLoginName(@RequestBody UserWork userWork) throws Exception {

        //获取所需参数
        UserWork userWork1 = new UserWork();
        userWork1.setId(userWork.getId());
        userWork1.setLoginName(userWork.getLoginName());
        //更新
        userWorkService.updateUserWork(userWork1);
        //添加到结果集
        List<UserWork> lists = new ArrayList<>();
        lists.add(userWorkService.selectUserWorkById(userWork.getId()));
        return ResultObjectModel.success("成功",lists);
    }
}
