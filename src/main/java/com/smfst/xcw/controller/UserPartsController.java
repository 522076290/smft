package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/27
 */

import com.smfst.xcw.model.UserParts;
import com.smfst.xcw.model.UserParts;
import com.smfst.xcw.service.UserPartsService;
import com.smfst.xcw.utils.ResultObjectModel;
import com.smfst.xcw.utils.UserPartsUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *@ClassName UserPartsController
 *@Author lan
 *@Date 2020/10/27 17:39
 **/
@RestController
@RequestMapping("UserParts")
@Api(tags = "学生备料接口控制器")
public class UserPartsController {
    
    @Autowired
    private UserPartsService userPartsService;

    /**
     * 查询全部学生备料
     * @return
     */
    @ApiOperation(value="查询全部学生备料", notes="查询全部学生备料")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserParts> list = userPartsService.selectUserPartsList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生备料
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生备料", notes="通过id查询学生备料")
    public ResultObjectModel selectUserPartsById(@RequestBody UserParts UserParts) throws Exception {
        List<UserParts> lists = new ArrayList<>();
        lists.add(userPartsService.selectUserPartsById(UserParts.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生备料
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生备料", notes="通过指定参数查询学生备料")
    public ResultObjectModel selectUserPartsByPartment(@RequestBody UserParts UserParts) throws Exception {
        List<UserParts> lists = userPartsService.selectUserPartsByParameter(UserParts);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生备料
     * @param UserParts
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生备料", notes="新增学生备料")
    public ResultObjectModel createUserParts(@RequestBody UserParts UserParts) throws Exception {
        userPartsService.createUserParts(UserParts);
        List<UserParts> lists = new ArrayList<>();
        lists.add( userPartsService.selectUserPartsById(UserParts.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生备料
     * @param UserParts
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生备料", notes="修改学生备料")
    public ResultObjectModel updateUserParts(@RequestBody UserParts UserParts) throws Exception {
        userPartsService.updateUserParts(UserParts);
        List<UserParts> lists = new ArrayList<>();
        lists.add( userPartsService.selectUserPartsById(UserParts.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生备料学生工厂
     * @param userParts
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生备料学生工厂", notes="修改学生备料学生工厂")
    public ResultObjectModel updateUserPartsUserWorkId(@RequestBody UserParts userParts) throws Exception {
        //获取所需参数
        UserParts userParts1 = new UserParts();
        userParts1.setId(userParts.getId());
        userParts1.setUserWorkId(userParts.getUserWorkId());

        //更新
        userPartsService.updateUserParts(userParts1);
        //添加到结果集
        List<UserParts> lists = new ArrayList<>();
        lists.add(userPartsService.selectUserPartsById(userParts.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生备料学生生产线
     * @param userParts
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生备料学生生产线", notes="修改学生备料学生生产线")
    public ResultObjectModel updateUserPartsUserProductionLineId(@RequestBody UserParts userParts) throws Exception {
        //获取所需参数
        UserParts userParts1 = new UserParts();
        userParts1.setId(userParts.getId());
        userParts1.setUserProductionLineId(userParts.getUserProductionLineId());

        //更新
        userPartsService.updateUserParts(userParts1);
        //添加到结果集
        List<UserParts> lists = new ArrayList<>();
        lists.add(userPartsService.selectUserPartsById(userParts.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生备料原材料
     * @param userParts
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePartId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生备料原材料", notes="修改学生备料原材料")
    public ResultObjectModel updateUserPartsPartId(@RequestBody UserParts userParts) throws Exception {
        //获取所需参数
        UserParts userParts1 = new UserParts();
        userParts1.setId(userParts.getId());
        userParts1.setPartId(userParts.getPartId());

        //更新
        userPartsService.updateUserParts(userParts1);
        //添加到结果集
        List<UserParts> lists = new ArrayList<>();
        lists.add(userPartsService.selectUserPartsById(userParts.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生备料数量
     * @param userParts
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateNum",method = RequestMethod.POST)
    @ApiOperation(value="修改学生备料数量", notes="修改学生备料数量")
    public ResultObjectModel updateUserPartsNum(@RequestBody UserParts userParts) throws Exception {
        //获取所需参数
        UserParts userParts1 = new UserParts();
        userParts1.setId(userParts.getId());
        userParts1.setNum(userParts.getNum());

        //更新
        userPartsService.updateUserParts(userParts1);
        //添加到结果集
        List<UserParts> lists = new ArrayList<>();
        lists.add(userPartsService.selectUserPartsById(userParts.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 删除学生备料
     * @param userParts
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生备料", notes="删除学生备料")
    public ResultObjectModel deletById(@RequestBody UserParts userParts) throws Exception {
        List<UserParts> lists = new ArrayList<>();
        lists.add( userPartsService.selectUserPartsById(userParts.getId()));
        userPartsService.deletUserParts(userParts);
        return ResultObjectModel.success("成功",lists);
    }
    


}
