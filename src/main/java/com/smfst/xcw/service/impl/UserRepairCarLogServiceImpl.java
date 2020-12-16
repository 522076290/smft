package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserRepairCarLogMapper;
import com.smfst.xcw.model.UserRepairCarLog;
import com.smfst.xcw.service.UserRepairCarLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserRepairCarLogServiceImpl
 * @Author lan
 * @Date 2020/11/5 11:32
 **/
@Service
public class UserRepairCarLogServiceImpl implements UserRepairCarLogService {


    @Autowired
    private UserRepairCarLogMapper userRepairCarLogMapper;


    @Override
    public List<UserRepairCarLog> selectUserRepairCarLogList() {
        return userRepairCarLogMapper.selectList();
    }

    @Override
    public UserRepairCarLog selectUserRepairCarLogById(Long id) {
        return userRepairCarLogMapper.selectById(id);
    }

    @Override
    public List<UserRepairCarLog> selectUserRepairCarLogByParameter(UserRepairCarLog userInPriceLog) {
        return userRepairCarLogMapper.selectByPartment(userInPriceLog);
    }

    @Override
    public void createUserRepairCarLog(UserRepairCarLog userInPriceLog) {
        userRepairCarLogMapper.insert(userInPriceLog);
    }

    @Override
    public void updateUserRepairCarLog(UserRepairCarLog userInPriceLog) {
        userRepairCarLogMapper.update(userInPriceLog);
    }

    @Override
    public void deletUserRepairCarLog(UserRepairCarLog userInPriceLog) {
        userRepairCarLogMapper.deleteById(userInPriceLog.getId());
    }
}
