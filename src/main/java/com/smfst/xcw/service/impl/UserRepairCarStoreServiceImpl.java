package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserRepairCarStoreMapper;
import com.smfst.xcw.model.UserRepairCarStore;
import com.smfst.xcw.service.UserRepairCarStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserRepairCarStoreServiceImpl
 * @Author lan
 * @Date 2020/11/4 23:15
 **/
@Service
public class UserRepairCarStoreServiceImpl implements UserRepairCarStoreService {


    @Autowired
    private UserRepairCarStoreMapper userRepairCarStoreMapper;

    @Override
    public List<UserRepairCarStore> selectUserRepairCarStoreList() {
        return userRepairCarStoreMapper.selectUserRepairCarStoreList();
    }

    @Override
    public UserRepairCarStore selectUserRepairCarStoreById(Integer id) {
        return userRepairCarStoreMapper.selectUserRepairCarStoreById(id);
    }

    @Override
    public List<UserRepairCarStore> selectUserRepairCarStoreByParameter(UserRepairCarStore userInPriceLog) {
        return userRepairCarStoreMapper.selectUserRepairCarStoreByParameter(userInPriceLog);
    }

    @Override
    public void createUserRepairCarStore(UserRepairCarStore userInPriceLog) {
        userRepairCarStoreMapper.createUserRepairCarStore(userInPriceLog);
    }

    @Override
    public void updateUserRepairCarStore(UserRepairCarStore userInPriceLog) {
        userRepairCarStoreMapper.updateUserRepairCarStore(userInPriceLog);
    }

    @Override
    public void deletUserRepairCarStore(UserRepairCarStore userInPriceLog) {
        userRepairCarStoreMapper.deletUserRepairCarStore(userInPriceLog);
    }
}
