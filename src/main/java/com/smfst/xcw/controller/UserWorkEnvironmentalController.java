package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.UserWorkEnvironmental;
import com.smfst.xcw.model.UserWorkEnvironmental;
import com.smfst.xcw.service.UserWorkEnvironmentalService;
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
 *@ClassName UserWorkEnvironmentalController
 *@Author lan
 *@Date 2020/10/23 17:25
 **/
@RestController
@RequestMapping("UserWorkEnvironmental")
@Api(tags = "学生工厂环境接口控制器")
public class UserWorkEnvironmentalController {

    @Autowired
    private UserWorkEnvironmentalService userWorkEnvironmentalService;

    /**
     * 查询全部学生工厂环境
     * @return
     */
    @ApiOperation(value="查询全部学生工厂环境", notes="查询全部学生工厂环境")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserWorkEnvironmental> list = userWorkEnvironmentalService.selectUserWorkEnvironmentalList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生工厂环境
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生工厂环境", notes="通过id查询学生工厂环境")
    public ResultObjectModel selectWorkPostById(@RequestBody UserWorkEnvironmental userWorkEnvironmental) throws Exception {
        List<UserWorkEnvironmental> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalService.selectUserWorkEnvironmentalById(userWorkEnvironmental.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生工厂环境
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生工厂环境", notes="通过指定参数查询学生工厂环境")
    public ResultObjectModel selectWorkPostByPartment(@RequestBody UserWorkEnvironmental userWorkEnvironmental) throws Exception {
        List<UserWorkEnvironmental> lists = userWorkEnvironmentalService.selectUserWorkEnvironmentalByParameter(userWorkEnvironmental);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境
     * @param userWorkEnvironmental
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境", notes="修改学生工厂环境")
    public ResultObjectModel updateUserWorkEnvironmentalLog(@RequestBody UserWorkEnvironmental userWorkEnvironmental) throws Exception {
        userWorkEnvironmentalService.updateUserWorkEnvironmental(userWorkEnvironmental);
        List<UserWorkEnvironmental> lists = new ArrayList<>();
        lists.add( userWorkEnvironmentalService.selectUserWorkEnvironmentalById(userWorkEnvironmental.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境当前天数
     * @param userWorkEnvironmental
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateDay",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境当前天数", notes="修改学生工厂环境当前天数")
    public ResultObjectModel updateUserWorkEnvironmentalLogByDay(@RequestBody UserWorkEnvironmental userWorkEnvironmental) throws Exception {
        //获取所需参数
        UserWorkEnvironmental userWorkEnvironmental1 = new UserWorkEnvironmental();
        userWorkEnvironmental1.setId(userWorkEnvironmental.getId());
        userWorkEnvironmental1.setDay(userWorkEnvironmental.getDay());
        //更新
        userWorkEnvironmentalService.updateUserWorkEnvironmental(userWorkEnvironmental1);
        //添加到结果集
        List<UserWorkEnvironmental> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalService.selectUserWorkEnvironmentalById(userWorkEnvironmental1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境灯光开启
     * @param userWorkEnvironmental
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateLightSwitch",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境灯光开启", notes="修改学生工厂环境灯光开启")
    public ResultObjectModel updateUserWorkEnvironmentalLogByLightSwitch(@RequestBody UserWorkEnvironmental userWorkEnvironmental) throws Exception {
        //获取所需参数
        UserWorkEnvironmental userWorkEnvironmental1 = new UserWorkEnvironmental();
        userWorkEnvironmental1.setId(userWorkEnvironmental.getId());
        userWorkEnvironmental1.setLightSwitch(userWorkEnvironmental.getLightSwitch());
        //更新
        userWorkEnvironmentalService.updateUserWorkEnvironmental(userWorkEnvironmental1);
        //添加到结果集
        List<UserWorkEnvironmental> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalService.selectUserWorkEnvironmentalById(userWorkEnvironmental1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境空调开关
     * @param userWorkEnvironmental
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateAcOnOff",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境空调开关", notes="修改学生工厂环境空调开关")
    public ResultObjectModel updateUserWorkEnvironmentalLogByAcOnOff(@RequestBody UserWorkEnvironmental userWorkEnvironmental) throws Exception {
        //获取所需参数
        UserWorkEnvironmental userWorkEnvironmental1 = new UserWorkEnvironmental();
        userWorkEnvironmental1.setId(userWorkEnvironmental.getId());
        userWorkEnvironmental1.setAcOnOff(userWorkEnvironmental.getAcOnOff());
        //更新
        userWorkEnvironmentalService.updateUserWorkEnvironmental(userWorkEnvironmental1);
        //添加到结果集
        List<UserWorkEnvironmental> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalService.selectUserWorkEnvironmentalById(userWorkEnvironmental1.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生工厂环境光照
     * @param userWorkEnvironmental
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateBeam",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境光照", notes="修改学生工厂环境光照")
    public ResultObjectModel updateUserWorkEnvironmentalLogByBeam(@RequestBody UserWorkEnvironmental userWorkEnvironmental) throws Exception {
        //获取所需参数
        UserWorkEnvironmental userWorkEnvironmental1 = new UserWorkEnvironmental();
        userWorkEnvironmental1.setId(userWorkEnvironmental.getId());
        userWorkEnvironmental1.setBeam(userWorkEnvironmental.getBeam());
        //更新
        userWorkEnvironmentalService.updateUserWorkEnvironmental(userWorkEnvironmental1);
        //添加到结果集
        List<UserWorkEnvironmental> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalService.selectUserWorkEnvironmentalById(userWorkEnvironmental1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境车间温度
     * @param userWorkEnvironmental
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateWorkshopTemp",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境车间温度", notes="修改学生工厂环境车间温度")
    public ResultObjectModel updateUserWorkEnvironmentalLogByWorkshopTemp(@RequestBody UserWorkEnvironmental userWorkEnvironmental) throws Exception {
        //获取所需参数
        UserWorkEnvironmental userWorkEnvironmental1 = new UserWorkEnvironmental();
        userWorkEnvironmental1.setId(userWorkEnvironmental.getId());
        userWorkEnvironmental1.setWorkshopTemp(userWorkEnvironmental.getWorkshopTemp());
        //更新
        userWorkEnvironmentalService.updateUserWorkEnvironmental(userWorkEnvironmental1);
        //添加到结果集
        List<UserWorkEnvironmental> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalService.selectUserWorkEnvironmentalById(userWorkEnvironmental1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境室外温度
     * @param userWorkEnvironmental
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateOutTemp",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境室外温度", notes="修改学生工厂环境室外温度")
    public ResultObjectModel updateUserWorkEnvironmentalLogByOutTemp(@RequestBody UserWorkEnvironmental userWorkEnvironmental) throws Exception {
        //获取所需参数
        UserWorkEnvironmental userWorkEnvironmental1 = new UserWorkEnvironmental();
        userWorkEnvironmental1.setId(userWorkEnvironmental.getId());
        userWorkEnvironmental1.setOutTemp(userWorkEnvironmental.getOutTemp());
        //更新
        userWorkEnvironmentalService.updateUserWorkEnvironmental(userWorkEnvironmental1);
        //添加到结果集
        List<UserWorkEnvironmental> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalService.selectUserWorkEnvironmentalById(userWorkEnvironmental1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境电力消耗
     * @param userWorkEnvironmental
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePowerConsume",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境电力消耗", notes="修改学生工厂环境电力消耗")
    public ResultObjectModel updateUserWorkEnvironmentalLogByPowerConsume(@RequestBody UserWorkEnvironmental userWorkEnvironmental) throws Exception {
        //获取所需参数
        UserWorkEnvironmental userWorkEnvironmental1 = new UserWorkEnvironmental();
        userWorkEnvironmental1.setId(userWorkEnvironmental.getId());
        userWorkEnvironmental1.setPowerConsume(userWorkEnvironmental.getPowerConsume());
        //更新
        userWorkEnvironmentalService.updateUserWorkEnvironmental(userWorkEnvironmental1);
        //添加到结果集
        List<UserWorkEnvironmental> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalService.selectUserWorkEnvironmentalById(userWorkEnvironmental1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生工厂环境时间
     * @param userWorkEnvironmental
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改学生工厂环境时间", notes="修改学生工厂环境时间")
    public ResultObjectModel updateUserWorkEnvironmentalLogByTime(@RequestBody UserWorkEnvironmental userWorkEnvironmental) throws Exception {
        //获取所需参数
        UserWorkEnvironmental userWorkEnvironmental1 = new UserWorkEnvironmental();
        userWorkEnvironmental1.setId(userWorkEnvironmental.getId());
        userWorkEnvironmental1.setTime(userWorkEnvironmental.getTime());
        //更新
        userWorkEnvironmentalService.updateUserWorkEnvironmental(userWorkEnvironmental1);
        //添加到结果集
        List<UserWorkEnvironmental> lists = new ArrayList<>();
        lists.add(userWorkEnvironmentalService.selectUserWorkEnvironmentalById(userWorkEnvironmental1.getId()));
        return ResultObjectModel.success("成功",lists);
    }



}
