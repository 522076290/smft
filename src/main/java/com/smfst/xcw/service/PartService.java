package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.Part;

import java.util.List;

/**
 *@ClassName PartService
 *@Author lan
 *@Date 2020/10/23 13:54
 **/
public interface PartService {
    /**
     * 查询原材料
     * @return
     */
    List<Part> selectPartList();

    /**
     * 通过id查询原材料
     * @param id
     * @return
     */
    Part selectPartById(Integer id);

    /**
     * 通过指定参数查询原材料
     * @param part
     * @return
     */
    List<Part>  selectPartByParameter(Part part);
}
