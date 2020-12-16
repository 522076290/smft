package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/14
 */

import com.smfst.xcw.model.ProductionLineInfo;

import java.util.List;

/**
 *@ClassName ProductionLineInfoService
 *@Author lan
 *@Date 2020/10/14 16:55
 **/
public interface ProductionLineInfoService {
    /**
     * 查询全部生产线信息
     * @return
     */
    List<ProductionLineInfo> selectProductionLineInfoList();


    /**
     * 通过id查询生产线信息
     * @param id
     * @return
     */
    ProductionLineInfo selectProductionLineInfoById(Integer id);

    /**
     * 通过指定参数查询生产线信息
     * @param productionLineInfo
     * @return
     */
    List<ProductionLineInfo> selectProductionLineInfoByParameter(ProductionLineInfo productionLineInfo);
}
