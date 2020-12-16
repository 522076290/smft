package com.smfst.xcw.controller;

import com.smfst.xcw.model.UserNormalCarStore;
import com.smfst.xcw.model.UserRepairCarStore;
import com.smfst.xcw.model.UserRepairCarStore;
import com.smfst.xcw.service.UserRepairCarStoreService;
import com.smfst.xcw.utils.ResultObjectModel;
import com.smfst.xcw.utils.UserNormalCarStoreUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserRepairCarStoreController
 * @Author lan
 * @Date 2020/11/4 23:19
 **/
@RestController
@RequestMapping("UserRepairCarStore")
@Api(tags = "维修车辆成品仓库接口控制器")
public class UserRepairCarStoreController {

    @Autowired
    private UserRepairCarStoreService userRepairCarStoreService;

    /**
     * 查询全部维修车辆成品仓库
     * @return
     */
    @ApiOperation(value="查询全部维修车辆成品仓库", notes="查询全部维修车辆成品仓库")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserRepairCarStore> list = userRepairCarStoreService.selectUserRepairCarStoreList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询维修车辆成品仓库
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询维修车辆成品仓库", notes="通过id查询维修车辆成品仓库")
    public ResultObjectModel selectUserRepairCarStoreById(@RequestBody UserRepairCarStore userRepairCarStore) throws Exception {
        List<UserRepairCarStore> lists = new ArrayList<>();
        lists.add(userRepairCarStoreService.selectUserRepairCarStoreById(userRepairCarStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询维修车辆成品仓库
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询维修车辆成品仓库", notes="通过指定参数查询维修车辆成品仓库")
    public ResultObjectModel selectUserRepairCarStoreByPartment(@RequestBody UserRepairCarStore userRepairCarStore) throws Exception {
        List<UserRepairCarStore> lists = userRepairCarStoreService.selectUserRepairCarStoreByParameter(userRepairCarStore);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增维修车辆成品仓库
     * @param userRepairCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增维修车辆成品仓库", notes="新增维修车辆成品仓库")
    public ResultObjectModel createUserUserRepairCarStore(@RequestBody UserRepairCarStore userRepairCarStore) throws Exception {
        userRepairCarStoreService.createUserRepairCarStore(userRepairCarStore);
        List<UserRepairCarStore> lists = new ArrayList<>();
        lists.add( userRepairCarStoreService.selectUserRepairCarStoreById(userRepairCarStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改维修车辆成品仓库
     * @param userRepairCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改维修车辆成品仓库", notes="修改维修车辆成品仓库")
    public ResultObjectModel updateUserRepairCarStore(@RequestBody UserRepairCarStore userRepairCarStore) throws Exception {
        userRepairCarStoreService.updateUserRepairCarStore(userRepairCarStore);
        List<UserRepairCarStore> lists = new ArrayList<>();
        lists.add( userRepairCarStoreService.selectUserRepairCarStoreById(userRepairCarStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除维修车辆成品仓库
     * @param userRepairCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除维修车辆成品仓库", notes="删除维修车辆成品仓库")
    public ResultObjectModel deletById(@RequestBody UserRepairCarStore userRepairCarStore) throws Exception {
        List<UserRepairCarStore> lists = new ArrayList<>();
        lists.add( userRepairCarStoreService.selectUserRepairCarStoreById(userRepairCarStore.getId()));
        userRepairCarStoreService.deletUserRepairCarStore(userRepairCarStore);
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改维修车辆成品仓库学生工厂
     * @param userRepairCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改维修车辆成品仓库学生工厂", notes="修改维修车辆成品仓库学生工厂")
    public ResultObjectModel updateUserRepairCarStoreWorkId(@RequestBody UserRepairCarStore userRepairCarStore) throws Exception {
        //获取所需参数
        UserRepairCarStore userRepairCarStore1 = new UserRepairCarStore();
        userRepairCarStore1.setId(userRepairCarStore.getId());
        userRepairCarStore1.setUserWorkId(userRepairCarStore.getUserWorkId());
        //更新
        userRepairCarStoreService.updateUserRepairCarStore(userRepairCarStore1);
        //添加到结果集
        List<UserRepairCarStore> lists = new ArrayList<>();
        lists.add(userRepairCarStoreService.selectUserRepairCarStoreById(userRepairCarStore1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改维修车辆成品仓库学生生产线
     * @param userRepairCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改维修车辆成品仓库学生生产线", notes="修改维修车辆成品仓库学生生产线")
    public ResultObjectModel updateUserRepairCarStoreUserProductionLineId(@RequestBody UserRepairCarStore userRepairCarStore) throws Exception {
        //获取所需参数
        UserRepairCarStore userRepairCarStore1 = new UserRepairCarStore();
        userRepairCarStore1.setId(userRepairCarStore.getId());
        userRepairCarStore1.setUserProductionLineId(userRepairCarStore.getUserProductionLineId());
        //更新
        userRepairCarStoreService.updateUserRepairCarStore(userRepairCarStore1);
        //添加到结果集
        List<UserRepairCarStore> lists = new ArrayList<>();
        lists.add(userRepairCarStoreService.selectUserRepairCarStoreById(userRepairCarStore1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改维修车辆成品仓库汽车
     * @param userRepairCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateCarId",method = RequestMethod.POST)
    @ApiOperation(value="修改维修车辆成品仓库汽车", notes="修改维修车辆成品仓库汽车")
    public ResultObjectModel updateUserRepairCarStoreCarId(@RequestBody UserRepairCarStore userRepairCarStore) throws Exception {
        //获取所需参数
        UserRepairCarStore userRepairCarStore1 = new UserRepairCarStore();
        userRepairCarStore1.setId(userRepairCarStore.getId());
        userRepairCarStore1.setCarId(userRepairCarStore.getCarId());
        //更新
        userRepairCarStoreService.updateUserRepairCarStore(userRepairCarStore1);
        //添加到结果集
        List<UserRepairCarStore> lists = new ArrayList<>();
        lists.add(userRepairCarStoreService.selectUserRepairCarStoreById(userRepairCarStore1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改维修车辆成品仓库数量
     * @param userRepairCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateNum",method = RequestMethod.POST)
    @ApiOperation(value="修改维修车辆成品仓库数量", notes="修改维修车辆成品仓库数量")
    public ResultObjectModel updateUserRepairCarStoreNum(@RequestBody UserRepairCarStore userRepairCarStore) throws Exception {
        //获取所需参数
        UserRepairCarStore userRepairCarStore1 = new UserRepairCarStore();
        userRepairCarStore1.setId(userRepairCarStore.getId());
        userRepairCarStore1.setNum(userRepairCarStore.getNum());
        //更新
        userRepairCarStoreService.updateUserRepairCarStore(userRepairCarStore1);
        //添加到结果集
        List<UserRepairCarStore> lists = new ArrayList<>();
        lists.add(userRepairCarStoreService.selectUserRepairCarStoreById(userRepairCarStore1.getId()));
        return ResultObjectModel.success("成功",lists);
    }


}
