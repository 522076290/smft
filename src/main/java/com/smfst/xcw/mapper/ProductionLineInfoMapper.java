package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/14
 */

import com.smfst.xcw.model.ProductionLineInfo;

import java.util.List;

/**
 *@ClassName ProductionLineInfoMapper
 *@Author lan
 *@Date 2020/10/14 16:51
 **/
public interface ProductionLineInfoMapper {
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
