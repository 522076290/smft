package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.mapper.PLStepMapper;
import com.smfst.xcw.model.PLStep;
import com.smfst.xcw.service.PLStepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName PLStepServiceImpl
 *@Author lan
 *@Date 2020/10/20 15:40
 **/
@Service
public class PLStepServiceImpl implements PLStepService {
    @Autowired
    private PLStepMapper plStepMapper;


    @Override
    public List<PLStep> selectPLStepList() {
        return plStepMapper.selectPLStepList();
    }

    @Override
    public PLStep selectPLStepById(Integer id) {
        return plStepMapper.selectPLStepById(id);
    }

    @Override
    public List<PLStep> selectPLStepByParameter(PLStep plStep) {
        return plStepMapper.selectPLStepByParameter(plStep);
    }
}
