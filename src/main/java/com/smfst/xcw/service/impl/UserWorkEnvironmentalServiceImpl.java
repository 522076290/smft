package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/23
 */


import com.smfst.xcw.mapper.UserWorkEnvironmentalMapper;
import com.smfst.xcw.model.UserWorkEnvironmental;
import com.smfst.xcw.service.UserWorkEnvironmentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserWorkEnvironmentalServiceImpl
 *@Author lan
 *@Date 2020/10/23 17:20
 **/
@Service
public class UserWorkEnvironmentalServiceImpl implements UserWorkEnvironmentalService {

    @Autowired
    private UserWorkEnvironmentalMapper userWorkEnvironmentalMapper;


    @Override
    public List<UserWorkEnvironmental> selectUserWorkEnvironmentalList() {
        return userWorkEnvironmentalMapper.selectUserWorkEnvironmentalList();
    }

    @Override
    public UserWorkEnvironmental selectUserWorkEnvironmentalById(Integer id) {
        return userWorkEnvironmentalMapper.selectUserWorkEnvironmentalById(id);
    }

    @Override
    public List<UserWorkEnvironmental> selectUserWorkEnvironmentalByParameter(UserWorkEnvironmental userWorkEnvironmental) {
        return userWorkEnvironmentalMapper.selectUserWorkEnvironmentalByParameter(userWorkEnvironmental);
    }

    @Override
    public void updateUserWorkEnvironmental(UserWorkEnvironmental userWorkEnvironmental) {
        userWorkEnvironmentalMapper.updateUserWorkEnvironmental(userWorkEnvironmental);
    }
}
