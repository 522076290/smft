package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/27
 */

import com.smfst.xcw.mapper.UserPartStoreMapper;
import com.smfst.xcw.model.UserPartStore;
import com.smfst.xcw.service.UserPartStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserPartStoreServiceImpl
 *@Author lan
 *@Date 2020/10/27 21:21
 **/
@Service
public class UserPartStoreServiceImpl implements UserPartStoreService {

    @Autowired
    private UserPartStoreMapper userPartStoreMapper;

    @Override
    public List<UserPartStore> selectUserPartStoreList() {
        return userPartStoreMapper.selectUserPartStoreList();
    }

    @Override
    public UserPartStore selectUserPartStoreById(Integer id) {
        return userPartStoreMapper.selectUserPartStoreById(id);
    }

    @Override
    public List<UserPartStore> selectUserPartStoreByParameter(UserPartStore userPartStore) {
        return userPartStoreMapper.selectUserPartStoreByParameter(userPartStore);
    }

    @Override
    public void createUserPartStore(UserPartStore userPartStore) {
        userPartStoreMapper.createUserPartStore(userPartStore);
    }

    @Override
    public void updateUserPartStore(UserPartStore userPartStore) {
        userPartStoreMapper.updateUserPartStore(userPartStore);
    }

    @Override
    public void deletUserPartStore(UserPartStore userPartStore) {
        userPartStoreMapper.deletUserPartStore(userPartStore);
    }
}
