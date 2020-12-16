package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/28
 */

import com.smfst.xcw.model.UserPartLog;

import java.util.List;

/**
 *@ClassName UserPartLog
 *@Author lan
 *@Date 2020/10/28 9:26
 **/
public interface UserPartLogMapper {

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
     * @param userPartLog
     * @return
     */
    List<UserPartLog> selectUserPartLogByParameter(UserPartLog userPartLog);

    /**
     * 新增购买原材料日志
     * @param userPartLog
     * @return
     */
    void createUserPartLog(UserPartLog userPartLog);


    /**
     * 更新购买原材料日志
     * @param userPartLog
     * @return
     */
    void updateUserPartLog (UserPartLog userPartLog);


    /**
     * 删除购买原材料日志
     * @param userPartLog
     * @return
     */
    void deletUserPartLog (UserPartLog userPartLog);
}
