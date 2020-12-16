package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.UserWork;
import com.smfst.xcw.model.UserWorkInfo;
import com.smfst.xcw.service.UserWorkInfoService;
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
 *@ClassName UserWorkInfoController
 *@Author lan
 *@Date 2020/10/23 16:23
 **/
@RestController
@RequestMapping("UserWorkInfo")
@Api(tags = "学生工厂信息接口控制器")
public class UserWorkInfoController {

    @Autowired
    private UserWorkInfoService userWorkInfoService;

    /**
     * 查询全部学生工厂信息
     * @return
     */
    @ApiOperation(value="查询全部学生工厂信息", notes="查询全部学生工厂信息")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserWorkInfo> list = userWorkInfoService.selectUserWorkInfoList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生工厂信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生工厂信息", notes="通过id查询学生工厂信息")
    public ResultObjectModel selectUserWorkInfoById(@RequestBody UserWorkInfo userWorkInfo) throws Exception {
        List<UserWorkInfo> lists = new ArrayList<>();
        lists.add(userWorkInfoService.selectUserWorkInfoById(userWorkInfo.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生工厂信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生工厂信息", notes="通过指定参数查询学生工厂信息")
    public ResultObjectModel selectUserWorkInfoByPartment(@RequestBody UserWorkInfo userWorkInfo) throws Exception {
        List<UserWorkInfo> lists = userWorkInfoService.selectUserWorkInfoByParameter(userWorkInfo);
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生工厂信息
     * @param userWorkInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂信息", notes="修改学生工厂信息")
    public ResultObjectModel updateUserWorkInfo(@RequestBody UserWorkInfo userWorkInfo) throws Exception {
        userWorkInfoService.updateUserWorkInfo(userWorkInfo);
        List<UserWorkInfo> lists = new ArrayList<>();
        lists.add( userWorkInfoService.selectUserWorkInfoById(userWorkInfo.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂信息原材料内容
     * @param userWorkInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePartCapacity",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂信息原材料内容", notes="修改学生工厂信息原材料内容   ")
    public ResultObjectModel updateUserWorkInfoByPartCapacity(@RequestBody UserWorkInfo userWorkInfo) throws Exception {

        //获取所需参数
        UserWorkInfo userWorkInfo1 = new UserWorkInfo();
        userWorkInfo1.setId(userWorkInfo.getId());
        userWorkInfo1.setPartCapacity(userWorkInfo.getPartCapacity());
        //更新
        userWorkInfoService.updateUserWorkInfo(userWorkInfo1);
        //添加到结果集
        List<UserWorkInfo> lists = new ArrayList<>();
        lists.add(userWorkInfoService.selectUserWorkInfoById(userWorkInfo.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂信息汽车容量
     * @param userWorkInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateCarCapacity",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂信息汽车容量", notes="修改学生工厂信息汽车容量")
    public ResultObjectModel updateUserWorkInfoByCarCapacity(@RequestBody UserWorkInfo userWorkInfo) throws Exception {

        //获取所需参数
        UserWorkInfo userWorkInfo1 = new UserWorkInfo();
        userWorkInfo1.setId(userWorkInfo.getId());
        userWorkInfo1.setCarCapacity(userWorkInfo.getCarCapacity());
        //更新
        userWorkInfoService.updateUserWorkInfo(userWorkInfo1);
        //添加到结果集
        List<UserWorkInfo> lists = new ArrayList<>();
        lists.add(userWorkInfoService.selectUserWorkInfoById(userWorkInfo.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂信息汽车容量
     * @param userWorkInfo
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePrice",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂信息汽车容量", notes="修改学生工厂信息汽车容量")
    public ResultObjectModel updateUserWorkInfoByPrice(@RequestBody UserWorkInfo userWorkInfo) throws Exception {

        //获取所需参数
        UserWorkInfo userWorkInfo1 = new UserWorkInfo();
        userWorkInfo1.setId(userWorkInfo.getId());
        userWorkInfo1.setPrice(userWorkInfo.getPrice());
        //更新
        userWorkInfoService.updateUserWorkInfo(userWorkInfo1);
        //添加到结果集
        List<UserWorkInfo> lists = new ArrayList<>();
        lists.add(userWorkInfoService.selectUserWorkInfoById(userWorkInfo.getId()));
        return ResultObjectModel.success("成功",lists);
    }

}
