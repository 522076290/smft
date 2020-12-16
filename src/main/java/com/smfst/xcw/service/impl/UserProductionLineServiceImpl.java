package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.mapper.UserProductionLineMapper;
import com.smfst.xcw.model.UserProductionLine;
import com.smfst.xcw.service.UserProductionLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName UserProductionLineServiceImpl
 *@Author lan
 *@Date 2020/10/26 15:25
 **/
@Service
public class UserProductionLineServiceImpl implements UserProductionLineService {

    @Autowired
    private UserProductionLineMapper userProductionLineMapper;

    @Override
    public List<UserProductionLine> selectUserProductionLineList() {
        return userProductionLineMapper.selectUserProductionLineList();
    }

    @Override
    public UserProductionLine selectUserProductionLineById(Integer id) {
        return userProductionLineMapper.selectUserProductionLineById(id);
    }

    @Override
    public UserProductionLine selectUserProductionLineByPosition(Integer position) {
        return userProductionLineMapper.selectUserProductionLineByPosition(position);
    }

    @Override
    public UserProductionLine selectUserProductionLineByLineId(Integer lineId) {
        return userProductionLineMapper.selectUserProductionLineByLineId(lineId);
    }

    @Override
    public List<UserProductionLine> selectUserProductionLineByParameter(UserProductionLine userProductionLine) {
        return userProductionLineMapper.selectUserProductionLineByParameter(userProductionLine);
    }

    @Override
    public void createUserProductionLine(UserProductionLine userProductionLine) {
        userProductionLineMapper.createUserProductionLine(userProductionLine);
    }

    @Override
    public void updateUserProductionLine(UserProductionLine userProductionLine) {
        userProductionLineMapper.updateUserProductionLine(userProductionLine);
    }

    @Override
    public void deletUserProductionLine(UserProductionLine userProductionLine) {
        userProductionLineMapper.deletUserProductionLine(userProductionLine);
    }
}
