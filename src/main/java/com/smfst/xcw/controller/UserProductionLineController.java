package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.UserProductionLine;
import com.smfst.xcw.model.UserProductionLine;
import com.smfst.xcw.service.UserProductionLineService;
import com.smfst.xcw.utils.ResultObjectModel;
import com.smfst.xcw.utils.UserProductionLineUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *@ClassName UserProductionLineController
 *@Author lan
 *@Date 2020/10/26 15:32
 **/
@RestController
@RequestMapping("UserProductionLine")
@Api(tags = "学生生产线接口控制器")
public class UserProductionLineController {

    @Autowired
    private UserProductionLineService userProductionLineService;

    /**
     * 查询全部学生生产线
     * @return
     */
    @ApiOperation(value="查询全部学生生产线", notes="查询全部学生生产线")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserProductionLine> list = userProductionLineService.selectUserProductionLineList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生生产线
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生生产线", notes="通过id查询学生生产线")
    public ResultObjectModel selectUserProductionLineById(@RequestBody UserProductionLine userProductionLine) throws Exception {
        List<UserProductionLine> lists = new ArrayList<>();
        lists.add(userProductionLineService.selectUserProductionLineById(userProductionLine.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生生产线
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生生产线", notes="通过指定参数查询学生生产线")
    public ResultObjectModel selectUserProductionLineByPartment(@RequestBody UserProductionLine userProductionLine) throws Exception {
        List<UserProductionLine> lists = userProductionLineService.selectUserProductionLineByParameter(userProductionLine);
        return ResultObjectModel.success("成功",lists);
    }



    /**
     * 新增学生生产线
     * @param userProductionLine
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生生产线", notes="新增学生生产线")
    public ResultObjectModel createUserProductionLine(@RequestBody UserProductionLine userProductionLine) throws Exception {
        userProductionLineService.createUserProductionLine(userProductionLine);
        List<UserProductionLine> lists = new ArrayList<>();
        lists.add( userProductionLineService.selectUserProductionLineById(userProductionLine.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生生产线
     * @param userProductionLine
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产线", notes="修改学生生产线")
    public ResultObjectModel updateUserProductionLine(@RequestBody UserProductionLine userProductionLine) throws Exception {
        userProductionLineService.updateUserProductionLine(userProductionLine);
        List<UserProductionLine> lists = new ArrayList<>();
        lists.add( userProductionLineService.selectUserProductionLineById(userProductionLine.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生生产线学生工厂
     * @param userProductionLine
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产线学生工厂", notes="修改学生生产线学生工厂")
    public ResultObjectModel updateUserProductionLineWorkId(@RequestBody UserProductionLine userProductionLine) throws Exception {
        //获取所需参数
        UserProductionLine userProductionLine1 = new UserProductionLine();
        userProductionLine1.setId(userProductionLine.getId());
        userProductionLine1.setUserWorkId(userProductionLine.getUserWorkId());

        //更新
        userProductionLineService.updateUserProductionLine(userProductionLine1);
        //添加到结果集
        List<UserProductionLine> lists = new ArrayList<>();
        lists.add(userProductionLineService.selectUserProductionLineById(userProductionLine.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生生产线当前生产工序
     * @param userProductionLine
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateStageId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产线当前生产工序", notes="修改学生生产线当前生产工序")
    public ResultObjectModel updateUserProductionLineStageId(@RequestBody UserProductionLine userProductionLine) throws Exception {
        //获取所需参数
        UserProductionLine userProductionLine1 = new UserProductionLine();
        userProductionLine1.setId(userProductionLine.getId());
        userProductionLine1.setStageId(userProductionLine.getStageId());

        //更新
        userProductionLineService.updateUserProductionLine(userProductionLine1);
        //添加到结果集
        List<UserProductionLine> lists = new ArrayList<>();
        lists.add(userProductionLineService.selectUserProductionLineById(userProductionLine.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生生产线生产线
     * @param userProductionLine
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产线生产线", notes="修改学生生产线生产线")
    public ResultObjectModel updateUserProductionLineproductionLineId(@RequestBody UserProductionLine userProductionLine) throws Exception {
        //获取所需参数
        UserProductionLine userProductionLine1 = new UserProductionLine();
        userProductionLine1.setId(userProductionLine.getId());
        userProductionLine1.setProductionLineId(userProductionLine.getProductionLineId());

        //更新
        userProductionLineService.updateUserProductionLine(userProductionLine1);
        //添加到结果集
        List<UserProductionLine> lists = new ArrayList<>();
        lists.add(userProductionLineService.selectUserProductionLineById(userProductionLine.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生生产线状态
     * @param userProductionLine
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateType",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产线状态", notes="修改学生生产线状态")
    public ResultObjectModel updateUserInPriceLogType(@RequestBody UserProductionLine userProductionLine) throws Exception {
        //获取所需参数
        UserProductionLine userProductionLine1 = new UserProductionLine();
        userProductionLine1.setId(userProductionLine.getId());
        userProductionLine1.setType(userProductionLine.getType());

        //更新
        userProductionLineService.updateUserProductionLine(userProductionLine1);
        //添加到结果集
        List<UserProductionLine> lists = new ArrayList<>();
        lists.add(userProductionLineService.selectUserProductionLineById(userProductionLine.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生生产线位置
     * @param userProductionLine
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePosition",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产线位置", notes="修改学生生产线位置")
    public ResultObjectModel updateUserInPriceLogPosition(@RequestBody UserProductionLine userProductionLine) throws Exception {
        //获取所需参数
        UserProductionLine userProductionLine1 = new UserProductionLine();
        userProductionLine1.setId(userProductionLine.getId());
        userProductionLine1.setPosition(userProductionLine.getPosition());

        //更新
        userProductionLineService.updateUserProductionLine(userProductionLine1);
        //添加到结果集
        List<UserProductionLine> lists = new ArrayList<>();
        lists.add(userProductionLineService.selectUserProductionLineById(userProductionLine.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改学生生产线是否AI
     * @param userProductionLine
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateIsAI",method = RequestMethod.POST)
    @ApiOperation(value="修改学生生产线是否AI", notes="修改学生生产线是否AI")
    public ResultObjectModel updateUserInPriceLogIsAI(@RequestBody UserProductionLine userProductionLine) throws Exception {
        //获取所需参数
        UserProductionLine userProductionLine1 = new UserProductionLine();
        userProductionLine1.setId(userProductionLine.getId());
        userProductionLine1.setIsAI(userProductionLine.getIsAI());

        //更新
        userProductionLineService.updateUserProductionLine(userProductionLine1);
        //添加到结果集
        List<UserProductionLine> lists = new ArrayList<>();
        lists.add(userProductionLineService.selectUserProductionLineById(userProductionLine.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除学生生产线
     * @param
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生生产线", notes="删除学生生产线")
    public ResultObjectModel deletById(@RequestParam Map<String,String> map) throws Exception {
        List<UserProductionLine> lists = new ArrayList<>();
        lists.add( userProductionLineService.selectUserProductionLineById(Integer.valueOf(map.get("id"))));
        if (lists.get(0)!=null){
            userProductionLineService.deletUserProductionLine(lists.get(0));
            return ResultObjectModel.success("成功",lists);
        } else {
            return ResultObjectModel.fail("失败");
        }

    }


}
