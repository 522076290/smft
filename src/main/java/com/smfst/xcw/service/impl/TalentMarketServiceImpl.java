package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.mapper.TalentMarketMapper;
import com.smfst.xcw.model.TalentMarket;
import com.smfst.xcw.service.TalentMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName TalentMarketServiceImpl
 *@Author lan
 *@Date 2020/10/20 20:44
 **/
@Service
public class TalentMarketServiceImpl implements TalentMarketService {

    @Autowired
    private TalentMarketMapper talentMarketMapper;

    @Override
    public List<TalentMarket> selectTalentMarketList() {
        return talentMarketMapper.selectTalentMarketList();
    }

    @Override
    public TalentMarket selectTalentMarketById(Integer id) {
        return talentMarketMapper.selectTalentMarketById(id);
    }

    @Override
    public List<TalentMarket>  selectTalentMarketByParameter(TalentMarket talentMark) {
        return talentMarketMapper.selectTalentMarketByParameter(talentMark);
    }
}
