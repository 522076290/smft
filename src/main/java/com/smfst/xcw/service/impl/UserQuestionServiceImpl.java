package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserQuestionMapper;
import com.smfst.xcw.model.UserQuestion;
import com.smfst.xcw.service.UserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserQuestionServiceImpl
 * @Author lan
 * @Date 2020/11/7 11:14
 **/
@Service
public class UserQuestionServiceImpl implements UserQuestionService{

    @Autowired
    private UserQuestionMapper userQuestionMapper;

    @Override
    public List<UserQuestion> selectUserQuestionList() {
        return userQuestionMapper.selectList();
    }

    @Override
    public UserQuestion selectUserQuestionById(Long id) {
        return userQuestionMapper.selectById(id);
    }

    @Override
    public List<UserQuestion> selectUserQuestionByParameter(UserQuestion userQuestion) {
        return userQuestionMapper.selectByPartment(userQuestion);
    }

    @Override
    public void createUserQuestion(UserQuestion userQuestion) {
        userQuestionMapper.insert(userQuestion);
    }

    @Override
    public void updateUserQuestion(UserQuestion userQuestion) {
        userQuestionMapper.update(userQuestion);
    }

    @Override
    public void deletUserQuestion(UserQuestion userQuestion) {
        userQuestionMapper.deleteById(userQuestion.getId());
    }
}
