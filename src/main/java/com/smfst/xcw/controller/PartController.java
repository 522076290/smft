package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.Part;
import com.smfst.xcw.service.PartService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName PartController
 *@Author lan
 *@Date 2020/10/23 13:57
 **/
@RestController
@RequestMapping("Part")
@Api(tags = "原材料接口控制器")
public class PartController {

    @Autowired
    private PartService partService;

    /**
     * 查询原材料
     * @return
     */
    @ApiOperation(value="查询全部原材料", notes="查询全部原材料")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<Part> list = partService.selectPartList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 通过id查询原材料
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询原材料", notes="通过id查询原材料")
    public ResultObjectModel selectPartById(@RequestBody Part part) throws Exception {
        List<Part> lists = new ArrayList<>();
        lists.add( partService.selectPartById(part.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询原材料
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询原材料", notes="通过指定参数查询原材料")
    public ResultObjectModel selectPartByPartment(@RequestBody Part part) throws Exception {
        List<Part> lists = partService.selectPartByParameter(part);
        return ResultObjectModel.success("成功",lists);
    }

}
