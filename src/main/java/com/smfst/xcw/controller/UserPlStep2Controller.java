package com.smfst.xcw.controller;

import com.smfst.xcw.model.*;
import com.smfst.xcw.service.UserPlStep2Service;
import com.smfst.xcw.service.UserPlStepInfoService;
import com.smfst.xcw.service.UserPlStepService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName UserPlStep2Controller
 * @Author tyx
 * @Date 2020/11/26
 **/
@RestController
@RequestMapping("UserPlStep2")
@Api(tags = "生产环节接口控制器2")
public class UserPlStep2Controller {
    @Autowired
    private UserPlStep2Service userPlStep2Service;
    @Autowired
    private UserPlStepService userPlStepService;
    @Autowired
    private UserPlStepInfoService userPlStepInfoService;
    /**
     * 按id查询全部生产环节
     * @return
     */
    @ApiOperation(value="按id查询全部生产环节", notes="按id查询全部生产环节")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList(@RequestBody UserPlStep2 userPlStep2) {
       List<UserPlStep2> list = userPlStep2Service.selectUserPlStep2List(userPlStep2.getUserProductionLineId());
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 修改学生生产环节
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产环节", notes="修改学生生产环节")
    public ResultObjectModel updateUserPlStep2(@RequestBody UserPlStep2 userPlStep2) throws Exception {
        UserPlStep userPlStep = new UserPlStep();
        userPlStep.setId(Long.valueOf(userPlStep2.getId()));
        userPlStep.setNextUserPlStepId(Long.valueOf(userPlStep2.getNextUserPlStepId()));
        userPlStep.setUserProductionLineId(Long.valueOf(userPlStep2.getUserProductionLineId()));
        userPlStep.setUserWorkId(Long.valueOf(userPlStep2.getUserWorkId()));
        userPlStepService.updateUserPlStep(userPlStep);

        UserPlStepInfo userPlStepInfo = new UserPlStepInfo();
        userPlStepInfo.setId(Long.valueOf(userPlStep2.getId()));
        userPlStepInfo.setConsume(Long.valueOf(userPlStep2.getConsume()));
        userPlStepInfo.setCostTime(Long.valueOf(userPlStep2.getCostTime()));
        userPlStepInfo.setPlStepName(userPlStep2.getPlStepName());
        userPlStepInfo.setPower(Long.valueOf(userPlStep2.getPower()));
        userPlStepInfo.setStageId(Long.valueOf(userPlStep2.getStageId()));
        userPlStepInfo.setStep(Long.valueOf(userPlStep2.getStep()));
        userPlStepInfoService.updateUserPlStepInfo(userPlStepInfo);
        return ResultObjectModel.success("成功","修改成功");
    }

}
