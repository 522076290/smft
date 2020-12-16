package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserAppointmentMapper;
import com.smfst.xcw.model.UserAppointment;
import com.smfst.xcw.service.UserAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserAppointmentService
 * @Author lan
 * @Date 2020/11/7 15:51
 **/
@Service
public class UserAppointmentServiceImpl implements UserAppointmentService {

    @Autowired
    private UserAppointmentMapper userAppointmentMapper;

    @Override
    public List<UserAppointment> selectUserAppointmentList() {
        return userAppointmentMapper.selectList();
    }

    @Override
    public UserAppointment selectUserAppointmentById(Long id) {
        return userAppointmentMapper.selectById(id);
    }

    @Override
    public List<UserAppointment> selectUserAppointmentByParameter(UserAppointment userAppointment) {
        return userAppointmentMapper.selectByPartment(userAppointment);
    }

    @Override
    public void createUserAppointment(UserAppointment userAppointment) {
        userAppointmentMapper.insert(userAppointment);
    }

    @Override
    public void updateUserAppointment(UserAppointment userAppointment) {
        userAppointmentMapper.update(userAppointment);
    }

    @Override
    public void deletUserAppointment(UserAppointment userAppointment) {
        userAppointmentMapper.deleteById(userAppointment.getId());
    }




}
