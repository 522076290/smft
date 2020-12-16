package com.smfst.xcw.service;

import com.smfst.xcw.model.Equipment;

import java.util.List;

public interface EquipmentService {
    /**
     * 查询全部设备
     * @return
     */
    List<Equipment> selectEquipmentList();
    /**
     * 新增设备
     * @param
     * @return
     */
    void createEquipment(Equipment equipment);


    /**
     * 更新设备
     * @param equipment
     * @return
     */
    void updateEquipment (Equipment equipment);


    /**
     * 删除设备
     * @param equipment
     * @return
     */
    void deleteEquipment (Equipment equipment);
}
