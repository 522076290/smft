package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/27
 */

import com.smfst.xcw.mapper.UserPlStepInfoMapper;
import com.smfst.xcw.model.UserPlStepInfo;
import com.smfst.xcw.service.UserPlStepInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserPlStepInfoServiceImpl
 *@Author lan
 *@Date 2020/10/27 10:01
 **/
@Service
public class UserPlStepInfoServiceImpl implements UserPlStepInfoService {

    @Autowired
    private UserPlStepInfoMapper userPIStepInfoMapper;


    @Override
    public List<UserPlStepInfo> selectUserPlStepInfoList() {
        return userPIStepInfoMapper.selectList();
    }


    @Override
    public UserPlStepInfo selectUserPlStepInfoById(Long id) {
        return userPIStepInfoMapper.selectById(id);
    }

    @Override
    public List<UserPlStepInfo> selectUserPlStepInfoByParameter(UserPlStepInfo userPIStepInfo) {
        return userPIStepInfoMapper.selectByPartment(userPIStepInfo);
    }

    @Override
    public void createUserPlStepInfo(UserPlStepInfo userPIStepInfo) {
        userPIStepInfoMapper.insert(userPIStepInfo);
    }

    @Override
    public void updateUserPlStepInfo(UserPlStepInfo userPIStepInfo) {
        userPIStepInfoMapper.update(userPIStepInfo);
    }

    @Override
    public void deletUserPlStepInfo(UserPlStepInfo userPIStepInfo) {
        userPIStepInfoMapper.deleteById(userPIStepInfo.getId());
    }
}
