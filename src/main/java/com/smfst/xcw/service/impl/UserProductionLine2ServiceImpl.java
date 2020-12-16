package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.CarInfoMapper;
import com.smfst.xcw.mapper.UserProductionLine2Mapper;
import com.smfst.xcw.model.CarInfo;
import com.smfst.xcw.model.UserProductionLine2;
import com.smfst.xcw.service.CarInfoService;
import com.smfst.xcw.service.UserProductionLine2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @quthor tyx 2020/11/25
 */
@Service
public class UserProductionLine2ServiceImpl implements UserProductionLine2Service {
    @Autowired
    private UserProductionLine2Mapper userProductionLine2Mapper;
    @Override
    public List<UserProductionLine2> selectUserProductionLineList() {
        return userProductionLine2Mapper.selectUserProductionLineList();
    }
}
