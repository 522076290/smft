package com.smfst.xcw.service;

import com.smfst.xcw.model.UserPartStore2;
import com.smfst.xcw.model.UserParts2;

import java.util.List;

/**
 * @quthor tyx 2020/11/27
 */
public interface UserPartStore2Service {
    /**
     * 查询全部学生备料
     * @return
     */
    List<UserPartStore2> selectUserPartStore2List();
}
