package com.smfst.xcw.service;

import com.smfst.xcw.model.UserQuestionLog;

import java.util.List;

/**
 * @ClassName UserQuestionLogService
 * @Author lan
 * @Date 2020/11/7 11:42
 **/
public interface UserQuestionLogService {

    /**
     * 查询全部学生问题车辆修复日志
     * @return
     */
    List<UserQuestionLog> selectUserQuestionLogList();

    /**
     * 通过id查询学生问题车辆修复日志
     * @param id
     * @return
     */
    UserQuestionLog selectUserQuestionLogById(Long id);

    /**
     * 通过指定参数查询学生问题车辆修复日志
     * @param userQuestion
     * @return
     */
    List<UserQuestionLog> selectUserQuestionLogByParameter(UserQuestionLog userQuestion);

    /**
     * 新增学生问题车辆修复日志
     * @param userQuestion
     * @return
     */
    void createUserQuestionLog(UserQuestionLog userQuestion);


    /**
     * 更新学生问题车辆修复日志
     * @param userQuestion
     * @return
     */
    void updateUserQuestionLog (UserQuestionLog userQuestion);


    /**
     * 删除学生问题车辆修复日志
     * @param userQuestion
     * @return
     */
    void deletUserQuestionLog (UserQuestionLog userQuestion);
}
