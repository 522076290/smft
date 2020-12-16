package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserPeopleMapper;
import com.smfst.xcw.model.UserPeople;
import com.smfst.xcw.service.UserPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserPeopleServiceimpl
 * @Author lan
 * @Date 2020/11/5 22:55
 **/


@Service
public class UserPeopleServiceImpl implements UserPeopleService {
    @Autowired
    private UserPeopleMapper userPeopleMapper;

    @Override
    public List<UserPeople> selectUserPeopleList() {
        return userPeopleMapper.selectList();
    }

    @Override
    public UserPeople selectUserPeopleById(Long id) {
        return userPeopleMapper.selectById(id);
    }

    @Override
    public List<UserPeople> selectUserPeopleByParameter(UserPeople userInPriceLog) {
        return userPeopleMapper.selectByPartment(userInPriceLog);
    }

    @Override
    public void createUserPeople(UserPeople userInPriceLog) {
        userPeopleMapper.insert(userInPriceLog);
    }

    @Override
    public void updateUserPeople(UserPeople userInPriceLog) {
        userPeopleMapper.update(userInPriceLog);
    }

    @Override
    public void deletUserPeople(UserPeople userInPriceLog) {
        userPeopleMapper.deleteById(userInPriceLog.getId());
    }
}
