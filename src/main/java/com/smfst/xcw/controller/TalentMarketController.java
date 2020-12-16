package com.smfst.xcw.controller;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.model.TalentMarket;
import com.smfst.xcw.service.TalentMarketService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName TalentMarketController
 *@Author lan
 *@Date 2020/10/20 20:50
 **/
@RestController
@RequestMapping("TalentMarket")
@Api(tags = "人才市场接口控制器")
public class TalentMarketController {

    @Autowired
    private TalentMarketService talentMarketService;

    /**
     * 查询全部人才市场
     * @return
     */
    @ApiOperation(value="查询全部人才市场", notes="查询全部人才市场")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<TalentMarket> list = talentMarketService.selectTalentMarketList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询人才市场
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询人才市场", notes="通过id查询人才市场")
    public ResultObjectModel selectTalentMarketById(@RequestBody TalentMarket talentMarket) throws Exception {
        List<TalentMarket> lists = new ArrayList<>();
        lists.add( talentMarketService.selectTalentMarketById(talentMarket.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询人才市场
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询人才市场", notes="通过指定参数查询人才市场")
    public ResultObjectModel selectTalentMarketByPartment(@RequestBody TalentMarket talentMarket) throws Exception {
        List<TalentMarket> lists = talentMarketService.selectTalentMarketByParameter(talentMarket);
        return ResultObjectModel.success("成功",lists);
    }
}
