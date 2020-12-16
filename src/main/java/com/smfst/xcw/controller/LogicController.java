package com.smfst.xcw.controller;

import com.smfst.xcw.model.*;
import com.smfst.xcw.service.*;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 逻辑接口控制器
 * @author My VM
 */
@RestController
@RequestMapping("index")
@Api(tags = "逻辑接口控制器")
public class LogicController {
    @Autowired
    private MaterialService materialService; //原材料
    @Autowired
    private UserProductionLineService userProductionLineService; //学生生产线
    @Autowired
    private UserPartStoreService userPartStoreService;  //学生原材料仓库
    @Autowired
    private UserWorkInfoService userWorkInfoService; //学生工厂信息
    @Autowired
    private SuppierListService suppierListService; //材料列表
    /**
     * 查询全部原材料
     * @return
     */
    @ApiOperation(value="获取原材料详情", notes="获取原材料详情")
    @RequestMapping(value = "/getMaterial",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<Material> list = materialService.selectMaterialList();
        return ResultObjectModel.success("成功",list);
    }

    /**
     * 创建学生生产线
     */
    @ApiOperation(value="创建学生生产线", notes="创建学生生产线")
    @RequestMapping(value = "/createStudentLine",method = RequestMethod.POST)
    public ResultObjectModel createStudentLine(@RequestParam Map<String,String> map) {
        UserProductionLine userProductionLine = userProductionLineService.selectUserProductionLineByPosition(Integer.valueOf(map.get("pos")));
//        判断是否创建了该条线，没有的话就创建
        if (userProductionLine==null){
            userProductionLine = new UserProductionLine();
            userProductionLine.setUserWorkId(1);
            userProductionLine.setStageId(1);
            userProductionLine.setProductionLineId(Integer.valueOf(map.get("lineId")));
            userProductionLine.setType(0);
            userProductionLine.setPosition(Integer.valueOf(map.get("pos")));
            userProductionLine.setIsAI(0);
            userProductionLineService.createUserProductionLine(userProductionLine);
            return ResultObjectModel.success("创建学生生产线成功");
        }
        return ResultObjectModel.fail("失败","该位置已存在生产线");
    }
    /**
     * 仓库进货
     */
    @ApiOperation(value="仓库进货", notes="仓库进货")
    @RequestMapping(value = "/addUserMaterialStore",method = RequestMethod.POST)
    public ResultObjectModel addUserMaterialStore(@RequestParam Map<String,String> map) {
//        取出该材料的数据
        UserProductionLine userProductionLine = userProductionLineService.selectUserProductionLineById(Integer.valueOf(map.get("userLineId")));
        SuppierList suppierList = suppierListService.selectSuppierListById(Integer.valueOf(map.get("supplyListId")));
//        如果取到数据
        if (suppierList!=null && userProductionLine!=null){
            UserWorkInfo userWorkInfo = userWorkInfoService.selectUserWorkInfoById(1);
//            取出商品价格
            int gold = suppierList.getGold();
//            取出学生工厂余额
            int price = userWorkInfo.getPrice();
//            如果余额够的话
            if (price > gold*Integer.valueOf(map.get("num"))){
                price-= gold*Integer.valueOf(map.get("num"));
                userWorkInfo.setPrice(price);
                userWorkInfoService.updateUserWorkInfo(userWorkInfo);
//                添加仓库材料
                UserPartStore userPartStore = new UserPartStore();
                userPartStore.setUserWorkId(1);
                userPartStore.setPartId(suppierList.getPartId());
                userPartStore.setNum(Integer.valueOf(map.get("num")));
                userPartStore.setUserProductionLineId(Integer.valueOf(map.get("userLineId")));
                userPartStoreService.createUserPartStore(userPartStore);
                return ResultObjectModel.success("购买材料入库成功");
            } else {
                System.out.println("余额不够");
                return ResultObjectModel.fail("失败，余额不足");

            }
        }
        System.out.println("没取到数据");
        return ResultObjectModel.fail("失败,没有该产线或该供货材料不存在");
    }

    /**
     * 查询供货列表
     * @return
     */
    @ApiOperation(value="查询供货列表", notes="查询供货列表")
    @RequestMapping(value = "/supplyListTEditer",method = RequestMethod.POST)
    public ResultObjectModel selectSupplyListTEditer() {
        List<SupplyListTEditer> list = materialService.selectSupplyListTEditer();
        return ResultObjectModel.success("成功",list);
    }
    /**
     * 查询售出记录
     * @return
     */
    @ApiOperation(value="查询售出记录", notes="查询售出记录")
    @RequestMapping(value = "/userSellInfoTEditer",method = RequestMethod.POST)
    public ResultObjectModel userSellInfoTEditer() {
        List<UserSellInfoTEditer> list = materialService.selectUserSellInfoTEditer();
        return ResultObjectModel.success("成功",list);
    }
    /**
     * 查询原材料入库日志
     * @return
     */
    @ApiOperation(value="查询原材料入库日志", notes="查询原材料入库日志")
    @RequestMapping(value = "/getUserMaterialLog",method = RequestMethod.POST)
    public ResultObjectModel selectUserMaterialLog() {
        List<UserMaterialLog> list = materialService.selectUserMaterialLog();
        return ResultObjectModel.success("成功",list);
    }
}
