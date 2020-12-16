package com.smfst.xcw.mapper;

import com.smfst.xcw.model.Car;
import com.smfst.xcw.model.Equipment;
import com.smfst.xcw.model.UserInPriceLog;

import java.util.List;

/**
 * @quthor tyx 2020/12/2
 */
public interface EquipmentMapper {
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
