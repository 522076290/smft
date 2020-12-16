package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserPeopleLogMapper;
import com.smfst.xcw.model.UserPeopleLog;
import com.smfst.xcw.service.UserPeopleLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserPeopleLogLogServiceImpl
 * @Author lan
 * @Date 2020/11/5 23:50
 **/
@Service
public class UserPeopleLogServiceImpl implements UserPeopleLogService {
    @Autowired
    private UserPeopleLogMapper userPeopleLogMapper;

    @Override
    public List<UserPeopleLog> selectUserPeopleLogList() {
        return userPeopleLogMapper.selectList();
    }

    @Override
    public UserPeopleLog selectUserPeopleLogById(Long id) {
        return userPeopleLogMapper.selectById(id);
    }

    @Override
    public List<UserPeopleLog> selectUserPeopleLogByParameter(UserPeopleLog userInPriceLog) {
        return userPeopleLogMapper.selectByPartment(userInPriceLog);
    }

    @Override
    public void createUserPeopleLog(UserPeopleLog userInPriceLog) {
        userPeopleLogMapper.insert(userInPriceLog);
    }

    @Override
    public void updateUserPeopleLog(UserPeopleLog userInPriceLog) {
        userPeopleLogMapper.update(userInPriceLog);
    }

    @Override
    public void deletUserPeopleLog(UserPeopleLog userInPriceLog) {
        userPeopleLogMapper.deleteById(userInPriceLog.getId());
    }
}
