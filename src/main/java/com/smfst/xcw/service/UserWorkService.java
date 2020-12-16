package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.UserWork;

import java.util.List;

/**
 *@ClassName UserWorkService
 *@Author lan
 *@Date 2020/10/23 15:27
 **/
public interface UserWorkService {

    /**
     * 查询查询学生工厂
     * @return
     */
    List<UserWork> selectUserWorkList();

    /**
     * 通过id查询学生工厂
     * @param id
     * @return
     */
    UserWork selectUserWorkById(Integer id);

    /**
     * 通过指定参数查询学生工厂
     * @param userWork
     * @return
     */
    List<UserWork> selectUserWorkByParameter(UserWork userWork);

    /**
     * 更新学生工厂环境日志
     * @param userWork
     * @return
     */
    void updateUserWork (UserWork userWork);
}
