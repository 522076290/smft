package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/28
 */

import com.smfst.xcw.mapper.UserPartPurchaseLogMapper;
import com.smfst.xcw.model.UserPartPurchaseLog;
import com.smfst.xcw.service.UserPartPurchaseLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserPartPurchaseLogServiceImpl
 *@Author lan
 *@Date 2020/10/28 10:13
 **/
@Service
public class UserPartPurchaseLogServiceImpl implements UserPartPurchaseLogService {

    @Autowired
    private UserPartPurchaseLogMapper userPartPurchaseLogMapper;

    @Override
    public List<UserPartPurchaseLog> selectUserPartPurchaseLogList() {
        return userPartPurchaseLogMapper.selectUserPartPurchaseLogList();
    }

    @Override
    public UserPartPurchaseLog selectUserPartPurchaseLogById(Integer id) {
        return userPartPurchaseLogMapper.selectUserPartPurchaseLogById(id);
    }

    @Override
    public List<UserPartPurchaseLog> selectUserPartPurchaseLogByParameter(UserPartPurchaseLog userPartPurchaseLog) {
        return userPartPurchaseLogMapper.selectUserPartPurchaseLogByParameter(userPartPurchaseLog);
    }

    @Override
    public void createUserPartPurchaseLog(UserPartPurchaseLog userPartPurchaseLog) {
        userPartPurchaseLogMapper.createUserPartPurchaseLog(userPartPurchaseLog);
    }

    @Override
    public void updateUserPartPurchaseLog(UserPartPurchaseLog userPartPurchaseLog) {
        userPartPurchaseLogMapper.updateUserPartPurchaseLog(userPartPurchaseLog);
    }

    @Override
    public void deletUserPartPurchaseLog(UserPartPurchaseLog userPartPurchaseLog) {
        userPartPurchaseLogMapper.deletUserPartPurchaseLog(userPartPurchaseLog);
    }
}
