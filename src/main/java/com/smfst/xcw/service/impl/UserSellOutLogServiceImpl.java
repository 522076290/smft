package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserSellOutLogMapper;
import com.smfst.xcw.model.UserSellOutLog;
import com.smfst.xcw.service.UserSellOutLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserSellOutLogServiceImpl
 * @Author lan
 * @Date 2020/11/7 15:35
 **/
@Service
public class UserSellOutLogServiceImpl implements UserSellOutLogService {


    @Autowired
    private UserSellOutLogMapper userSellOutLogMapper;

    @Override
    public List<UserSellOutLog> selectUserSellOutLogList() {
        return userSellOutLogMapper.selectList();
    }

    @Override
    public UserSellOutLog selectUserSellOutLogById(Long id) {
        return userSellOutLogMapper.selectById(id);
    }

    @Override
    public List<UserSellOutLog> selectUserSellOutLogByParameter(UserSellOutLog userSellOutLog) {
        return userSellOutLogMapper.selectByPartment(userSellOutLog);
    }

    @Override
    public void createUserSellOutLog(UserSellOutLog userSellOutLog) {
        userSellOutLogMapper.insert(userSellOutLog);
    }

    @Override
    public void updateUserSellOutLog(UserSellOutLog userSellOutLog) {
        userSellOutLogMapper.update(userSellOutLog);
    }

    @Override
    public void deletUserSellOutLog(UserSellOutLog userSellOutLog) {
        userSellOutLogMapper.deleteById(userSellOutLog.getId());
    }
}
