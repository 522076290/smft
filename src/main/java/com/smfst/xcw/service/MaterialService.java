package com.smfst.xcw.service;

import com.smfst.xcw.model.*;

import java.util.List;

public interface MaterialService {

    /**
     * 查询全部原材料
     *  @return List<Admin>
     * */
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
