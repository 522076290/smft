package com.smfst.xcw.utils;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.UserInPriceLog;

import java.util.Map;

/**
 *@ClassName UserInPriceUtils
 *@Author lan
 *@Date 2020/10/26 10:57
 **/
public class UserInPriceUtils {

    private static final String USERWORKID = "userWorkId";
    private static final String PRICE = "price";
    private static final String ENDPRICE = "endPrice";
    private static final String TIME = "time";
    private static final String TYPE = "type";


    public static Object updateutils(Map<String,String> params, String args){

        if (USERWORKID.equals(args)){
            UserInPriceLog userInPriceLog = new UserInPriceLog();
            userInPriceLog.setId(Integer.valueOf(params.get("id")));
            userInPriceLog.setUserWorkId(Integer.valueOf(params.get(args)));
            return userInPriceLog;
        }else if(PRICE.equals(args)){
            UserInPriceLog userInPriceLog = new UserInPriceLog();
            userInPriceLog.setId(Integer.valueOf(params.get("id")));
            userInPriceLog.setPrice(Integer.valueOf(params.get(args)));
            return userInPriceLog;
        }else if(ENDPRICE.equals(args)){
            UserInPriceLog userInPriceLog = new UserInPriceLog();
            userInPriceLog.setId(Integer.valueOf(params.get("id")));
            userInPriceLog.setEndPrice(Integer.valueOf(params.get(args)));
            return userInPriceLog;
        }else if(TIME.equals(args)){
            UserInPriceLog userInPriceLog = new UserInPriceLog();
            userInPriceLog.setId(Integer.valueOf(params.get("id")));
            userInPriceLog.setTime(params.get(args));
            return userInPriceLog;
        }else if(TYPE.equals(args)){
            UserInPriceLog userInPriceLog = new UserInPriceLog();
            userInPriceLog.setId(Integer.valueOf(params.get("id")));
            userInPriceLog.setType(Integer.valueOf(params.get(args)));
            return userInPriceLog;
        }
        return null;

    }
}
