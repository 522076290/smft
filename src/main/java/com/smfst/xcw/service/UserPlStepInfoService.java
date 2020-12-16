package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/27
 */

import com.smfst.xcw.model.UserPlStepInfo;

import java.util.List;

/**
 *@ClassName UserPlStepInfoService
 *@Author lan
 *@Date 2020/10/27 10:01
 **/
public interface UserPlStepInfoService {
    /**
     * 查询全部学生生产环节信息
     * @return
     */
    List<UserPlStepInfo> selectUserPlStepInfoList();

    /**
     * 通过id查询学生生产环节信息
     * @param id
     * @return
     */
    UserPlStepInfo selectUserPlStepInfoById(Long id);

    /**
     * 通过指定参数查询学生生产环节信息
     * @param userPIStepInfo
     * @return
     */
    List<UserPlStepInfo> selectUserPlStepInfoByParameter(UserPlStepInfo userPIStepInfo);

    /**
     * 新增学生生产环节信息
     * @param userPIStepInfo
     * @return
     */
    void createUserPlStepInfo(UserPlStepInfo userPIStepInfo);


    /**
     * 更新学生生产环节信息
     * @param userPIStepInfo
     * @return
     */
    void updateUserPlStepInfo (UserPlStepInfo userPIStepInfo);


    /**
     * 删除学生生产环节信息
     * @param userPIStepInfo
     * @return
     */
    void deletUserPlStepInfo (UserPlStepInfo userPIStepInfo);
}
