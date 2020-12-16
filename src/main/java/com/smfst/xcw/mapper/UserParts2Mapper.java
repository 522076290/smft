package com.smfst.xcw.mapper;

import com.smfst.xcw.model.UserPartPurchaseLog;
import com.smfst.xcw.model.UserParts2;

import java.util.List;

/**
 *@ClassName UserParts2Mapper
 *@Author tyx
 *@Date 2020/11/27
 **/
public interface UserParts2Mapper {
    /**
     * 查询全部学生备料
     * @return
     */
    List<UserParts2> selectUserParts2List();
}
