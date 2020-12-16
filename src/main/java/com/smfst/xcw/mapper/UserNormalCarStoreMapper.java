package com.smfst.xcw.mapper;

import com.smfst.xcw.model.UserNormalCarStore;

import java.util.List;

/**
 * @ClassName UserNormalCarStoreMapper
 * @Author lan
 * @Date 2020/11/4 17:29
 **/
public interface UserNormalCarStoreMapper {
    
    /**
     * 查询全部正常车辆成品仓库
     * @return
     */
    List<UserNormalCarStore> selectUserNormalCarStoreList();

    /**
     * 通过id查询正常车辆成品仓库
     * @param id
     * @return
     */
    UserNormalCarStore selectUserNormalCarStoreById(Integer id);

    /**
     * 通过指定参数查询正常车辆成品仓库
     * @param userInPriceLog
     * @return
     */
    List<UserNormalCarStore> selectUserNormalCarStoreByParameter(UserNormalCarStore userInPriceLog);

    /**
     * 新增正常车辆成品仓库
     * @param userInPriceLog
     * @return
     */
    void createUserNormalCarStore(UserNormalCarStore userInPriceLog);


    /**
     * 更新正常车辆成品仓库
     * @param userInPriceLog
     * @return
     */
    void updateUserNormalCarStore (UserNormalCarStore userInPriceLog);


    /**
     * 删除正常车辆成品仓库
     * @param userInPriceLog
     * @return
     */
    void deletUserNormalCarStore (UserNormalCarStore userInPriceLog);
    
}
