package com.smfst.xcw.service;

import com.smfst.xcw.model.UserSellOutLog;

import java.util.List;

/**
 * @ClassName UserSellOutLogService
 * @Author lan
 * @Date 2020/11/7 15:34
 **/
public interface UserSellOutLogService {

    /**
     * 查询全部学生卖出记录
     * @return
     */
    List<UserSellOutLog> selectUserSellOutLogList();

    /**
     * 通过id查询学生卖出记录
     * @param id
     * @return
     */
    UserSellOutLog selectUserSellOutLogById(Long id);

    /**
     * 通过指定参数查询学生卖出记录
     * @param userSellOutLog
     * @return
     */
    List<UserSellOutLog> selectUserSellOutLogByParameter(UserSellOutLog userSellOutLog);

    /**
     * 新增学生卖出记录
     * @param userSellOutLog
     * @return
     */
    void createUserSellOutLog(UserSellOutLog userSellOutLog);


    /**
     * 更新学生卖出记录
     * @param userSellOutLog
     * @return
     */
    void updateUserSellOutLog (UserSellOutLog userSellOutLog);


    /**
     * 删除学生卖出记录
     * @param userSellOutLog
     * @return
     */
    void deletUserSellOutLog (UserSellOutLog userSellOutLog);
}
