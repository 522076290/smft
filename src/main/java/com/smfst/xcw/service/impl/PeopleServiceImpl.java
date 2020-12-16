package com.smfst.xcw.service.impl;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.mapper.PeopleMapper;
import com.smfst.xcw.model.People;
import com.smfst.xcw.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName PeopleServiceImpl
 *@Author lan
 *@Date 2020/10/20 19:59
 **/
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public List<People> selectPeopleList() {
        return peopleMapper.selectPeopleList();
    }

    @Override
    public People selectPeopleById(Integer id) {
        return peopleMapper.selectPeopleById(id);
    }

    @Override
    public List<People> selectPeopleByParameter(People people) {
        return peopleMapper.selectPeopleByParameter(people);
    }
}
