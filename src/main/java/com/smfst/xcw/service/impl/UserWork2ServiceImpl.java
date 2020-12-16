package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserWork2Mapper;
import com.smfst.xcw.model.UserWork2;
import com.smfst.xcw.service.UserWork2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserWork2ServiceImpl implements UserWork2Service {
    @Autowired
    private UserWork2Mapper userWork2Mapper;
    @Override
    public List<UserWork2> selectUserWorkList() {
        return userWork2Mapper.selectUserWorkList();
    }

    @Override
    public UserWork2 selectUserWorkById(Integer id) {
        return userWork2Mapper.selectUserWorkById(id);
    }
}
