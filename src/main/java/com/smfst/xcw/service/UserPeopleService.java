package com.smfst.xcw.service;

import com.smfst.xcw.model.UserPeople;

import java.util.List;

/**
 * @ClassName UserPeopleService
 * @Author lan
 * @Date 2020/11/5 22:52
 **/
public interface UserPeopleService {

    /**
     * 查询全部学生员工
     * @return
     */
    List<UserPeople> selectUserPeopleList();

    /**
     * 通过id查询学生员工
     * @param id
     * @return
     */
    UserPeople selectUserPeopleById(Long id);

    /**
     * 通过指定参数查询学生员工
     * @param userInPriceLog
     * @return
     */
    List<UserPeople> selectUserPeopleByParameter(UserPeople userInPriceLog);

    /**
     * 新增学生员工
     * @param userInPriceLog
     * @return
     */
    void createUserPeople(UserPeople userInPriceLog);


    /**
     * 更新学生员工
     * @param userInPriceLog
     * @return
     */
    void updateUserPeople (UserPeople userInPriceLog);


    /**
     * 删除学生员工
     * @param userInPriceLog
     * @return
     */
    void deletUserPeople (UserPeople userInPriceLog);
}
