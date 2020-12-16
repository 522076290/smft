package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.EquipmentMapper;
import com.smfst.xcw.model.Equipment;
import com.smfst.xcw.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentMapper equipmentMapper;
    @Override
    public List<Equipment> selectEquipmentList() {
        return equipmentMapper.selectEquipmentList();
    }

    @Override
    public void createEquipment(Equipment equipment) {
        equipmentMapper.createEquipment(equipment);
    }

    @Override
    public void updateEquipment(Equipment equipment) {
        equipmentMapper.updateEquipment(equipment);
    }

    @Override
    public void deleteEquipment(Equipment equipment) {
        equipmentMapper.deleteEquipment(equipment);
    }
}
