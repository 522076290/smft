package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/27
 */

import com.smfst.xcw.model.UserParts;

import java.util.List;

/**
 *@ClassName UserPartsService
 *@Author lan
 *@Date 2020/10/27 17:35
 **/
public interface UserPartsService {
    /**
     * 查询全部学生备料
     * @return
     */
    List<UserParts> selectUserPartsList();

    /**
     * 通过id查询备料
     * @param id
     * @return
     */
    UserParts selectUserPartsById(Integer id);

    /**
     * 通过指定参数查询备料
     * @param userParts
     * @return
     */
    List<UserParts> selectUserPartsByParameter(UserParts userParts);

    /**
     * 新增备料
     * @param userParts
     * @return
     */
    void createUserParts(UserParts userParts);


    /**
     * 更新备料
     * @param userParts
     * @return
     */
    void updateUserParts (UserParts userParts);


    /**
     * 删除备料
     * @param userParts
     * @return
     */
    void deletUserParts (UserParts userParts);
}
