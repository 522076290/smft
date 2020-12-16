package com.smfst.xcw.mapper;

import com.smfst.xcw.model.UserPartStore2;
import com.smfst.xcw.model.UserParts2;

import java.util.List;

/**
 *@ClassName UserPartStore2Mapper
 *@Author tyx
 *@Date 2020/11/27
 **/
public interface UserPartStore2Mapper {
    /**
     * 查询全部原材料仓库
     * @return
     */
    List<UserPartStore2> selectUserPartStore2List();
}
