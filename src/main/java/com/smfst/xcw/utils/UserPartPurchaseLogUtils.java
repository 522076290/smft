package com.smfst.xcw.utils;

import com.smfst.xcw.model.UserPartPurchaseLog;

import java.util.Map;

/**
 * @ClassName UserPartPurchaseLogUtils
 * @Author lan
 * @Date 2020/10/30 17:29
 **/
public class UserPartPurchaseLogUtils {
    private static final String USERWORKID = "userWorkId";
    private static final String USERPRODUCTIONLINEID = "userProductionLineId";
    private static final String USERSTAGEID = "userStageId";
    private static final String PARTID = "partId";
    private static final String NUM = "num";
    private static final String TIME = "time";

    public static Object updateutils(Map<String,String> params, String args) {

        if (USERWORKID.equals(args)) {
            UserPartPurchaseLog userPartPurchaseLog = new UserPartPurchaseLog();
            userPartPurchaseLog.setId(Integer.valueOf(params.get("id")));
            userPartPurchaseLog.setUserWorkId(Integer.valueOf(params.get(args)));
            return userPartPurchaseLog;
        } else if (USERPRODUCTIONLINEID.equals(args)) {
            UserPartPurchaseLog userPartPurchaseLog = new UserPartPurchaseLog();
            userPartPurchaseLog.setId(Integer.valueOf(params.get("id")));
            userPartPurchaseLog.setUserProductionLineId(Integer.valueOf(params.get(args)));
            return userPartPurchaseLog;
        } else if (USERSTAGEID.equals(args)) {
            UserPartPurchaseLog userPartPurchaseLog = new UserPartPurchaseLog();
            userPartPurchaseLog.setId(Integer.valueOf(params.get("id")));
            userPartPurchaseLog.setUserStageId(Integer.valueOf(params.get(args)));
            return userPartPurchaseLog;
        } else if (PARTID.equals(args)) {
            UserPartPurchaseLog userPartPurchaseLog = new UserPartPurchaseLog();
            userPartPurchaseLog.setId(Integer.valueOf(params.get("id")));
            userPartPurchaseLog.setPartId(Integer.valueOf(params.get(args)));
            return userPartPurchaseLog;
        } else if (NUM.equals(args)) {
            UserPartPurchaseLog userPartPurchaseLog = new UserPartPurchaseLog();
            userPartPurchaseLog.setId(Integer.valueOf(params.get("id")));
            userPartPurchaseLog.setNum(Integer.valueOf(params.get(args)));
            return userPartPurchaseLog;
        } else if (TIME.equals(args)) {
            UserPartPurchaseLog userPartPurchaseLog = new UserPartPurchaseLog();
            userPartPurchaseLog.setId(Integer.valueOf(params.get("id")));
            userPartPurchaseLog.setTime(Integer.valueOf(params.get(args)));
            return userPartPurchaseLog;
        }
        return null;
    }
}
