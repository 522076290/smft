package com.smfst.xcw.service;

import com.smfst.xcw.model.UserRepairCarStore;

import java.util.List;

/**
 * @ClassName UserRepairCarStoreService
 * @Author lan
 * @Date 2020/11/4 23:15
 **/
public interface UserRepairCarStoreService {
    /**
     * 查询全部维修车辆成品仓库
     * @return
     */
    List<UserRepairCarStore> selectUserRepairCarStoreList();

    /**
     * 通过id查询维修车辆成品仓库
     * @param id
     * @return
     */
    UserRepairCarStore selectUserRepairCarStoreById(Integer id);

    /**
     * 通过指定参数查询维修车辆成品仓库
     * @param userInPriceLog
     * @return
     */
    List<UserRepairCarStore> selectUserRepairCarStoreByParameter(UserRepairCarStore userInPriceLog);

    /**
     * 新增维修车辆成品仓库
     * @param userInPriceLog
     * @return
     */
    void createUserRepairCarStore(UserRepairCarStore userInPriceLog);


    /**
     * 更新维修车辆成品仓库
     * @param userInPriceLog
     * @return
     */
    void updateUserRepairCarStore (UserRepairCarStore userInPriceLog);


    /**
     * 删除维修车辆成品仓库
     * @param userInPriceLog
     * @return
     */
    void deletUserRepairCarStore (UserRepairCarStore userInPriceLog);
}
