package com.smfst.xcw.controller;

import com.smfst.xcw.model.Car;
import com.smfst.xcw.model.UserParts;
import com.smfst.xcw.model.UserParts2;
import com.smfst.xcw.service.UserPart2Service;
import com.smfst.xcw.service.UserPartsService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生备料控制器2
 * @author My VM
 */
@RestController
@RequestMapping("UserParts2")
@Api(tags = "学生备料控制器2")
public class UserPart2Controller {
    @Autowired
    private UserPart2Service userPart2Service;
    @Autowired
    private UserPartsService userPartsService;
    /**
     * 查询全部学生备料
     * @return
     */
    @ApiOperation(value="查询全部学生备料", notes="查询全部学生备料")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserParts2> list = userPart2Service.selectUserParts2List();
        return ResultObjectModel.success("成功",list);
    }
    /**
     * 修改学生备料
     * @param userParts2
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生备料", notes="修改学生备料")
    public ResultObjectModel updateUserParts(@RequestBody UserParts2 userParts2) throws Exception {
        UserParts userParts = new UserParts();
        userParts.setId(userParts2.getId());
        userParts.setNum(userParts2.getNum());
        userParts.setPartId(userParts2.getPartId());
        userParts.setUserProductionLineId(userParts2.getUserProductionLineId());
        userParts.setUserWorkId(userParts2.getUserWorkId());
        userPartsService.updateUserParts(userParts);
        return ResultObjectModel.success("成功","修改成功");
    }
    /**
     * 删除学生备料
     * @param userParts2
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生备料", notes="删除学生备料")
    public ResultObjectModel deletById(@RequestBody UserParts2 userParts2) throws Exception {
        UserParts userParts = new UserParts();
        userParts.setNum(userParts2.getNum());
        userParts.setUserProductionLineId(userParts2.getUserProductionLineId());
        userParts.setId(userParts2.getId());
        userParts.setPartId(userParts2.getPartId());
        userPartsService.deletUserParts(userParts);
        return ResultObjectModel.success("成功","删除成功");
    }
    /**
     * 新增学生备料
     * @param userParts2
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生备料", notes="新增学生备料")
    public ResultObjectModel createUserParts(@RequestBody UserParts2 userParts2) throws Exception {
        UserParts userParts = new UserParts();
        userParts.setNum(userParts2.getNum());
        userParts.setUserProductionLineId(userParts2.getUserProductionLineId());
        userParts.setId(userParts2.getId());
        userParts.setPartId(userParts2.getPartId());
        userPartsService.createUserParts(userParts);
        return ResultObjectModel.success("成功","新增成功");
    }
}
