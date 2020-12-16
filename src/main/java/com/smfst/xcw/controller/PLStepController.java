package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.model.PLStep;
import com.smfst.xcw.service.PLStepService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName PLStepController
 *@Author lan
 *@Date 2020/10/20 15:45
 **/
@RestController
@RequestMapping("PLStep")
@Api(tags = "生产环节接口控制器")
public class PLStepController {

    @Autowired
    private PLStepService plStepService;
    /**
     * 查询全部生产环节
     * @return
     */
    @ApiOperation(value="查询全部生产环节", notes="查询全部生产环节")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<PLStep> list = plStepService.selectPLStepList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 通过id查询生产环节
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询生产环节", notes="通过id查询生产环节")
    public ResultObjectModel selectPLStepById(@RequestBody PLStep plStep) throws Exception {
        List<PLStep> lists = new ArrayList<>();
        lists.add( plStepService.selectPLStepById(plStep.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询生产环节
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询生产环节", notes="通过指定参数查询生产环节")
    public ResultObjectModel selectPLStepByPartment(@RequestBody PLStep plStep) throws Exception {
        List<PLStep> lists = plStepService.selectPLStepByParameter(plStep);
        return ResultObjectModel.success("成功",lists);
    }

}
