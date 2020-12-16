package com.smfst.xcw.service;

import com.smfst.xcw.model.UserParts2;

import java.util.List;

/**
 * @quthor tyx 2020/11/27
 */
public interface UserPart2Service {
    /**
     * 查询全部学生备料
     * @return
     */
    List<UserParts2> selectUserParts2List();
}
