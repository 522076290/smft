package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.MaterialMapper;
import com.smfst.xcw.model.*;
import com.smfst.xcw.service.CarService;
import com.smfst.xcw.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private MaterialMapper materialMapper;
    /**
     * 查询原材料列表
     * @return
     */
    @Override
    public List<Material> selectMaterialList() {
        return materialMapper.selectMaterialList();
    }
    /**
     * 获取供货商品列表
     * @return
     */
    @Override
    public List<SupplyListTEditer> selectSupplyListTEditer() {
        return materialMapper.selectSupplyListTEditer();
    }
    /**
     * 查询售出记录
     * @return
     */
    @Override
    public List<UserSellInfoTEditer> selectUserSellInfoTEditer() {
        return materialMapper.selectUserSellInfoTEditer();
    }
    /**
     * 查询原材料入库日志
     */
    @Override
    public List<UserMaterialLog> selectUserMaterialLog() {
        return materialMapper.selectUserMaterialLog();
    }


}
