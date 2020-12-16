package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.UserInPriceLog;

import java.util.List;

/**
 *@ClassName UserInPriceLogMapper
 *@Author lan
 *@Date 2020/10/26 9:55
 **/
public interface UserInPriceLogMapper {

    /**
     * 查询全部学生金币收入日志
     * @return
     */
    List<UserInPriceLog> selectUserInPriceLogList();

    /**
     * 通过id查询学生金币收入日志
     * @param id
     * @return
     */
    UserInPriceLog selectUserInPriceLogById(Integer id);

    /**
     * 通过指定参数查询学生金币收入日志
     * @param userInPriceLog
     * @return
     */
    List<UserInPriceLog> selectUserInPriceLogByParameter(UserInPriceLog userInPriceLog);

    /**
     * 新增学生金币收入日志
     * @param userInPriceLog
     * @return
     */
    void createUserInPriceLog(UserInPriceLog userInPriceLog);


    /**
     * 更新学生金币收入日志
     * @param userInPriceLog
     * @return
     */
    void updateUserInPriceLog (UserInPriceLog userInPriceLog);


    /**
     * 删除学生金币收入日志
     * @param userInPriceLog
     * @return
     */
    void deletUserInPriceLog (UserInPriceLog userInPriceLog);
}
