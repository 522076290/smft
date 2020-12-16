package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/23
 */

import com.smfst.xcw.model.UserWorkEnvironmental;

import java.util.List;

/**
 *@ClassName UserWorkEnvironmentalMapper
 *@Author lan
 *@Date 2020/10/23 17:16
 **/
public interface UserWorkEnvironmentalMapper {
    /**
     * 查询查询全部学生工厂环境
     * @return
     */
    List<UserWorkEnvironmental> selectUserWorkEnvironmentalList();

    /**
     * 通过id查询学生工厂环境
     * @param id
     * @return
     */
    UserWorkEnvironmental selectUserWorkEnvironmentalById(Integer id);

    /**
     * 通过指定参数查询学生工厂环境
     * @param userWorkEnvironmental
     * @return
     */
    List<UserWorkEnvironmental> selectUserWorkEnvironmentalByParameter(UserWorkEnvironmental userWorkEnvironmental);

    /**
     * 更新学生工厂环境
     * @param userWorkEnvironmental
     * @return
     */
    void updateUserWorkEnvironmental (UserWorkEnvironmental userWorkEnvironmental);
}
