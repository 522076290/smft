package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.model.WorkPost;

import java.util.List;

/**
 *@ClassName WorkPostService
 *@Author lan
 *@Date 2020/10/20 18:40
 **/
public interface WorkPostService {
    /**
     * 查询查询全部岗位
     * @return
     */
    List<WorkPost> selectWorkPostList();

    /**
     * 通过id查询岗位
     * @param id
     * @return
     */
    WorkPost selectWorkPostById(Integer id);

    /**
     * 通过指定参数查询岗位
     * @param workPost
     * @return
     */
    List<WorkPost>  selectWorkPostByParameter(WorkPost workPost);
}
