package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.mapper.UserPlStepMapper;
import com.smfst.xcw.model.UserPlStep;
import com.smfst.xcw.service.UserPlStepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserPIStepServiceImpl
 *@Author lan
 *@Date 2020/10/26 16:50
 **/
@Service
public class UserPIStepServiceImpl implements UserPlStepService {

    @Autowired
    private UserPlStepMapper userPlStepMapper;

    @Override
    public List<UserPlStep> selectUserPlStepList() {
        return userPlStepMapper.selectList();
    }

    @Override
    public UserPlStep selectUserPlStepById(Long id) {
        return userPlStepMapper.selectById(id);
    }

    @Override
    public List<UserPlStep> selecUserPlStepByParameter(UserPlStep userPIStep) {
        return userPlStepMapper.selectByPartment(userPIStep);
    }

    @Override
    public void createUserPlStep(UserPlStep userPIStep) {
        userPlStepMapper.insert(userPIStep);
    }

    @Override
    public void updateUserPlStep(UserPlStep userPIStep) {
        userPlStepMapper.update(userPIStep);
    }

    @Override
    public void deletUserPlStep(UserPlStep userPIStep) {
        userPlStepMapper.deleteById(userPIStep.getId());
    }
}
