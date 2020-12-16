package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.CarInfoMapper;
import com.smfst.xcw.model.CarInfo;
import com.smfst.xcw.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @quthor lan 2020/10/11
 */
@Service
public class CarInfoServiceImpl implements CarInfoService {
    @Autowired
    private CarInfoMapper carInfoMapper;

    @Override
    public List<CarInfo> selectCarInfoList() {
        return carInfoMapper.selectCarInfoList();
    }

    @Override
    public CarInfo selectCarInfoById(Integer id) {
        return carInfoMapper.selectCarInfoById(id);
    }

    @Override
    public List<CarInfo> selectCarInfoByParameter(CarInfo carInfo) {
        return carInfoMapper.selectCarInfoByParameter(carInfo);
    }
}
