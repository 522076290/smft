package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.plStepCost;

import java.util.List;

/**
 *@ClassName plStepCostService
 *@Author lan
 *@Date 2020/10/26 9:36
 **/
public interface plStepCostService {
    /**
     * 查询全部生产环节原料消耗
     * @return
     */
    List<plStepCost> selectplStepCostList();

    /**
     * 通过id查询生产环节原料消耗
     * @param id
     * @return
     */
    plStepCost selectplStepCostById(Integer id);

    /**
     * 通过指定参数查询生产环节原料消耗
     * @param plStepCost
     * @return
     */
    List<plStepCost> selectplStepCostByParameter(plStepCost plStepCost);
}
