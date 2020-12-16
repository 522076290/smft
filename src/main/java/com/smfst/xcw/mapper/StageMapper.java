package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/20
 */


import com.smfst.xcw.model.Stage;

import java.util.List;

/**
 *@ClassName StageMapper
 *@Author lan
 *@Date 2020/10/20 15:16
 **/
public interface StageMapper {

    /**
     * 查询查询全部生产工序
     * @return
     */
    List<Stage> selectStageList();

    /**
     * 通过id查询生产工序
     * @param id
     * @return
     */
    Stage selectStageById(Integer id);

    /**
     * 通过指定参数查询生产工序
     * @param stage
     * @return
     */
    List<Stage> selectStageByParameter(Stage stage);

}
