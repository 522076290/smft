package com.smfst.xcw.utils;/**
 * @Author lan
 * @Date 2020/10/28
 */

import com.smfst.xcw.model.UserPartLog;

import java.util.Map;

/**
 *@ClassName UserPartLogUtils
 *@Author lan
 *@Date 2020/10/28 9:42
 **/
public class UserPartLogUtils {

    private static final String USERWORKID = "userWorkId";
    private static final String SUPPIERLISTID = "suppierListId";
    private static final String NUM = "num";
    private static final String TIME = "time";
    private static final String GOLD = "gold";

    public static Object updateutils(Map<String,String> params, String args){

        if (USERWORKID.equals(args)){
            UserPartLog userPartLog = new UserPartLog();
            userPartLog.setId(Integer.valueOf(params.get("id")));
            userPartLog.setUserWorkId(Integer.valueOf(params.get(args)));
            return userPartLog;
        }else if(SUPPIERLISTID.equals(args)){
            UserPartLog userPartLog = new UserPartLog();
            userPartLog.setId(Integer.valueOf(params.get("id")));
            userPartLog.setSuppierListId(Integer.valueOf(params.get(args)));
            return userPartLog;
        }else if(TIME.equals(args)){
            UserPartLog userPartLog = new UserPartLog();
            userPartLog.setId(Integer.valueOf(params.get("id")));
            userPartLog.setTime(params.get(args));
            return userPartLog;
        }else if(NUM.equals(args)){
            UserPartLog userPartLog = new UserPartLog();
            userPartLog.setId(Integer.valueOf(params.get("id")));
            userPartLog.setNum(Integer.valueOf(params.get(args)));
            return userPartLog;
        }else if(GOLD.equals(args)){
            UserPartLog userPartLog = new UserPartLog();
            userPartLog.setId(Integer.valueOf(params.get("id")));
            userPartLog.setGold(Integer.valueOf(params.get(args)));
            return userPartLog;
        }
        return null;

    }
}
