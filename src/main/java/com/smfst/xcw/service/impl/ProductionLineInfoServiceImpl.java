package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/14
 */

import com.smfst.xcw.mapper.ProductionLineInfoMapper;
import com.smfst.xcw.model.ProductionLineInfo;
import com.smfst.xcw.service.ProductionLineInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName ProductionLineInfoServiceImpl
 *@Author lan
 *@Date 2020/10/14 16:55
 **/
@Service
public class ProductionLineInfoServiceImpl implements ProductionLineInfoService {

    @Autowired
    ProductionLineInfoMapper productionLineInfoMapper;

    @Override
    public List<ProductionLineInfo> selectProductionLineInfoList() {
        return productionLineInfoMapper.selectProductionLineInfoList();
    }

    @Override
    public ProductionLineInfo selectProductionLineInfoById(Integer id) {
        return productionLineInfoMapper.selectProductionLineInfoById(id);
    }

    @Override
    public List<ProductionLineInfo> selectProductionLineInfoByParameter(ProductionLineInfo productionLineInfo) {
        return productionLineInfoMapper.selectProductionLineInfoByParameter(productionLineInfo);
    }
}
