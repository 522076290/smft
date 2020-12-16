package com.smfst.xcw.mapper;


import com.smfst.xcw.model.Material;
import com.smfst.xcw.model.SupplyListTEditer;
import com.smfst.xcw.model.UserMaterialLog;
import com.smfst.xcw.model.UserSellInfoTEditer;

import java.util.List;

/**
 * @ClassName MaterialMapper
 * @Author lan
 * @Date 2020/11/5 9:57
 * 通用泛型Mapper基类
 **/
public interface MaterialMapper {
    /**
     * 获取原材料详情
     */
    List<Material> selectMaterialList();

    /**
     * 获取供应商列表
     */
    List<SupplyListTEditer> selectSupplyListTEditer();

    /**
     * 查询售出记录
     */
    List<UserSellInfoTEditer> selectUserSellInfoTEditer();
    /**
     * 查询原材料入库日志
     */
    List<UserMaterialLog> selectUserMaterialLog();
}
