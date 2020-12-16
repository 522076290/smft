package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.mapper.SuppierMapper;
import com.smfst.xcw.model.Suppier;
import com.smfst.xcw.service.SuppierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName SuppierServiceImpl
 *@Author lan
 *@Date 2020/10/23 14:08
 **/
@Service
public class SuppierServiceImpl implements SuppierService {

    @Autowired
    private SuppierMapper suppierMapper;

    @Override
    public List<Suppier> selectSuppierList() {
        return suppierMapper.selectSuppierList();
    }

    @Override
    public Suppier selectSuppierById(Integer id) {
        return suppierMapper.selectSuppierById(id);
    }

    @Override
    public List<Suppier> selectSuppierByParameter(Suppier suppier) {
        return suppierMapper.selectSuppierByParameter(suppier);
    }
}
