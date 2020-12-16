package com.smfst.xcw.service;

import com.smfst.xcw.model.CarInfo;

import java.util.List;

/**
 * @quthor lan 2020/10/11
 */
public interface CarInfoService {

    /**
     * 查询全部车辆信息
     *  @return List<Admin>
     * */
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
     * @return Admin
     */
    List<CarInfo> selectCarInfoByParameter(CarInfo carInfo);
}
