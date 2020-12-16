package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.mapper.WorkPostMapper;
import com.smfst.xcw.model.WorkPost;
import com.smfst.xcw.service.WorkPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName WorkPostServiceImpl
 *@Author lan
 *@Date 2020/10/20 18:40
 **/
@Service
public class WorkPostServiceImpl implements WorkPostService {

    @Autowired
    private WorkPostMapper workPostMapper;

    @Override
    public List<WorkPost> selectWorkPostList() {
        return workPostMapper.selectWorkPostList();
    }

    @Override
    public WorkPost selectWorkPostById(Integer id) {
        return workPostMapper.selectWorkPostById(id);
    }

    @Override
    public List<WorkPost>  selectWorkPostByParameter(WorkPost workPost) {
        return workPostMapper.selectWorkPostByParameter(workPost);
    }
}
