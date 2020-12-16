package com.smfst.xcw.mapper;

import com.smfst.xcw.model.CarInfo;

import java.util.List;

/**
 * @quthor lan 2020/10/11
 */
public interface CarInfoMapper {
    /**
     * 查询查询全部车辆
     * @return
     */
    List<CarInfo> selectCarInfoList();


    /**
     * 通过id查询车辆信息
     * @param id
     * @return
     */
    CarInfo selectCarInfoById(Integer id);

    /**
     * 通过指定参数查询车辆
     * @param carInfo
     * @return
     */
    List<CarInfo> selectCarInfoByParameter(CarInfo carInfo);

}
