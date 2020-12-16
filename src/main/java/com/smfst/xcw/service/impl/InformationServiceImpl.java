package com.smfst.xcw.service.impl;

import com.smfst.xcw.mapper.InformationMapper;
import com.smfst.xcw.model.Information;
import com.smfst.xcw.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName InformationServiceImpl
 * @Author lan
 * @Date 2020/11/7 16:55
 **/
@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationMapper informationMapper;

    @Override
    public List<Information> selectInformationList() {
        return informationMapper.selectList();
    }

    @Override
    public Information selectInformationById(Long id) {
        return informationMapper.selectById(id);
    }

    @Override
    public List<Information> selectInformationByParameter(Information information) {
        return informationMapper.selectByPartment(information);
    }

    @Override
    public void createInformation(Information information) {
        informationMapper.insert(information);
    }

    @Override
    public void updateInformation(Information information) {
        informationMapper.update(information);
    }

    @Override
    public void deletInformation(Information information) {
        informationMapper.deleteById(information.getId());
    }
}
