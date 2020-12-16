package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.SuppierList;

import java.util.List;

/**
 *@ClassName SuppierMapper
 *@Author lan
 *@Date 2020/10/23 14:06
 **/
public interface SuppierListMapper {

    /**
     * 查询全部供货列表
     * @return
     */
    List<SuppierList> selectSuppierListAll();

    /**
     * 通过id查询供货列表
     * @param id
     * @return
     */
    SuppierList selectSuppierListById(Integer id);

    /**
     * 通过指定参数查询供货列表
     * @param suppier
     * @return
     */
    List<SuppierList> selectSuppierListByParameter(SuppierList suppier);
}
