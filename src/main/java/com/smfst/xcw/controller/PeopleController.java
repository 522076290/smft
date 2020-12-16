package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.model.People;
import com.smfst.xcw.service.PeopleService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 *@ClassName PeopleController
 *@Author lan
 *@Date 2020/10/20 20:07
 **/
@RestController
@RequestMapping("People")
@Api(tags = "人员信息接口控制器")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    /**
     * 查询全部人员
     * @return
     */
    @ApiOperation(value="查询全部人员", notes="查询全部人员")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<People> list = peopleService.selectPeopleList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 通过id查询人员
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询人员", notes="通过id查询人员")
    public ResultObjectModel selectPeopleById(@RequestBody People people) throws Exception {
        List<People> lists = new ArrayList<>();
        lists.add( peopleService.selectPeopleById(people.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询人员
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询人员", notes="通过指定参数查询人员")
    public ResultObjectModel selectPeopleByPartment(@RequestBody People people) throws Exception {
        List<People> lists = peopleService.selectPeopleByParameter(people);
        return ResultObjectModel.success("成功",lists);
    }

}
