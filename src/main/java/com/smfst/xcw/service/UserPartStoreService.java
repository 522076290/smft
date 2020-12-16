package com.smfst.xcw.service;/**
 * @Author lan
 * @Date 2020/10/27
 */

import com.smfst.xcw.model.UserPartStore;

import java.util.List;

/**
 *@ClassName UserPartStoreService
 *@Author lan
 *@Date 2020/10/27 21:20
 **/
public interface UserPartStoreService {

    /**
     * 查询全部学生原材料仓库
     * @return
     */
    List<UserPartStore> selectUserPartStoreList();

    /**
     * 通过id查询原材料仓库
     * @param id
     * @return
     */
    UserPartStore selectUserPartStoreById(Integer id);

    /**
     * 通过指定参数查询原材料仓库
     * @param userPartStore
     * @return
     */
    List<UserPartStore> selectUserPartStoreByParameter(UserPartStore userPartStore);

    /**
     * 新增原材料仓库
     * @param userPartStore
     * @return
     */
    void createUserPartStore(UserPartStore userPartStore);


    /**
     * 更新原材料仓库
     * @param userPartStore
     * @return
     */
    void updateUserPartStore (UserPartStore userPartStore);


    /**
     * 删除原材料仓库
     * @param userPartStore
     * @return
     */
    void deletUserPartStore (UserPartStore userPartStore);
}
