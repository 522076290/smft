package com.smfst.xcw.mapper;

import com.smfst.xcw.model.UserWorkEnvironmentalLog;

import java.util.List;

/**
 * @quthor lan 2020/10/12
 */
public interface UserWorkEnvironmentalLogMapper {
    /**
     * 查询全部学生工厂环境日志
     * @return
     */
    List<UserWorkEnvironmentalLog> selectUserWorkEnvironmentalLogList();

    /**
     * 通过id查询学生工厂环境日志
     * @param id
     * @return
     */
    UserWorkEnvironmentalLog selectUserWorkEnvironmentalLogById(Integer id);

    /**
     * 通过指定参数查询学生工厂环境日志
     * @param userWorkEnvironmentalLog
     * @return
     */
    List<UserWorkEnvironmentalLog> selectUserWorkEnvironmentalLogByParameter(UserWorkEnvironmentalLog userWorkEnvironmentalLog);


    /**
     * 新增学生工厂环境日志
     * @param userWorkEnvironmentalLog
     * @return
     */
    void createUserWorkEnvironmentalLog(UserWorkEnvironmentalLog userWorkEnvironmentalLog);

    /**
     * 更新学生工厂环境日志
     * @param userWorkEnvironmentalLog
     * @return
     */
    void updateUserWorkEnvironmentalLog (UserWorkEnvironmentalLog userWorkEnvironmentalLog);

    /**
     * 删除学生工厂环境日志
     * @param userWorkEnvironmentalLog
     * @return
     */
    void deletUserWorkEnvironmentalLog (UserWorkEnvironmentalLog userWorkEnvironmentalLog);
}
