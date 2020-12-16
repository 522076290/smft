package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/14
 */

import com.smfst.xcw.mapper.ProductionLineMapper;
import com.smfst.xcw.model.ProductionLine;
import com.smfst.xcw.service.ProductionLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName ProductionLineServiceImpl
 *@Author lan
 *@Date 2020/10/14 16:22
 **/
@Service
public class ProductionLineServiceImpl implements ProductionLineService {

    @Autowired
    ProductionLineMapper productionLineMapper;

    @Override
    public List<ProductionLine> selectProductionLineList() {
        return productionLineMapper.selectProductionLineList();
    }

    @Override
    public ProductionLine selectProductionLineById(Integer id) {
        return productionLineMapper.selectProductionLineById(id);
    }

    @Override
    public List<ProductionLine> selectProductionLineByParameter(ProductionLine productionLine) {
        return productionLineMapper.selectProductionLineByParameter(productionLine);
    }
}
