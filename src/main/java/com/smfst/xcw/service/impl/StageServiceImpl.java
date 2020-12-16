package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.mapper.StageMapper;
import com.smfst.xcw.model.Stage;
import com.smfst.xcw.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName StageServiceImpl
 *@Author lan
 *@Date 2020/10/20 15:15
 **/
@Service
public class StageServiceImpl implements StageService {

    @Autowired
    private  StageMapper stageMapper;

    @Override
    public List<Stage> selectStageList() {
        return stageMapper.selectStageList();
    }

    @Override
    public Stage selectStageById(Integer id) {
        return stageMapper.selectStageById(id);
    }

    @Override
    public List<Stage> selectStageByParameter(Stage stage) {
        return stageMapper.selectStageByParameter(stage);
    }
}
