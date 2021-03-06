package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.Suppier;

import java.util.List;

/**
 *@ClassName SuppierMapper
 *@Author lan
 *@Date 2020/10/23 14:06
 **/
public interface SuppierMapper {

    /**
     * 查询全部供货商
     * @return
     */
    List<Suppier> selectSuppierList();

    /**
     * 通过id查询供货商
     * @param id
     * @return
     */
    Suppier selectSuppierById(Integer id);

    /**
     * 通过指定参数查询供货商
     * @param suppier
     * @return
     */
    List<Suppier> selectSuppierByParameter(Suppier suppier);
}
