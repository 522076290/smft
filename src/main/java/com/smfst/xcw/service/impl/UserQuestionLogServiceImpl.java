package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserQuestionLogMapper;
import com.smfst.xcw.model.UserQuestionLog;
import com.smfst.xcw.service.UserQuestionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserQuestionLogServiceImpl
 * @Author lan
 * @Date 2020/11/7 11:43
 **/
@Service
public class UserQuestionLogServiceImpl implements UserQuestionLogService {

    @Autowired
    private UserQuestionLogMapper userQuestionLogMapper;

    @Override
    public List<UserQuestionLog> selectUserQuestionLogList() {
        return userQuestionLogMapper.selectList();
    }

    @Override
    public UserQuestionLog selectUserQuestionLogById(Long id) {
        return userQuestionLogMapper.selectById(id);
    }

    @Override
    public List<UserQuestionLog> selectUserQuestionLogByParameter(UserQuestionLog userQuestion) {
        return userQuestionLogMapper.selectByPartment(userQuestion);
    }

    @Override
    public void createUserQuestionLog(UserQuestionLog userQuestion) {
        userQuestionLogMapper.insert(userQuestion);
    }

    @Override
    public void updateUserQuestionLog(UserQuestionLog userQuestion) {
        userQuestionLogMapper.update(userQuestion);
    }

    @Override
    public void deletUserQuestionLog(UserQuestionLog userQuestion) {
        userQuestionLogMapper.deleteById(userQuestion.getId());
    }
}
