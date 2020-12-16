package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.mapper.UserWorkMapper;
import com.smfst.xcw.model.UserWork;
import com.smfst.xcw.service.UserWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserWorkServiceImpl
 *@Author lan
 *@Date 2020/10/23 15:28
 **/
@Service
public class UserWorkServiceImpl implements UserWorkService {
    @Autowired
    private UserWorkMapper userWorkMapper;


    @Override
    public List<UserWork> selectUserWorkList() {
        return userWorkMapper.selectUserWorkList();
    }

    @Override
    public UserWork selectUserWorkById(Integer id) {
        return userWorkMapper.selectUserWorkById(id);
    }

    @Override
    public List<UserWork> selectUserWorkByParameter(UserWork userWork) {
        return userWorkMapper.selectUserWorkByParameter(userWork);
    }

    @Override
    public void updateUserWork(UserWork userWork) {
        userWorkMapper.updateUserWork(userWork);
    }
}
