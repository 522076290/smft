package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.PassRate;
import com.smfst.xcw.service.PassRateService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName PassRateController
 *@Author lan
 *@Date 2020/10/23 15:13
 **/
@RestController
@RequestMapping("PassRate")
@Api(tags = "产品合格率接口控制器")
public class PassRateController {

    @Autowired
    private PassRateService passRateService;

    /**
     * 查询全部产品合格率
     * @return
     */
    @ApiOperation(value="查询全部产品合格率", notes="查询全部产品合格率")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<PassRate> list = passRateService.selectPassRateList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 通过id查询产品合格率
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询产品合格率", notes="通过id查询产品合格率")
    public ResultObjectModel selectPassRateById(@RequestBody PassRate passRate) throws Exception {
        List<PassRate> lists = new ArrayList<>();
        lists.add( passRateService.selectPassRateById(passRate.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询产品合格率
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询产品合格率", notes="通过指定参数查询产品合格率")
    public ResultObjectModel selectPassRateByPartment(@RequestBody PassRate passRate) throws Exception {
        List<PassRate> lists = passRateService.selectPassRateByParameter(passRate);
        return ResultObjectModel.success("成功",lists);
    }


}
