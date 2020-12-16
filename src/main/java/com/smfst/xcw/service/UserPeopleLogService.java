package com.smfst.xcw.service;

import com.smfst.xcw.model.UserPeopleLog;

import java.util.List;

/**
 * @ClassName UserPeopleLogLogService
 * @Author lan
 * @Date 2020/11/5 23:48
 **/
public interface UserPeopleLogService {

    /**
     * 查询全部学生招募员工日志
     * @return
     */
    List<UserPeopleLog> selectUserPeopleLogList();

    /**
     * 通过id查询学生招募员工日志
     * @param id
     * @return
     */
    UserPeopleLog selectUserPeopleLogById(Long id);

    /**
     * 通过指定参数查询学生招募员工日志
     * @param userInPriceLog
     * @return
     */
    List<UserPeopleLog> selectUserPeopleLogByParameter(UserPeopleLog userInPriceLog);

    /**
     * 新增学生招募员工日志
     * @param userInPriceLog
     * @return
     */
    void createUserPeopleLog(UserPeopleLog userInPriceLog);


    /**
     * 更新学生招募员工日志
     * @param userInPriceLog
     * @return
     */
    void updateUserPeopleLog (UserPeopleLog userInPriceLog);


    /**
     * 删除学生招募员工日志
     * @param userInPriceLog
     * @return
     */
    void deletUserPeopleLog (UserPeopleLog userInPriceLog);
    
}
