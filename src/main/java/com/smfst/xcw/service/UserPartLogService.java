package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/28
 */

import com.smfst.xcw.model.UserPartLog;

import java.util.List;

/**
 *@ClassName UserPartLogService
 *@Author lan
 *@Date 2020/10/28 9:30
 **/
public interface UserPartLogService {
    /**
     * 查询全部学生购买原材料日志
     * @return
     */
    List<UserPartLog> selectUserPartLogList();

    /**
     * 通过id查询购买原材料日志
     * @param id
     * @return
     */
    UserPartLog selectUserPartLogById(Integer id);

    /**
     * 通过指定参数查询购买原材料日志
     * @param userParts
     * @return
     */
    List<UserPartLog> selectUserPartLogByParameter(UserPartLog userParts);

    /**
     * 新增购买原材料日志
     * @param userParts
     * @return
     */
    void createUserPartLog(UserPartLog userParts);


    /**
     * 更新购买原材料日志
     * @param userParts
     * @return
     */
    void updateUserPartLog (UserPartLog userParts);


    /**
     * 删除购买原材料日志
     * @param userParts
     * @return
     */
    void deletUserPartLog (UserPartLog userParts);
}
