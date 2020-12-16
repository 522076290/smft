package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.mapper.UserOutPriceLogMapper;
import com.smfst.xcw.model.UserOutPriceLog;
import com.smfst.xcw.service.UserOutPriceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserOutPriceLogService
 *@Author lan
 *@Date 2020/10/26 11:41
 **/
@Service
public class UserOutPriceLogServiceImpl implements UserOutPriceLogService {
    @Autowired
    private UserOutPriceLogMapper UserOutPriceLogMapper;


    @Override
    public List<UserOutPriceLog> selectUserOutPriceLogList() {
        return UserOutPriceLogMapper.selectUserOutPriceLogList();
    }

    @Override
    public UserOutPriceLog selectUserOutPriceLogById(Integer id) {
        return UserOutPriceLogMapper.selectUserOutPriceLogById(id);
    }

    @Override
    public List<UserOutPriceLog> selectUserOutPriceLogByParameter(UserOutPriceLog userOutPriceLog) {
        return UserOutPriceLogMapper.selectUserOutPriceLogByParameter(userOutPriceLog);
    }

    @Override
    public void createUserOutPriceLog(UserOutPriceLog userOutPriceLog) {
        UserOutPriceLogMapper.createUserOutPriceLog(userOutPriceLog);
    }

    @Override
    public void updateUserOutPriceLog(UserOutPriceLog userOutPriceLog) {
        UserOutPriceLogMapper.updateUserOutPriceLog(userOutPriceLog);
    }

    @Override
    public void deletUserOutPriceLog(UserOutPriceLog userOutPriceLog) {
        UserOutPriceLogMapper.deletUserOutPriceLog(userOutPriceLog);
    }
}
