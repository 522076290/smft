package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserNormalCarLogMapper;
import com.smfst.xcw.model.UserNormalCarLog;
import com.smfst.xcw.model.UserNormalCarStore;
import com.smfst.xcw.service.UserNormalCarLogService;
import com.smfst.xcw.service.UserNormalCarStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserNormalCarLogServiceImpl
 * @Author lan
 * @Date 2020/11/5 0:22
 **/
@Service
public class UserNormalCarLogServiceImpl implements UserNormalCarLogService {

    @Autowired
    private UserNormalCarLogMapper userNormalCarLogMapper;

    @Override
    public List<UserNormalCarLog> selectUserNormalCarLogList() {
        return userNormalCarLogMapper.selectUserNormalCarLogList();
    }

    @Override
    public UserNormalCarLog selectUserNormalCarLogById(Integer id) {
        return userNormalCarLogMapper.selectUserNormalCarLogById(id);
    }

    @Override
    public List<UserNormalCarLog> selectUserNormalCarLogByParameter(UserNormalCarLog userInPriceLog) {
        return userNormalCarLogMapper.selectUserNormalCarLogByParameter(userInPriceLog);
    }

    @Override
    public void createUserNormalCarLog(UserNormalCarLog userInPriceLog) {
        userNormalCarLogMapper.createUserNormalCarLog(userInPriceLog);
    }

    @Override
    public void updateUserNormalCarLog(UserNormalCarLog userInPriceLog) {
        userNormalCarLogMapper.updateUserNormalCarLog(userInPriceLog);
    }

    @Override
    public void deletUserNormalCarLog(UserNormalCarLog userInPriceLog) {
        userNormalCarLogMapper.deletUserNormalCarLog(userInPriceLog);
    }
}
