package com.smfst.xcw.utils;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.UserProductionLine;

import java.util.Map;

/**
 *@ClassName UserProductionLineUtils
 *@Author lan
 *@Date 2020/10/26 10:57
 **/
public class UserProductionLineUtils {

    private static final String USERWORKID = "userWorkId";
    private static final String STAGEID = "stageId";
    private static final String PRODUCTIONLINEID = "productionLineId";
    private static final String TYPE = "type";
    private static final String POSITION = "position";
    private static final String ISAI = "isAI";


    public static Object updateutils(Map<String,String> params, String args){

        if (USERWORKID.equals(args)){
            UserProductionLine userProductionLine = new UserProductionLine();
            userProductionLine.setId(Integer.valueOf(params.get("id")));
            userProductionLine.setUserWorkId(Integer.valueOf(params.get(args)));
            return userProductionLine;
        }else if(STAGEID.equals(args)){
            UserProductionLine userProductionLine = new UserProductionLine();
            userProductionLine.setId(Integer.valueOf(params.get("id")));
            userProductionLine.setStageId(Integer.valueOf(params.get(args)));
            return userProductionLine;
        }else if(PRODUCTIONLINEID.equals(args)){
            UserProductionLine userProductionLine = new UserProductionLine();
            userProductionLine.setId(Integer.valueOf(params.get("id")));
            userProductionLine.setProductionLineId(Integer.valueOf(params.get(args)));
            return userProductionLine;
        }else if(TYPE.equals(args)){
            UserProductionLine userProductionLine = new UserProductionLine();
            userProductionLine.setId(Integer.valueOf(params.get("id")));
            userProductionLine.setType(Integer.valueOf(params.get(args)));
            return userProductionLine;
        }else if(POSITION.equals(args)){
            UserProductionLine userProductionLine = new UserProductionLine();
            userProductionLine.setId(Integer.valueOf(params.get("id")));
            userProductionLine.setPosition(Integer.valueOf(params.get(args)));
            return userProductionLine;
        }else if(ISAI.equals(args)){
            UserProductionLine userProductionLine = new UserProductionLine();
            userProductionLine.setId(Integer.valueOf(params.get("id")));
            userProductionLine.setIsAI(Integer.valueOf(params.get(args)));
            return userProductionLine;
        }
        return null;

    }
}
