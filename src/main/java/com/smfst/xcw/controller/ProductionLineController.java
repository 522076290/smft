package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/14
 */

import com.smfst.xcw.model.ProductionLine;
import com.smfst.xcw.service.ProductionLineService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName ProductionLineController
 *@Author lan
 *@Date 2020/10/14 16:20
 **/
@RestController
@RequestMapping("ProductionLine")
@Api(tags = "生产线接口控制器")
public class ProductionLineController {
    @Autowired
    ProductionLineService productionLineService;

    /**
     * 查询全部生产线
     * @return
     */
    @ApiOperation(value="查询全部生产线", notes="查询全部生产线")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<ProductionLine> list = productionLineService.selectProductionLineList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 通过id查询生产线
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询生产线", notes="通过id查询生产线")
    public ResultObjectModel selectProductionLineById(@RequestBody ProductionLine productionLine) throws Exception {
        List<ProductionLine> lists = new ArrayList<>();
        lists.add( productionLineService.selectProductionLineById(productionLine.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询生产线
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询生产线", notes="通过指定参数查询生产线")
    public ResultObjectModel selectProductionLineByPartment(@RequestBody ProductionLine productionLine) throws Exception {
        List<ProductionLine> lists = productionLineService.selectProductionLineByParameter(productionLine);
        return ResultObjectModel.success("成功",lists);
    }
}
