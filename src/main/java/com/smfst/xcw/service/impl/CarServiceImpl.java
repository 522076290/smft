package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.CarMapper;
import com.smfst.xcw.model.Car;
import com.smfst.xcw.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarMapper carMapper;

    /**
     * 查询管理员列表
     * @return
     */
    @Override
    public List<Car> selectCarList() {
        return carMapper.selectCarList();
    }

    /**
     * 通过id查询车辆
     * @return
     */
    @Override
    public Car selectCarById(Integer id) {
        return carMapper.selectCarById(id);
    }


    /**
     * 通过指定参数查询车辆
     * @return
     */
    @Override
    public List<Car> selectCarByParameter(Car car) {
        return carMapper.selectCarByParameter(car);
    }
}
