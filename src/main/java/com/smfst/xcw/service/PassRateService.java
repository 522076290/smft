package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.PassRate;

import java.util.List;

/**
 *@ClassName PassRateService
 *@Author lan
 *@Date 2020/10/23 15:11
 **/
public interface PassRateService {
    /**
     * 查询全部产品合格率
     *
     * @return
     */
    List<PassRate> selectPassRateList();

    /**
     * 通过id查询产品合格率
     *
     * @param id
     * @return
     */
    PassRate selectPassRateById(Integer id);

    /**
     * 通过指定参数查询产品合格率
     *
     * @param passRate
     * @return
     */
    List<PassRate> selectPassRateByParameter(PassRate passRate);
}
