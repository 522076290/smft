package com.smfst.xcw.utils;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.UserOutPriceLog;

import java.util.Map;

/**
 *@ClassName UserOutPriceUtils
 *@Author lan
 *@Date 2020/10/26 10:57
 **/
public class UserOutPriceUtils {

    private static final String USERWORKID = "userWorkId";
    private static final String PRICE = "price";
    private static final String ENDPRICE = "endPrice";
    private static final String TIME = "time";
    private static final String TYPE = "type";


    public static Object updateutils(Map<String,String> params, String args){

        if (USERWORKID.equals(args)){
            UserOutPriceLog userOutPriceLog = new UserOutPriceLog();
            userOutPriceLog.setId(Integer.valueOf(params.get("id")));
            userOutPriceLog.setUserWorkId(Integer.valueOf(params.get(args)));
            return userOutPriceLog;
        }else if(PRICE.equals(args)){
            UserOutPriceLog userOutPriceLog = new UserOutPriceLog();
            userOutPriceLog.setId(Integer.valueOf(params.get("id")));
            userOutPriceLog.setPrice(Integer.valueOf(params.get(args)));
            return userOutPriceLog;
        }else if(ENDPRICE.equals(args)){
            UserOutPriceLog userOutPriceLog = new UserOutPriceLog();
            userOutPriceLog.setId(Integer.valueOf(params.get("id")));
            userOutPriceLog.setEndPrice(Integer.valueOf(params.get(args)));
            return userOutPriceLog;
        }else if(TIME.equals(args)){
            UserOutPriceLog userOutPriceLog = new UserOutPriceLog();
            userOutPriceLog.setId(Integer.valueOf(params.get("id")));
            userOutPriceLog.setTime(params.get(args));
            return userOutPriceLog;
        }else if(TYPE.equals(args)){
            UserOutPriceLog userOutPriceLog = new UserOutPriceLog();
            userOutPriceLog.setId(Integer.valueOf(params.get("id")));
            userOutPriceLog.setType(Integer.valueOf(params.get(args)));
            return userOutPriceLog;
        }
        return null;

    }
}
