package com.smfst.xcw.controller;

import com.smfst.xcw.model.UserNormalCarStore;
import com.smfst.xcw.model.UserNormalCarStore;
import com.smfst.xcw.model.UserNormalCarStore;
import com.smfst.xcw.model.UserNormalCarStore;
import com.smfst.xcw.service.UserNormalCarStoreService;
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
 * @ClassName UserNormalCarStoreController
 * @Author lan
 * @Date 2020/11/4 17:34
 **/
@RestController
@RequestMapping("UserNormalCarStore")
@Api(tags = "正常车辆成品仓库接口控制器")
public class UserNormalCarStoreController {
    @Autowired
    private UserNormalCarStoreService userNormalCarStoreService;

    /**
     * 查询全部正常车辆成品仓库
     * @return
     */
    @ApiOperation(value="查询全部正常车辆成品仓库", notes="查询全部正常车辆成品仓库")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<UserNormalCarStore> list = userNormalCarStoreService.selectUserNormalCarStoreList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询正常车辆成品仓库
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询正常车辆成品仓库", notes="通过id查询正常车辆成品仓库")
    public ResultObjectModel selectUserNormalCarStoreById(@RequestBody UserNormalCarStore userNormalCarStore) throws Exception {
        List<UserNormalCarStore> lists = new ArrayList<>();
        lists.add(userNormalCarStoreService.selectUserNormalCarStoreById(userNormalCarStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询正常车辆成品仓库
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询正常车辆成品仓库", notes="通过指定参数查询正常车辆成品仓库")
    public ResultObjectModel selectUserNormalCarStoreByPartment(@RequestBody UserNormalCarStore userNormalCarStore) throws Exception {
        List<UserNormalCarStore> lists = userNormalCarStoreService.selectUserNormalCarStoreByParameter(userNormalCarStore);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增正常车辆成品仓库
     * @param userNormalCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增正常车辆成品仓库", notes="新增正常车辆成品仓库")
    public ResultObjectModel createUserUserNormalCarStore(@RequestBody UserNormalCarStore userNormalCarStore) throws Exception {
        userNormalCarStoreService.createUserNormalCarStore(userNormalCarStore);
        List<UserNormalCarStore> lists = new ArrayList<>();
        lists.add( userNormalCarStoreService.selectUserNormalCarStoreById(userNormalCarStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改正常车辆成品仓库
     * @param userNormalCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改正常车辆成品仓库", notes="修改正常车辆成品仓库")
    public ResultObjectModel updateUserNormalCarStore(@RequestBody UserNormalCarStore userNormalCarStore) throws Exception {
        userNormalCarStoreService.updateUserNormalCarStore(userNormalCarStore);
        List<UserNormalCarStore> lists = new ArrayList<>();
        lists.add( userNormalCarStoreService.selectUserNormalCarStoreById(userNormalCarStore.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 删除正常车辆成品仓库
     * @param userNormalCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除正常车辆成品仓库", notes="删除正常车辆成品仓库")
    public ResultObjectModel deletById(@RequestBody UserNormalCarStore userNormalCarStore) throws Exception {
        List<UserNormalCarStore> lists = new ArrayList<>();
        lists.add( userNormalCarStoreService.selectUserNormalCarStoreById(userNormalCarStore.getId()));
        userNormalCarStoreService.deletUserNormalCarStore(userNormalCarStore);
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改正常车辆成品仓库学生工厂
     * @param userNormalCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkId",method = RequestMethod.POST)
    @ApiOperation(value="修改正常车辆成品仓库学生工厂", notes="修改正常车辆成品仓库学生工厂")
    public ResultObjectModel updateUserNormalCarStoreWorkId(@RequestBody UserNormalCarStore userNormalCarStore) throws Exception {

        //获取所需参数
        UserNormalCarStore userNormalCarLog1 = new UserNormalCarStore();
        userNormalCarLog1.setId(userNormalCarStore.getId());
        userNormalCarLog1.setUserWorkId(userNormalCarStore.getUserWorkId());

        //更新
        userNormalCarStoreService.updateUserNormalCarStore(userNormalCarLog1);
        //添加到结果集
        List<UserNormalCarStore> lists = new ArrayList<>();
        lists.add(userNormalCarStoreService.selectUserNormalCarStoreById(userNormalCarLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改正常车辆成品仓库学生生产线
     * @param userNormalCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserProductionLineId",method = RequestMethod.POST)
    @ApiOperation(value="修改正常车辆成品仓库学生生产线", notes="修改正常车辆成品仓库学生生产线")
    public ResultObjectModel updateUserNormalCarStoreUserProductionLineId(@RequestBody UserNormalCarStore userNormalCarStore) throws Exception {
        //获取所需参数
        UserNormalCarStore userNormalCarLog1 = new UserNormalCarStore();
        userNormalCarLog1.setId(userNormalCarStore.getId());
        userNormalCarLog1.setUserProductionLineId(userNormalCarStore.getUserProductionLineId());

        //更新
        userNormalCarStoreService.updateUserNormalCarStore(userNormalCarLog1);
        //添加到结果集
        List<UserNormalCarStore> lists = new ArrayList<>();
        lists.add(userNormalCarStoreService.selectUserNormalCarStoreById(userNormalCarLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改正常车辆成品仓库汽车
     * @param userNormalCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateCarId",method = RequestMethod.POST)
    @ApiOperation(value="修改正常车辆成品仓库汽车", notes="修改正常车辆成品仓库汽车")
    public ResultObjectModel updateUserNormalCarStoreCarId(@RequestBody UserNormalCarStore userNormalCarStore) throws Exception {
        //获取所需参数
        UserNormalCarStore userNormalCarLog1 = new UserNormalCarStore();
        userNormalCarLog1.setId(userNormalCarStore.getId());
        userNormalCarLog1.setCarId(userNormalCarStore.getCarId());

        //更新
        userNormalCarStoreService.updateUserNormalCarStore(userNormalCarLog1);
        //添加到结果集
        List<UserNormalCarStore> lists = new ArrayList<>();
        lists.add(userNormalCarStoreService.selectUserNormalCarStoreById(userNormalCarLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改正常车辆成品仓库数量
     * @param userNormalCarStore
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateNum",method = RequestMethod.POST)
    @ApiOperation(value="修改正常车辆成品仓库数量", notes="修改正常车辆成品仓库数量")
    public ResultObjectModel updateUserNormalCarStoreNum(@RequestBody UserNormalCarStore userNormalCarStore) throws Exception {
        //获取所需参数
        UserNormalCarStore userNormalCarLog1 = new UserNormalCarStore();
        userNormalCarLog1.setId(userNormalCarStore.getId());
        userNormalCarLog1.setNum(userNormalCarStore.getNum());

        //更新
        userNormalCarStoreService.updateUserNormalCarStore(userNormalCarLog1);
        //添加到结果集
        List<UserNormalCarStore> lists = new ArrayList<>();
        lists.add(userNormalCarStoreService.selectUserNormalCarStoreById(userNormalCarLog1.getId()));

        return ResultObjectModel.success("成功",lists);
    }


 

}
