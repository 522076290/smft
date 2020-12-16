package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/14
 */

import com.smfst.xcw.model.ProductionLine;

import java.util.List;

/**
 *@ClassName ProductionLineService
 *@Author lan
 *@Date 2020/10/14 16:22
 **/
public interface ProductionLineService {
    /**
     * 查询查询全部生产线
     * @return
     */
    List<ProductionLine> selectProductionLineList();


    /**
     * 通过id查询生产线信息
     * @param id
     * @return
     */
    ProductionLine selectProductionLineById(Integer id);

    /**
     * 通过指定参数查询生产线
     * @param productionLine
     * @return
     */
    List<ProductionLine> selectProductionLineByParameter(ProductionLine productionLine);
}
