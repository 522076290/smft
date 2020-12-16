package com.smfst.xcw.service;

import com.smfst.xcw.model.UserWork;
import com.smfst.xcw.model.UserWork2;

import java.util.List;

/**
 *@ClassName UserWork2Service
 *@Author tyx
 *@Date 2020/11/24
 **/
public interface UserWork2Service {
    /**
     * 查询学生工厂
     * @return
     */
    List<UserWork2> selectUserWorkList();

    /**
     * 通过id查询学生工厂
     * @param id
     * @return
     */
    UserWork2 selectUserWorkById(Integer id);
}
