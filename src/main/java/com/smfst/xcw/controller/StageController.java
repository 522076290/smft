package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.model.Stage;
import com.smfst.xcw.service.StageService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName StageController
 *@Author lan
 *@Date 2020/10/20 15:19
 **/
@RestController
@RequestMapping("Stage")
@Api(tags = "生产工序接口控制器")
public class StageController {
    @Autowired
    private StageService stageService;

    /**
     * 查询全部生产工序
     * @return
     */
    @ApiOperation(value="查询全部生产工序", notes="查询全部生产工序")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<Stage> list = stageService.selectStageList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询生产工序
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询生产工序", notes="通过id查询生产工序")
    public ResultObjectModel selectStageById(@RequestBody Stage stage) throws Exception {
        List<Stage> lists = new ArrayList<>();
        lists.add( stageService.selectStageById(stage.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询生产工序
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询生产线生产工序", notes="通过指定参数查询生产工序")
    public ResultObjectModel selectStageByPartment(@RequestBody Stage stage) throws Exception {
        List<Stage> lists =  stageService.selectStageByParameter(stage);
        return ResultObjectModel.success("成功",lists);
    }

}
