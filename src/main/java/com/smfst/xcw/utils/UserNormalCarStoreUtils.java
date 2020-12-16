package com.smfst.xcw.utils;

import com.smfst.xcw.model.UserNormalCarStore;

import java.util.Map;

/**
 * @ClassName UserNormalCarStoreUtils
 * @Author lan
 * @Date 2020/11/4 17:48
 **/
public class UserNormalCarStoreUtils {


    private static final String USERWORKID = "userWorkId";
    private static final String USERPRODUCTIONLINEID = "userProductionLineId";
    private static final String CARID = "carId";
    private static final String NUM = "num";

    public static Object updateutils(Map<String,String> params, String args){

        if (USERWORKID.equals(args)){
            UserNormalCarStore userNormalCarStore = new UserNormalCarStore();
            userNormalCarStore.setId(Integer.valueOf(params.get("id")));
            userNormalCarStore.setUserWorkId(Integer.valueOf(params.get(args)));
            return userNormalCarStore;
        }else if(USERPRODUCTIONLINEID.equals(args)){
            UserNormalCarStore userNormalCarStore = new UserNormalCarStore();
            userNormalCarStore.setId(Integer.valueOf(params.get("id")));
            userNormalCarStore.setUserProductionLineId(Integer.valueOf(params.get(args)));
            return userNormalCarStore;
        }else if(CARID.equals(args)){
            UserNormalCarStore userNormalCarStore = new UserNormalCarStore();
            userNormalCarStore.setId(Integer.valueOf(params.get("id")));
            userNormalCarStore.setCarId(Integer.valueOf(params.get(args)));
            return userNormalCarStore;
        }else if(NUM.equals(args)){
            UserNormalCarStore userNormalCarStore = new UserNormalCarStore();
            userNormalCarStore.setId(Integer.valueOf(params.get("id")));
            userNormalCarStore.setNum(Integer.valueOf(params.get(args)));
            return userNormalCarStore;
        }
        return null;

    }
}
