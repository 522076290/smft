package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.model.PLStep;

import java.util.List;

/**
 *@ClassName PLStepMapper
 *@Author lan
 *@Date 2020/10/20 15:39
 **/
public interface PLStepMapper {
    /**
     * 查询全部生产环节
     * @return
     */
    List<PLStep> selectPLStepList();

    /**
     * 通过id查询生产环节
     * @param id
     * @return
     */
    PLStep selectPLStepById(Integer id);

    /**
     * 通过指定参数查询生产环节
     * @param plStep
     * @return
     */
    List<PLStep> selectPLStepByParameter(PLStep plStep);
}
