package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.UserWorkEnvironmentalLogMapper;
import com.smfst.xcw.model.UserWorkEnvironmentalLog;
import com.smfst.xcw.service.UserWorkEnvironmentalLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @quthor lan 2020/10/12
 */
@Service
public class UserWorkEnvironmentalLogServiceImpl implements UserWorkEnvironmentalLogService {

    @Autowired
    private UserWorkEnvironmentalLogMapper userWorkEnvironmentalLogMapper;

    /**
     * 查询全部学生工厂环境日志
     * @return
     */
    @Override
    public List<UserWorkEnvironmentalLog> selectUserWorkEnvironmentalLogList() {
        return userWorkEnvironmentalLogMapper.selectUserWorkEnvironmentalLogList();
    }

    /**
     * 通过id查询学生工厂环境日志
     * @return
     */
    @Override
    public UserWorkEnvironmentalLog selectUserWorkEnvironmentalLogById(Integer id) {
        return userWorkEnvironmentalLogMapper.selectUserWorkEnvironmentalLogById(id);
    }

    /**
     * 通过指定参数查询学生工厂环境日志
     * @param userWorkEnvironmentalLog
     * @return
     */
    @Override
    public List<UserWorkEnvironmentalLog> selectUserWorkEnvironmentalLogByParameter(UserWorkEnvironmentalLog userWorkEnvironmentalLog) {
        return userWorkEnvironmentalLogMapper.selectUserWorkEnvironmentalLogByParameter(userWorkEnvironmentalLog);
    }


    /**
     * 新增学生工厂环境日志
     * @param userWorkEnvironmentalLog
     * @return
     */
    @Override
    public void createUserWorkEnvironmentalLog(UserWorkEnvironmentalLog userWorkEnvironmentalLog) {
        userWorkEnvironmentalLogMapper.createUserWorkEnvironmentalLog(userWorkEnvironmentalLog);
    }

    /**
     * 更新学生工厂环境日志
     * @param userWorkEnvironmentalLog
     * @return
     */
    @Override
    public void updateUserWorkEnvironmentalLog(UserWorkEnvironmentalLog userWorkEnvironmentalLog) {

        userWorkEnvironmentalLogMapper.updateUserWorkEnvironmentalLog(userWorkEnvironmentalLog);
    }


    /**
     * 删除学生工厂环境日志
     * @param userWorkEnvironmentalLog
     * @return
     */
    @Override
    public void deletUserWorkEnvironmentalLog(UserWorkEnvironmentalLog userWorkEnvironmentalLog) {
        userWorkEnvironmentalLogMapper.deletUserWorkEnvironmentalLog(userWorkEnvironmentalLog);
    }
}
