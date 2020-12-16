package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.mapper.PartMapper;
import com.smfst.xcw.model.Part;
import com.smfst.xcw.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName PartServiceImpl
 *@Author lan
 *@Date 2020/10/23 13:55
 **/
@Service
public class PartServiceImpl implements PartService {
    @Autowired
    private PartMapper partMapper;

    @Override
    public List<Part> selectPartList() {
        return partMapper.selectPartList();
    }

    @Override
    public Part selectPartById(Integer id) {
        return partMapper.selectPartById(id);
    }

    @Override
    public List<Part>  selectPartByParameter(Part part) {
        return partMapper.selectPartByParameter(part);
    }
}
