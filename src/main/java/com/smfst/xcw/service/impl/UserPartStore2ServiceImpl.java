package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserPartStore2Mapper;
import com.smfst.xcw.mapper.UserParts2Mapper;
import com.smfst.xcw.model.UserPartStore2;
import com.smfst.xcw.model.UserParts2;
import com.smfst.xcw.service.UserPart2Service;
import com.smfst.xcw.service.UserPartStore2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPartStore2ServiceImpl implements UserPartStore2Service {
    @Autowired
    private UserPartStore2Mapper userPartStore2Mapper;


    @Override
    public List<UserPartStore2> selectUserPartStore2List() {
        return userPartStore2Mapper.selectUserPartStore2List();
    }
}
