package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.model.TalentMarket;

import java.util.List;

/**
 *@ClassName TalentMarketMapper
 *@Author lan
 *@Date 2020/10/20 20:41
 **/
public interface TalentMarketMapper {
    /**
     * 查询查询全部人才市场
     * @return
     */
    List<TalentMarket> selectTalentMarketList();

    /**
     * 通过id查询人才市场
     * @param id
     * @return
     */
    TalentMarket selectTalentMarketById(Integer id);

    /**
     * 通过指定参数查询人才市场
     * @param talentMark
     * @return
     */
    List<TalentMarket> selectTalentMarketByParameter(TalentMarket talentMark);
}
