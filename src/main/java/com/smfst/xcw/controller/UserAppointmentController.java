package com.smfst.xcw.controller;

import com.smfst.xcw.model.UserAppointment;
import com.smfst.xcw.service.UserAppointmentService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserAppointmentController
 * @Author lan
 * @Date 2020/11/7 15:54
 **/
@RestController
@RequestMapping("UserAppointment")
@Api(tags = "订单接口控制器")
public class UserAppointmentController {
    @Autowired
    private UserAppointmentService userAppointmentService;

    /**
     * 查询全部订单
     * @return
     */
    @ApiOperation(value="查询全部订单", notes="查询全部订单")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserAppointment> list = userAppointmentService.selectUserAppointmentList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询订单
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询订单", notes="通过id查询订单")
    public ResultObjectModel selectUserAppointmentById(@RequestBody UserAppointment userAppointment) throws Exception {
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询订单
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询订单", notes="通过指定参数查询订单")
    public ResultObjectModel selectUserAppointmentByPartment(@RequestBody UserAppointment userAppointment) throws Exception {
        List<UserAppointment> lists = userAppointmentService.selectUserAppointmentByParameter(userAppointment);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增订单
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增订单", notes="新增订单")
    public ResultObjectModel createUserUserAppointment(@RequestBody UserAppointment userAppointment) throws Exception {
        userAppointmentService.createUserAppointment(userAppointment);
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改订单
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改订单", notes="修改订单")
    public ResultObjectModel updateUserAppointment(@RequestBody UserAppointment userAppointment) throws Exception {
        userAppointmentService.updateUserAppointment(userAppointment);
        List<UserAppointment> lists = new ArrayList<>();
        lists.add( userAppointmentService.selectUserAppointmentById(userAppointment.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改订单学生工厂
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改订单学生工厂", notes="修改订单学生工厂")
    public ResultObjectModel updateUserAppointmentWorkId(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setUserWorkId(userAppointment.getUserWorkId());

        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改订单订单名称
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserAppointmentName",method = RequestMethod.POST)
    @ApiOperation(value="修改订单订单名称", notes="修改订单订单名称")
    public ResultObjectModel updateUserAppointmentUserAppointmentName(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setUserAppointmentName(userAppointment.getUserAppointmentName());

        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改订单订单描述
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateContent",method = RequestMethod.POST)
    @ApiOperation(value="修改订单订单描述", notes="修改订单订单描述")
    public ResultObjectModel updateUserAppointmentContent(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setContent(userAppointment.getContent());

        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改订单类型
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateType",method = RequestMethod.POST)
    @ApiOperation(value="修改订单类型", notes="修改订单类型")
    public ResultObjectModel updateUserAppointmentType(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setType(userAppointment.getType());

        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改订单汽车
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateCarId",method = RequestMethod.POST)
    @ApiOperation(value="修改订单汽车", notes="修改订单汽车")
    public ResultObjectModel updateUserAppointmentCarId(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setCarId(userAppointment.getCarId());

        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));

        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改订单交付时间
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改订单交付时间", notes="修改订单交付时间")
    public ResultObjectModel updateUserAppointmentTime(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setTime(userAppointment.getTime());

        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改订单收益
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateGold",method = RequestMethod.POST)
    @ApiOperation(value="修改订单收益", notes="修改订单收益")
    public ResultObjectModel updateUserAppointmentGold(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setGold(userAppointment.getGold());
        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));
        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改订单数量
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateNum",method = RequestMethod.POST)
    @ApiOperation(value="修改订单数量", notes="修改订单数量")
    public ResultObjectModel updateUserAppointmentNum(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setNum(userAppointment.getNum());
        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改订单发动机排量
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateEngine",method = RequestMethod.POST)
    @ApiOperation(value="修改订单发动机排量", notes="修改订单发动机排量")
    public ResultObjectModel updateUserAppointmentEngine(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setEngine(userAppointment.getEngine());
        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));
        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改订单变速箱
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateSpeed",method = RequestMethod.POST)
    @ApiOperation(value="修改订单变速箱", notes="修改订单变速箱")
    public ResultObjectModel updateUserAppointmentSpeed(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setSpeed(userAppointment.getSpeed());
        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改订单轮毂
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateWheel",method = RequestMethod.POST)
    @ApiOperation(value="修改订单轮毂", notes="修改订单轮毂")
    public ResultObjectModel updateUserAppointmentWheel(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setWheel(userAppointment.getWheel());
        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改订单中控
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateControl",method = RequestMethod.POST)
    @ApiOperation(value="修改订单中控", notes="修改订单中控")
    public ResultObjectModel updateUserAppointmentControl(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setControl(userAppointment.getControl());
        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改订单刹车
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateBrake",method = RequestMethod.POST)
    @ApiOperation(value="修改订单刹车", notes="修改订单刹车")
    public ResultObjectModel updateUserAppointmentBrake(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setBrake(userAppointment.getBrake());
        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));
        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改订单悬挂
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateHang",method = RequestMethod.POST)
    @ApiOperation(value="修改订单悬挂", notes="修改订单悬挂")
    public ResultObjectModel updateUserAppointmentHang(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setHang(userAppointment.getHang());
        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));
        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改订单外观装饰
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateColor",method = RequestMethod.POST)
    @ApiOperation(value="修改订单外观装饰", notes="修改订单外观装饰")
    public ResultObjectModel updateUserAppointmentColor(@RequestBody UserAppointment userAppointment) throws Exception {

        //获取所需参数
        UserAppointment userAppointment1 = new UserAppointment();
        userAppointment1.setId(userAppointment.getId());
        userAppointment1.setColor(userAppointment.getColor());
        //更新
        userAppointmentService.updateUserAppointment(userAppointment1);
        //添加到结果集
        List<UserAppointment> lists = new ArrayList<>();
        lists.add(userAppointmentService.selectUserAppointmentById(userAppointment1.getId()));
        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 删除订单
     * @param userAppointment
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除订单", notes="删除订单")
    public ResultObjectModel deletById(@RequestBody UserAppointment userAppointment) throws Exception {
        List<UserAppointment> lists = new ArrayList<>();
        lists.add( userAppointmentService.selectUserAppointmentById(userAppointment.getId()));
        userAppointmentService.deletUserAppointment(userAppointment);
        return ResultObjectModel.success("成功",lists);
    }
}
