package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.UserWorkInfo;

import java.util.List;

/**
 *@ClassName UserWorkInfoService
 *@Author lan
 *@Date 2020/10/23 16:19
 **/
public interface UserWorkInfoService {

    /**
     * 查询查询全部学生工厂信息
     * @return
     */
    List<UserWorkInfo> selectUserWorkInfoList();

    /**
     * 通过id查询学生工厂信息
     * @param id
     * @return
     */
    UserWorkInfo selectUserWorkInfoById(Integer id);

    /**
     * 通过指定参数查询学生工厂信息
     * @param userWorkInfo
     * @return
     */
    List<UserWorkInfo> selectUserWorkInfoByParameter(UserWorkInfo userWorkInfo);

    /**
     * 更新学生工厂信息
     * @param userWorkInfo
     * @return
     */
    void updateUserWorkInfo (UserWorkInfo userWorkInfo);
}
