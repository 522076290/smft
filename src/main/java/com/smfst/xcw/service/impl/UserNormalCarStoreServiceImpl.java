package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserNormalCarStoreMapper;
import com.smfst.xcw.model.UserNormalCarStore;
import com.smfst.xcw.service.UserNormalCarStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserNormalCarStoreServiceImpl
 * @Author lan
 * @Date 2020/11/4 17:31
 **/

@Service
public class UserNormalCarStoreServiceImpl implements UserNormalCarStoreService {

    @Autowired
    UserNormalCarStoreMapper userNormalCarStoreMapper;

    @Override
    public List<UserNormalCarStore> selectUserNormalCarStoreList() {
        return userNormalCarStoreMapper.selectUserNormalCarStoreList();
    }

    @Override
    public UserNormalCarStore selectUserNormalCarStoreById(Integer id) {
        return userNormalCarStoreMapper.selectUserNormalCarStoreById(id);
    }

    @Override
    public List<UserNormalCarStore> selectUserNormalCarStoreByParameter(UserNormalCarStore userInPriceLog) {
        return userNormalCarStoreMapper.selectUserNormalCarStoreByParameter(userInPriceLog);
    }

    @Override
    public void createUserNormalCarStore(UserNormalCarStore userInPriceLog) {
        userNormalCarStoreMapper.createUserNormalCarStore(userInPriceLog);
    }

    @Override
    public void updateUserNormalCarStore(UserNormalCarStore userInPriceLog) {
        userNormalCarStoreMapper.updateUserNormalCarStore(userInPriceLog);
    }

    @Override
    public void deletUserNormalCarStore(UserNormalCarStore userInPriceLog) {
        userNormalCarStoreMapper.deletUserNormalCarStore(userInPriceLog);
    }
}
