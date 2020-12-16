package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.mapper.UserInPriceLogMapper;
import com.smfst.xcw.model.UserInPriceLog;
import com.smfst.xcw.service.UserInPriceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserInPriceLogServiceImpl
 *@Author lan
 *@Date 2020/10/26 9:57
 **/
@Service
public class UserInPriceLogServiceImpl implements UserInPriceLogService {

    @Autowired
    private UserInPriceLogMapper userInPriceLogMapper;

    @Override
    public List<UserInPriceLog> selectUserInPriceLogList() {
        return userInPriceLogMapper.selectUserInPriceLogList();
    }

    @Override
    public UserInPriceLog selectUserInPriceLogById(Integer id) {
        return userInPriceLogMapper.selectUserInPriceLogById(id);
    }

    @Override
    public List<UserInPriceLog> selectUserInPriceLogByParameter(UserInPriceLog userInPriceLog) {
        return userInPriceLogMapper.selectUserInPriceLogByParameter(userInPriceLog);
    }

    @Override
    public void createUserInPriceLog(UserInPriceLog userInPriceLog) {
        userInPriceLogMapper.createUserInPriceLog(userInPriceLog);
    }

    @Override
    public void updateUserInPriceLog(UserInPriceLog userInPriceLog) {
        userInPriceLogMapper.updateUserInPriceLog(userInPriceLog);
    }

    @Override
    public void deletUserInPriceLog(UserInPriceLog userInPriceLog) {
        userInPriceLogMapper.deletUserInPriceLog(userInPriceLog);
    }
}
