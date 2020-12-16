package com.smfst.xcw.service;

import com.smfst.xcw.model.Information;

import java.util.List;

/**
 * @ClassName InformationService
 * @Author lan
 * @Date 2020/11/7 16:53
 **/
public interface InformationService {
    /**
     * 查询全部资讯中心
     * @return
     */
    List<Information> selectInformationList();

    /**
     * 通过id查询资讯中心
     * @param id
     * @return
     */
    Information selectInformationById(Long id);

    /**
     * 通过指定参数查询资讯中心
     * @param information
     * @return
     */
    List<Information> selectInformationByParameter(Information information);

    /**
     * 新增资讯中心
     * @param information
     * @return
     */
    void createInformation(Information information);


    /**
     * 更新资讯中心
     * @param information
     * @return
     */
    void updateInformation (Information information);


    /**
     * 删除资讯中心
     * @param information
     * @return
     */
    void deletInformation (Information information);

}
