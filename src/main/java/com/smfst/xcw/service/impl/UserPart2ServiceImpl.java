package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserParts2Mapper;
import com.smfst.xcw.model.UserParts2;
import com.smfst.xcw.service.UserPart2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPart2ServiceImpl implements UserPart2Service {
    @Autowired
    private UserParts2Mapper userParts2Mapper;
    @Override
    public List<UserParts2> selectUserParts2List() {
        return userParts2Mapper.selectUserParts2List();
    }
}
