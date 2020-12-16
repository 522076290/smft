package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserPlStep2Mapper;
import com.smfst.xcw.model.UserPlStep2;
import com.smfst.xcw.service.UserPlStep2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserPlStep2ServiceImpl implements UserPlStep2Service {
    @Autowired
    private UserPlStep2Mapper userPlStep2Mapper;
    @Override
    public List<UserPlStep2> selectUserPlStep2List(Integer id) {
        return userPlStep2Mapper.selectUserPlStep2List(id);
    }
}
