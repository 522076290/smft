package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/23
 */


import com.smfst.xcw.mapper.SuppierListMapper;
import com.smfst.xcw.model.SuppierList;
import com.smfst.xcw.service.SuppierListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName SuppierListServiceImpl
 *@Author lan
 *@Date 2020/10/23 14:08
 **/
@Service
public class SuppierListServiceImpl implements SuppierListService {

    @Autowired
    private SuppierListMapper suppierListMapper;

    @Override
    public List<SuppierList> selectSuppierListAll() {
        return suppierListMapper.selectSuppierListAll();
    }

    @Override
    public  SuppierList selectSuppierListById(Integer id) {
        return suppierListMapper.selectSuppierListById(id);
    }

    @Override
    public List< SuppierList> selectSuppierListByParameter( SuppierList suppierList) {
        return suppierListMapper.selectSuppierListByParameter(suppierList);
    }
}
