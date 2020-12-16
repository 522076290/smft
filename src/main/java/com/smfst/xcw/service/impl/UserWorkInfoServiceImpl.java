package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.mapper.UserWorkInfoMapper;
import com.smfst.xcw.model.UserWorkInfo;
import com.smfst.xcw.service.UserWorkInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserWorkInfoServiceImpl
 *@Author lan
 *@Date 2020/10/23 16:19
 **/
@Service
public class UserWorkInfoServiceImpl implements UserWorkInfoService {

    @Autowired
    private UserWorkInfoMapper userWorkInfoMapper;

    @Override
    public List<UserWorkInfo> selectUserWorkInfoList() {
        return userWorkInfoMapper.selectUserWorkInfoList();
    }

    @Override
    public UserWorkInfo selectUserWorkInfoById(Integer id) {
        return userWorkInfoMapper.selectUserWorkInfoById(id);
    }

    @Override
    public  List<UserWorkInfo> selectUserWorkInfoByParameter(UserWorkInfo userWorkInfo) {
        return userWorkInfoMapper.selectUserWorkInfoByParameter(userWorkInfo);
    }

    @Override
    public void updateUserWorkInfo(UserWorkInfo userWorkInfo) {
        userWorkInfoMapper.updateUserWorkInfo(userWorkInfo);
    }
}
