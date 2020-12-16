package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.UserPlStep;

import java.util.List;

/**
 *@ClassName UserPlStepService
 *@Author lan
 *@Date 2020/10/26 16:50
 **/
public interface UserPlStepService {
    /**
     * 查询全部学生生产环节
     * @return
     */
    List<UserPlStep> selectUserPlStepList();

    /**
     * 通过id查询学生生产环节
     * @param id
     * @return
     */
    UserPlStep selectUserPlStepById(Long id);

    /**
     * 通过指定参数查询学生生产环节
     * @param userPIStep
     * @return
     */
    List<UserPlStep> selecUserPlStepByParameter(UserPlStep userPIStep);

    /**
     * 新增学生生产环节
     * @param userPIStep
     * @return
     */
    void createUserPlStep(UserPlStep userPIStep);


    /**
     * 更新学生生产环节
     * @param userPIStep
     * @return
     */
    void updateUserPlStep (UserPlStep userPIStep);


    /**
     * 删除学生生产环节
     * @param userPIStep
     * @return
     */
    void deletUserPlStep (UserPlStep userPIStep);
}
