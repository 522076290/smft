package com.smfst.xcw.service;

import com.smfst.xcw.model.UserRepairCarLog;

import java.util.List;

/**
 * @ClassName UserRepairCarLogService
 * @Author lan
 * @Date 2020/11/5 11:31
 **/
public interface UserRepairCarLogService {

    /**
     * 查询全部维修车辆出厂日志
     * @return
     */
    List<UserRepairCarLog> selectUserRepairCarLogList();

    /**
     * 通过id查询维修车辆出厂日志
     * @param id
     * @return
     */
    UserRepairCarLog selectUserRepairCarLogById(Long id);

    /**
     * 通过指定参数查询维修车辆出厂日志
     * @param userInPriceLog
     * @return
     */
    List<UserRepairCarLog> selectUserRepairCarLogByParameter(UserRepairCarLog userInPriceLog);

    /**
     * 新增维修车辆出厂日志
     * @param userInPriceLog
     * @return
     */
    void createUserRepairCarLog(UserRepairCarLog userInPriceLog);


    /**
     * 更新维修车辆出厂日志
     * @param userInPriceLog
     * @return
     */
    void updateUserRepairCarLog (UserRepairCarLog userInPriceLog);


    /**
     * 删除维修车辆出厂日志
     * @param userInPriceLog
     * @return
     */
    void deletUserRepairCarLog (UserRepairCarLog userInPriceLog);
    
}
