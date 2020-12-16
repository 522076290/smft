package com.smfst.xcw.service;

import com.smfst.xcw.model.UserNormalCarLog;

import java.util.List;

/**
 * @ClassName UserNormalCarLogService
 * @Author lan
 * @Date 2020/11/5 0:22
 **/
public interface UserNormalCarLogService {
    /**
     * 查询全部正常车辆出厂日志
     * @return
     */
    List<UserNormalCarLog> selectUserNormalCarLogList();

    /**
     * 通过id查询正常车辆出厂日志
     * @param id
     * @return
     */
    UserNormalCarLog selectUserNormalCarLogById(Integer id);

    /**
     * 通过指定参数查询正常车辆出厂日志
     * @param userInPriceLog
     * @return
     */
    List<UserNormalCarLog> selectUserNormalCarLogByParameter(UserNormalCarLog userInPriceLog);

    /**
     * 新增正常车辆出厂日志
     * @param userInPriceLog
     * @return
     */
    void createUserNormalCarLog(UserNormalCarLog userInPriceLog);


    /**
     * 更新正常车辆出厂日志
     * @param userInPriceLog
     * @return
     */
    void updateUserNormalCarLog (UserNormalCarLog userInPriceLog);


    /**
     * 删除正常车辆出厂日志
     * @param userInPriceLog
     * @return
     */
    void deletUserNormalCarLog (UserNormalCarLog userInPriceLog);
}
