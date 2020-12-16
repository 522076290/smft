package com.smfst.xcw.service;

import com.smfst.xcw.model.UserProductionLine2;
import com.smfst.xcw.model.UserWork2;

import java.util.List;

/**
 *@ClassName UserProductionLine2Service
 *@Author tyx
 *@Date 2020/11/25
 **/
public interface UserProductionLine2Service {
    /**
     * 查询学生生产线
     * @return
     */
    List<UserProductionLine2> selectUserProductionLineList();


}
