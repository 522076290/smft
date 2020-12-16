package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/28
 */

import com.smfst.xcw.model.UserPartPurchaseLog;

import java.util.List;

/**
 *@ClassName UserPartPurchaseLogMapper
 *@Author lan
 *@Date 2020/10/28 10:06
 **/
public interface UserPartPurchaseLogMapper {

    /**
     * 查询全部学生流通原材料日志
     * @return
     */
    List<UserPartPurchaseLog> selectUserPartPurchaseLogList();

    /**
     * 通过id查询流通原材料日志
     * @param id
     * @return
     */
    UserPartPurchaseLog selectUserPartPurchaseLogById(Integer id);

    /**
     * 通过指定参数查询流通原材料日志
     * @param userPartPurchaseLog
     * @return
     */
    List<UserPartPurchaseLog> selectUserPartPurchaseLogByParameter(UserPartPurchaseLog userPartPurchaseLog);

    /**
     * 新增流通原材料日志
     * @param userPartPurchaseLog
     * @return
     */
    void createUserPartPurchaseLog(UserPartPurchaseLog userPartPurchaseLog);


    /**
     * 更新流通原材料日志
     * @param userPartPurchaseLog
     * @return
     */
    void updateUserPartPurchaseLog (UserPartPurchaseLog userPartPurchaseLog);


    /**
     * 删除流通原材料日志
     * @param userPartPurchaseLog
     * @return
     */
    void deletUserPartPurchaseLog (UserPartPurchaseLog userPartPurchaseLog);

}
