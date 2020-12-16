package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.mapper.PassRateMapper;
import com.smfst.xcw.model.PassRate;
import com.smfst.xcw.service.PassRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName PassRateServiceImpl
 *@Author lan
 *@Date 2020/10/23 15:12
 **/
@Service
public class PassRateServiceImpl implements PassRateService {

    @Autowired
    private PassRateMapper passRateMapper;

    @Override
    public List<PassRate> selectPassRateList() {
        return passRateMapper.selectPassRateList();
    }

    @Override
    public PassRate selectPassRateById(Integer id) {
        return passRateMapper.selectPassRateById(id);
    }

    @Override
    public List<PassRate> selectPassRateByParameter(PassRate passRate) {
        return passRateMapper.selectPassRateByParameter(passRate);
    }
}
