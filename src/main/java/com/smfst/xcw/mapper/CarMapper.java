package com.smfst.xcw.mapper;

import com.smfst.xcw.model.Car;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface CarMapper {

    /**
     * 查询查询全部车辆
     * @return
     */
    List<Car> selectCarList();

    /**
     * 通过id查询车辆
     * @param id
     * @return
     */
    Car selectCarById(Integer id);

    /**
     * 通过指定参数查询车辆
     * @param car
     * @return
     */
    List<Car> selectCarByParameter(Car car);
}
