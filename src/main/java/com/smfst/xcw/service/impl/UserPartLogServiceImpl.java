package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/28
 */

import com.smfst.xcw.mapper.UserPartLogMapper;
import com.smfst.xcw.model.UserPartLog;
import com.smfst.xcw.service.UserPartLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserPartLogServiceImpl
 *@Author lan
 *@Date 2020/10/28 9:30
 **/
@Service
public class UserPartLogServiceImpl implements UserPartLogService {

    @Autowired
    private UserPartLogMapper userPartLogMapper;

    @Override
    public List<UserPartLog> selectUserPartLogList() {
        return userPartLogMapper.selectUserPartLogList();
    }

    @Override
    public UserPartLog selectUserPartLogById(Integer id) {
        return userPartLogMapper.selectUserPartLogById(id);
    }

    @Override
    public List<UserPartLog> selectUserPartLogByParameter(UserPartLog userPartLog) {
        return userPartLogMapper.selectUserPartLogByParameter(userPartLog);
    }

    @Override
    public void createUserPartLog(UserPartLog userPartLog) {
        userPartLogMapper.createUserPartLog(userPartLog);
    }

    @Override
    public void updateUserPartLog(UserPartLog userPartLog) {
        userPartLogMapper.updateUserPartLog(userPartLog);
    }

    @Override
    public void deletUserPartLog(UserPartLog userPartLog) {
        userPartLogMapper.deletUserPartLog(userPartLog);
    }
}
