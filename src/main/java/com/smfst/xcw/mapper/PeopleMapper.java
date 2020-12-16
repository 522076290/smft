package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/20
 */

import com.smfst.xcw.model.People;

import java.util.List;

/**
 *@ClassName PeopleMapper
 *@Author lan
 *@Date 2020/10/20 19:55
 **/
public interface PeopleMapper {


    /**
     * 查询查询全部人员
     * @return
     */
    List<People> selectPeopleList();

    /**
     * 通过id查询人员
     * @param id
     * @return
     */
    People selectPeopleById(Integer id);

    /**
     * 通过指定参数查询人员
     * @param people
     * @return
     */
    List<People> selectPeopleByParameter(People people);
}
