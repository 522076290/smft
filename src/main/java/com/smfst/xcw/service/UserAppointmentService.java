package com.smfst.xcw.service;

import com.smfst.xcw.model.UserAppointment;

import java.util.List;

/**
 * @ClassName UserAppointmentService
 * @Author lan
 * @Date 2020/11/7 15:51
 **/
public interface UserAppointmentService {
    /**
     * 查询全部学生卖出记录
     * @return
     */
    List<UserAppointment> selectUserAppointmentList();

    /**
     * 通过id查询学生卖出记录
     * @param id
     * @return
     */
    UserAppointment selectUserAppointmentById(Long id);

    /**
     * 通过指定参数查询学生卖出记录
     * @param userAppointment
     * @return
     */
    List<UserAppointment> selectUserAppointmentByParameter(UserAppointment userAppointment);

    /**
     * 新增学生卖出记录
     * @param userAppointment
     * @return
     */
    void createUserAppointment(UserAppointment userAppointment);


    /**
     * 更新学生卖出记录
     * @param userAppointment
     * @return
     */
    void updateUserAppointment (UserAppointment userAppointment);


    /**
     * 删除学生卖出记录
     * @param userAppointment
     * @return
     */
    void deletUserAppointment (UserAppointment userAppointment);
}
