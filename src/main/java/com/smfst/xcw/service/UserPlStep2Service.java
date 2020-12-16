package com.smfst.xcw.service;

import com.smfst.xcw.model.UserPlStep2;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserPlStep2Service {
    /**
     * 查询全部学生备料
     * @return
     */
    List<UserPlStep2> selectUserPlStep2List(Integer id);
}
