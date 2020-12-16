package com.smfst.xcw.service;

import com.smfst.xcw.model.UserQuestion;

import java.util.List;

/**
 * @ClassName UserQuestionService
 * @Author lan
 * @Date 2020/11/7 11:12
 **/
public interface UserQuestionService {
    
    /**
     * 查询全部学生问题车辆仓库
     * @return
     */
    List<UserQuestion> selectUserQuestionList();

    /**
     * 通过id查询学生问题车辆仓库
     * @param id
     * @return
     */
    UserQuestion selectUserQuestionById(Long id);

    /**
     * 通过指定参数查询学生问题车辆仓库
     * @param userQuestion
     * @return
     */
    List<UserQuestion> selectUserQuestionByParameter(UserQuestion userQuestion);

    /**
     * 新增学生问题车辆仓库
     * @param userQuestion
     * @return
     */
    void createUserQuestion(UserQuestion userQuestion);


    /**
     * 更新学生问题车辆仓库
     * @param userQuestion
     * @return
     */
    void updateUserQuestion (UserQuestion userQuestion);


    /**
     * 删除学生问题车辆仓库
     * @param userQuestion
     * @return
     */
    void deletUserQuestion (UserQuestion userQuestion);

}
