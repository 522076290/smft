package com.smfst.xcw.controller;


import com.smfst.xcw.model.*;
import com.smfst.xcw.service.*;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * 学生生产线接口控制器2
 * @author tyx
 */
@RestController
@RequestMapping("UserProductionLine2")
@Api(tags = "学生生产线接口控制器2")
public class UserProductionLine2Controller {

    @Autowired
    private UserProductionLine2Service userProductionLine2Service;
    @Autowired
    private UserProductionLineService userProductionLineService;

    /**
     * 查询全部学生工厂
     * @return
     */
    @ApiOperation(value="查询全部学生工厂", notes="查询全部学生工厂")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel  selectList() {
        List<UserProductionLine2> list = userProductionLine2Service.selectUserProductionLineList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 修改学生生产线
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产线", notes="修改学生生产线")
    public ResultObjectModel updateUserProductionLine2(@RequestBody UserProductionLine2 userProductionLine2) throws Exception {
        UserProductionLine userProductionLine = new UserProductionLine();
        userProductionLine.setPosition(userProductionLine2.getPosition());
        userProductionLine.setType(userProductionLine2.getType());
        userProductionLine.setIsAI(userProductionLine2.getIsAI());
        userProductionLine.setProductionLineId(userProductionLine2.getProductionLineId());
        userProductionLine.setStageId(userProductionLine2.getStageId());
        userProductionLine.setId(userProductionLine2.getId());
        userProductionLineService.updateUserProductionLine(userProductionLine);
        return ResultObjectModel.success("成功","修改成功");
    }
    /**
     * 删除学生生产线
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生生产线", notes="删除学生生产线")
    public ResultObjectModel deleteUserProductionLine2(@RequestBody UserProductionLine2 userProductionLine2) throws Exception {
        UserProductionLine userProductionLine = new UserProductionLine();
        userProductionLine.setPosition(userProductionLine2.getPosition());
        userProductionLine.setType(userProductionLine2.getType());
        userProductionLine.setIsAI(userProductionLine2.getIsAI());
        userProductionLine.setProductionLineId(userProductionLine2.getProductionLineId());
        userProductionLine.setStageId(userProductionLine2.getStageId());
        userProductionLine.setId(userProductionLine2.getId());
        userProductionLineService.deletUserProductionLine(userProductionLine);
        return ResultObjectModel.success("成功","修改成功");
    }
    /**
     * 添加学生生产线
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ApiOperation(value="添加学生生产线", notes="添加学生生产线")
    public ResultObjectModel addUserProductionLine2(@RequestBody UserProductionLine2 userProductionLine2) throws Exception {
        UserProductionLine userProductionLine = userProductionLineService.selectUserProductionLineByPosition(userProductionLine2.getPosition());
        if (userProductionLine!=null){
            return ResultObjectModel.fail("失败","已存在该生产线");
        } else {
            userProductionLine = new UserProductionLine();
            userProductionLine.setPosition(userProductionLine2.getPosition());
            userProductionLine.setType(userProductionLine2.getType());
            userProductionLine.setIsAI(userProductionLine2.getIsAI());
            userProductionLine.setProductionLineId(userProductionLine2.getProductionLineId());
            userProductionLine.setStageId(userProductionLine2.getStageId());
            userProductionLine.setId(userProductionLine2.getId());
            userProductionLine.setUserWorkId(1);
            userProductionLineService.createUserProductionLine(userProductionLine);
            return ResultObjectModel.success("成功","新增成功");
        }

    }

}
