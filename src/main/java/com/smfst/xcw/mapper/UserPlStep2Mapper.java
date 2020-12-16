package com.smfst.xcw.mapper;

import com.smfst.xcw.model.UserParts;
import com.smfst.xcw.model.UserPlStep2;

import java.util.List;

/**
 *@ClassName UserPlStep2Mapper
 *@Author tyx
 *@Date 2020/11/26
 **/
public interface UserPlStep2Mapper {
    /**
     * 查询全部学生备料
     * @return
     */
    List<UserPlStep2> selectUserPlStep2List(Integer integer);
}
