package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.UserOutPriceLog;

import java.util.List;

/**
 *@ClassName UserOutPriceLogMapper
 *@Author lan
 *@Date 2020/10/26 11:37
 **/
public interface UserOutPriceLogMapper {

    /**
     * 查询全部学生金币支出日志
     * @return
     */
    List<UserOutPriceLog> selectUserOutPriceLogList();

    /**
     * 通过id查询学生金币支出日志
     * @param id
     * @return
     */
    UserOutPriceLog selectUserOutPriceLogById(Integer id);

    /**
     * 通过指定参数查询学生金币支出日志
     * @param userOutPriceLog
     * @return
     */
    List<UserOutPriceLog> selectUserOutPriceLogByParameter(UserOutPriceLog userOutPriceLog);

    /**
     * 新增学生金币支出日志
     * @param userOutPriceLog
     * @return
     */
    void createUserOutPriceLog(UserOutPriceLog userOutPriceLog);


    /**
     * 更新学生金币支出日志
     * @param userOutPriceLog
     * @return
     */
    void updateUserOutPriceLog (UserOutPriceLog userOutPriceLog);


    /**
     * 删除学生金币支出日志
     * @param userOutPriceLog
     * @return
     */
    void deletUserOutPriceLog (UserOutPriceLog userOutPriceLog);
}
