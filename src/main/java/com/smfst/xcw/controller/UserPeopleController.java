package com.smfst.xcw.controller;

import com.smfst.xcw.model.UserPeople;
import com.smfst.xcw.service.UserPeopleService;
import com.smfst.xcw.service.UserPeopleService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserPeopleController
 * @Author lan
 * @Date 2020/11/5 23:03
 **/
@RestController
@RequestMapping("UserPeople")
@Api(tags = "学生员工接口控制器")
public class UserPeopleController {

    @Autowired
    private UserPeopleService userPeopleService;

    /**
     * 查询全部学生员工
     * @return
     */
    @ApiOperation(value="查询全部学生员工", notes="查询全部学生员工")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserPeople> list = userPeopleService.selectUserPeopleList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生员工
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生员工", notes="通过id查询学生员工")
    public ResultObjectModel selectUserPeopleById(@RequestBody UserPeople userPeople) throws Exception {
        List<UserPeople> lists = new ArrayList<>();
        lists.add(userPeopleService.selectUserPeopleById(userPeople.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生员工
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生员工", notes="通过指定参数查询学生员工")
    public ResultObjectModel selectUserPeopleByPartment(@RequestBody UserPeople userPeople) throws Exception {
        List<UserPeople> lists = userPeopleService.selectUserPeopleByParameter(userPeople);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生员工
     * @param userPeople
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生员工", notes="新增学生员工")
    public ResultObjectModel createUserUserPeople(@RequestBody UserPeople userPeople) throws Exception {
        userPeopleService.createUserPeople(userPeople);
        List<UserPeople> lists = new ArrayList<>();
        lists.add(userPeopleService.selectUserPeopleById(userPeople.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生员工
     * @param userPeople
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生员工", notes="修改学生员工")
    public ResultObjectModel updateUserPeople(@RequestBody UserPeople userPeople) throws Exception {
        userPeopleService.updateUserPeople(userPeople);
        List<UserPeople> lists = new ArrayList<>();
        lists.add( userPeopleService.selectUserPeopleById(userPeople.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生员工学生工厂
     * @param userPeople
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生员工学生工厂", notes="修改学生员工学生工厂")
    public ResultObjectModel updateUserPeopleWorkId(@RequestBody UserPeople userPeople) throws Exception {

        //获取所需参数
        UserPeople userPeople1 = new UserPeople();
        userPeople1.setId(userPeople.getId());
        userPeople1.setUserWorkId(userPeople.getUserWorkId());

        //更新
        userPeopleService.updateUserPeople(userPeople1);
        //添加到结果集
        List<UserPeople> lists = new ArrayList<>();
        lists.add(userPeopleService.selectUserPeopleById(userPeople1.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生员工学生生产线
     * @param userPeople
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生员工学生工厂", notes="修改学生员工学生工厂")
    public ResultObjectModel updateUserPeopleUserProductionLineId(@RequestBody UserPeople userPeople) throws Exception {

        //获取所需参数
        UserPeople userPeople1 = new UserPeople();
        userPeople1.setId(userPeople.getId());
        userPeople1.setUserProductionLineId(userPeople.getUserProductionLineId());

        //更新
        userPeopleService.updateUserPeople(userPeople1);
        //添加到结果集
        List<UserPeople> lists = new ArrayList<>();
        lists.add(userPeopleService.selectUserPeopleById(userPeople1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生员工汽车
     * @param userPeople
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePower",method = RequestMethod.POST)
    @ApiOperation(value="修改学生员工汽车", notes="修改学生员工汽车")
    public ResultObjectModel updateUserPeoplePower(@RequestBody UserPeople userPeople) throws Exception {

        //获取所需参数
        UserPeople userPeople1 = new UserPeople();
        userPeople1.setId(userPeople.getId());
        userPeople1.setPower(userPeople.getPower());
        //更新
        userPeopleService.updateUserPeople(userPeople1);
        //添加到结果集
        List<UserPeople> lists = new ArrayList<>();
        lists.add(userPeopleService.selectUserPeopleById(userPeople1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生员工汽车
     * @param userPeople
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePeopleId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生员工汽车", notes="修改学生员工汽车")
    public ResultObjectModel updateUserPeoplePeopleId(@RequestBody UserPeople userPeople) throws Exception {

        //获取所需参数
        UserPeople userPeople1 = new UserPeople();
        userPeople1.setId(userPeople.getId());
        userPeople1.setPeopleId(userPeople.getPeopleId());
        //更新
        userPeopleService.updateUserPeople(userPeople1);
        //添加到结果集
        List<UserPeople> lists = new ArrayList<>();
        lists.add(userPeopleService.selectUserPeopleById(userPeople1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生员工岗位
     * @param userPeople
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateWorkPostId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生员工岗位", notes="修改学生员工岗位")
    public ResultObjectModel updateUserPeopleWorkPostId(@RequestBody UserPeople userPeople) throws Exception {

        //获取所需参数
        UserPeople userPeople1 = new UserPeople();
        userPeople1.setId(userPeople.getId());
        userPeople1.setWorkPostId(userPeople.getWorkPostId());
        //更新
        userPeopleService.updateUserPeople(userPeople1);
        //添加到结果集
        List<UserPeople> lists = new ArrayList<>();
        lists.add(userPeopleService.selectUserPeopleById(userPeople1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 删除学生员工
     * @param userPeople
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生员工", notes="删除学生员工")
    public ResultObjectModel deletById(@RequestBody UserPeople userPeople) throws Exception {
        List<UserPeople> lists = new ArrayList<>();
        lists.add( userPeopleService.selectUserPeopleById(userPeople.getId()));
        userPeopleService.deletUserPeople(userPeople);
        return ResultObjectModel.success("成功",lists);
    }

}
