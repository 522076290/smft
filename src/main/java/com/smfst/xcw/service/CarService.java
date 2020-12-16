package com.smfst.xcw.service;

import com.smfst.xcw.model.Car;

import java.util.List;

public interface CarService {

    /**
     * 查询全部车辆
     *  @return List<Admin>
     * */
    List<Car> selectCarList();

    /**
     * 通过id查询车辆
     * @param id
     * @return Admin
     */
    Car selectCarById(Integer id);

    /**
     * 通过指定参数查询车辆
     * @param car
     * @return Admin
     */
    List<Car> selectCarByParameter(Car car);
}
