package com.smfst.xcw.utils;/**
 * @Author lan
 * @Date 2020/10/27
 */

import com.smfst.xcw.model.UserParts;

import java.util.Map;

/**
 *@ClassName UserPartsUtils
 *@Author lan
 *@Date 2020/10/27 17:46
 **/
public class UserPartsUtils {


    private static final String USERWORKID = "userWorkId";
    private static final String USERPRODUCTIONLINEID = "userProductionLineId";
    private static final String PARTID = "partId";
    private static final String NUM = "num";


    public static Object updateutils(Map<String,String> params, String args){

        if (USERWORKID.equals(args)){
            UserParts userParts = new UserParts();
            userParts.setId(Integer.valueOf(params.get("id")));
            userParts.setUserWorkId(Integer.valueOf(params.get(args)));
            return userParts;
        }else if(USERPRODUCTIONLINEID.equals(args)){
            UserParts userParts = new UserParts();
            userParts.setId(Integer.valueOf(params.get("id")));
            userParts.setUserProductionLineId(Integer.valueOf(params.get(args)));
            return userParts;
        }else if(PARTID.equals(args)){
            UserParts userParts = new UserParts();
            userParts.setId(Integer.valueOf(params.get("id")));
            userParts.setPartId(Integer.valueOf(params.get(args)));
            return userParts;
        }else if(NUM.equals(args)){
            UserParts userParts = new UserParts();
            userParts.setId(Integer.valueOf(params.get("id")));
            userParts.setNum(Integer.valueOf(params.get(args)));
            return userParts;
        }
        return null;

    }
    
}
