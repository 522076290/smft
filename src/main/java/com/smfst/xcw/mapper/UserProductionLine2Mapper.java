package com.smfst.xcw.mapper;

import com.smfst.xcw.model.UserProductionLine2;
import com.smfst.xcw.model.UserWork2;

import java.util.List;

/**
 *@ClassName UserProductionLine2Mapper
 *@Author tyx
 *@Date 2020/11/25
 **/
public interface UserProductionLine2Mapper {
    /**
     * 查询学生生产线
     * @return
     */
    List<UserProductionLine2> selectUserProductionLineList();


}
