package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.mapper.plStepCostMapper;
import com.smfst.xcw.model.plStepCost;
import com.smfst.xcw.service.plStepCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName plStepCostServiceImpl
 *@Author lan
 *@Date 2020/10/26 9:36
 **/
@Service
public class plStepCostServiceImpl implements plStepCostService {

    @Autowired
    private plStepCostMapper plStepCostMapper;

    @Override
    public List<plStepCost> selectplStepCostList() {
        return plStepCostMapper.selectplStepCostList();
    }

    @Override
    public plStepCost selectplStepCostById(Integer id) {
        return plStepCostMapper.selectplStepCostById(id);
    }

    @Override
    public  List<plStepCost> selectplStepCostByParameter(plStepCost plStepCost) {
        return plStepCostMapper.selectplStepCostByParameter(plStepCost);
    }
}
