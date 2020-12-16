package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/27
 */

import com.smfst.xcw.mapper.UserPartsMapper;
import com.smfst.xcw.model.UserParts;
import com.smfst.xcw.service.UserPartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserPartsServiceImpl
 *@Author lan
 *@Date 2020/10/27 17:36
 **/
@Service
public class UserPartsServiceImpl implements UserPartsService {

    @Autowired
    private UserPartsMapper userPartsMapper;

    @Override
    public List<UserParts> selectUserPartsList() {
        return userPartsMapper.selectUserPartsList();
    }

    @Override
    public UserParts selectUserPartsById(Integer id) {
        return userPartsMapper.selectUserPartsById(id);
    }

    @Override
    public List<UserParts> selectUserPartsByParameter(UserParts userParts) {
        return userPartsMapper.selectUserPartsByParameter(userParts);
    }

    @Override
    public void createUserParts(UserParts userParts) {
        userPartsMapper.createUserParts(userParts);
    }

    @Override
    public void updateUserParts(UserParts userParts) {
        userPartsMapper.updateUserParts(userParts);
    }

    @Override
    public void deletUserParts(UserParts userParts) {
        userPartsMapper.deletUserParts(userParts);
    }
}
