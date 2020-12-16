package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/27
 */

import com.smfst.xcw.model.UserPartStore;
import com.smfst.xcw.model.UserParts;
import com.smfst.xcw.service.UserPartStoreService;
import com.smfst.xcw.utils.ResultObjectModel;
import com.smfst.xcw.utils.UserPartStoreUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *@ClassName UserPartStoreController
 *@Author lan
 *@Date 2020/10/27 21:23
 **/
@RestController
@RequestMapping("UserPartStore")
@Api(tags = "学生原材料仓库接口控制器")
public class UserPartStoreController {

    @Autowired
    private UserPartStoreService userPartStoreService;


    /**
     * 查询全部学生原材料
     * @return
     */
    @ApiOperation(value="查询全部学生原材料", notes="查询全部学生原材料")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserPartStore> list = userPartStoreService.selectUserPartStoreList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询学生原材料
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询学生原材料", notes="通过id查询学生原材料")
    public ResultObjectModel selectUserPartStoreById(@RequestBody UserPartStore UserPartStore) throws Exception {
        List<com.smfst.xcw.model.UserPartStore> lists = new ArrayList<>();
        lists.add(userPartStoreService.selectUserPartStoreById(UserPartStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询学生原材料
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询学生原材料", notes="通过指定参数查询学生原材料")
    public ResultObjectModel selectUserPartStoreByPartment(@RequestBody UserPartStore UserPartStore) throws Exception {
        List<com.smfst.xcw.model.UserPartStore> lists = userPartStoreService.selectUserPartStoreByParameter(UserPartStore);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增学生原材料
     * @param UserPartStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增学生原材料", notes="新增学生原材料")
    public ResultObjectModel createUserPartStore(@RequestBody UserPartStore UserPartStore) throws Exception {
        userPartStoreService.createUserPartStore(UserPartStore);
        List<com.smfst.xcw.model.UserPartStore> lists = new ArrayList<>();
        lists.add( userPartStoreService.selectUserPartStoreById(UserPartStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生原材料
     * @param UserPartStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改学生原材料", notes="修改学生原材料")
    public ResultObjectModel updateUserPartStore(@RequestBody UserPartStore UserPartStore) throws Exception {
        userPartStoreService.updateUserPartStore(UserPartStore);
        List<com.smfst.xcw.model.UserPartStore> lists = new ArrayList<>();
        lists.add( userPartStoreService.selectUserPartStoreById(UserPartStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生原材料学生工厂
     * @param userPartStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生原材料学生工厂", notes="修改学生原材料学生工厂")
    public ResultObjectModel updateUserPartStoreUserWorkId(@RequestBody UserPartStore userPartStore) throws Exception {
        //获取所需参数
        UserPartStore userPartStore1 = new UserPartStore();
        userPartStore1.setId(userPartStore.getId());
        userPartStore1.setUserWorkId(userPartStore.getUserWorkId());

        //更新
        userPartStoreService.updateUserPartStore(userPartStore1);
        //添加到结果集
        List<UserPartStore> lists = new ArrayList<>();
        lists.add(userPartStoreService.selectUserPartStoreById(userPartStore.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生原材料学生生产线
     * @param userPartStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生原材料学生生产线", notes="修改学生原材料学生生产线")
    public ResultObjectModel updateUserPartStoreUserProductionLineId(@RequestBody UserPartStore userPartStore) throws Exception {
        //获取所需参数
        UserPartStore userPartStore1 = new UserPartStore();
        userPartStore1.setId(userPartStore.getId());
        userPartStore1.setUserProductionLineId(userPartStore.getUserProductionLineId());

        //更新
        userPartStoreService.updateUserPartStore(userPartStore1);
        //添加到结果集
        List<UserPartStore> lists = new ArrayList<>();
        lists.add(userPartStoreService.selectUserPartStoreById(userPartStore.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生原材料原材料
     * @param userPartStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updatePartId",method = RequestMethod.POST)
    @ApiOperation(value="修改学生原材料原材料", notes="修改学生原材料原材料")
    public ResultObjectModel updateUserPartStorePartId(@RequestBody UserPartStore userPartStore) throws Exception {
        //获取所需参数
        UserPartStore userPartStore1 = new UserPartStore();
        userPartStore1.setId(userPartStore.getId());
        userPartStore1.setPartId(userPartStore.getPartId());

        //更新
        userPartStoreService.updateUserPartStore(userPartStore1);
        //添加到结果集
        List<UserPartStore> lists = new ArrayList<>();
        lists.add(userPartStoreService.selectUserPartStoreById(userPartStore.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改学生原材料数量
     * @param userPartStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateNum",method = RequestMethod.POST)
    @ApiOperation(value="修改学生原材料数量", notes="修改学生原材料数量")
    public ResultObjectModel updateUserPartStoreNum(@RequestBody UserPartStore userPartStore) throws Exception {
        //获取所需参数
        UserPartStore userPartStore1 = new UserPartStore();
        userPartStore1.setId(userPartStore.getId());
        userPartStore1.setNum(userPartStore.getNum());

        //更新
        userPartStoreService.updateUserPartStore(userPartStore1);
        //添加到结果集
        List<UserPartStore> lists = new ArrayList<>();
        lists.add(userPartStoreService.selectUserPartStoreById(userPartStore.getId()));

        return ResultObjectModel.success("成功",lists);
    }



    /**
     * 删除学生原材料
     * @param UserPartStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除学生原材料", notes="删除学生原材料")
    public ResultObjectModel deletById(@RequestBody UserPartStore UserPartStore) throws Exception {
        List<com.smfst.xcw.model.UserPartStore> lists = new ArrayList<>();
        lists.add( userPartStoreService.selectUserPartStoreById(UserPartStore.getId()));
        userPartStoreService.deletUserPartStore(UserPartStore);
        return ResultObjectModel.success("成功",lists);
    }


    
}
