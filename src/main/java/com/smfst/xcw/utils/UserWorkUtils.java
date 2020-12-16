package com.smfst.xcw.utils;

import com.smfst.xcw.model.UserWork;
import com.smfst.xcw.model.UserWorkEnvironmental;
import com.smfst.xcw.model.UserWorkEnvironmentalLog;
import com.smfst.xcw.model.UserWorkInfo;

import java.util.Map;

/**
 * @Author lan
 * @DATE 2020/10/13
 */
public class UserWorkUtils {
    /**
     * UserWorkEnvironmentalLog
     */
    private static final String USERWORKID = "userWorkId";
    private static final String DAY = "day";
    private static final String LIGHTSWITCH = "lightSwitch";
    private static final String ACONOFF = "acOnOff";
    private static final String BEAM = "beam";
    private static final String WORKSHOPTEMP = "workshopTemp";
    private static final String OUTTEMP = "outTemp";
    private static final String POWER = "power";
    private static final String POWERCONSUME = "powerConsume";
    private static final String TIME = "time";
    /**
     * UserWork
     */
    private static final String NICKNAME = "nickName";
    /**
     * UserWorkInfo
     */
    private static final String PARTCAPACITY = "partCapacity";
    private static final String CARCAPACITY = "carCapacity";
    private static final String PRICE = "price";

    /**
     * UserWorkEnvironmental
     */
    private static final String DAY1 = "day1";
    private static final String LIGHTSWITCH1 = "lightSwitch1";
    private static final String ACONOFF1 = "acOnOff1";
    private static final String BEAM1 = "beam1";
    private static final String WORKSHOPTEMP1 = "workshopTemp1";
    private static final String OUTTEMP1 = "outTemp1";
    private static final String POWER1 = "power1";
    private static final String POWERCONSUME1 = "powerConsume1";
    private static final String TIME1 = "time1";



    public static Object updateutils( Map<String,String> params, String args){

        if (USERWORKID.equals(args)){
            UserWorkEnvironmentalLog userWorkEnvironmentalLog = new UserWorkEnvironmentalLog();
            userWorkEnvironmentalLog.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmentalLog.setDay(params.get(args));
            return userWorkEnvironmentalLog;
        }else if(DAY.equals(args)){
            UserWorkEnvironmentalLog userWorkEnvironmentalLog = new UserWorkEnvironmentalLog();
            userWorkEnvironmentalLog.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmentalLog.setUserWorkId(params.get(args));
            return userWorkEnvironmentalLog;
        }else if(LIGHTSWITCH.equals(args)){
            UserWorkEnvironmentalLog userWorkEnvironmentalLog = new UserWorkEnvironmentalLog();
            userWorkEnvironmentalLog.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmentalLog.setLightSwitch(params.get(args));
            return userWorkEnvironmentalLog;
        }else if(ACONOFF.equals(args)){
            UserWorkEnvironmentalLog userWorkEnvironmentalLog = new UserWorkEnvironmentalLog();
            userWorkEnvironmentalLog.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmentalLog.setAcOnOff(params.get(args));
            return userWorkEnvironmentalLog;
        }else if(BEAM.equals(args)){
            UserWorkEnvironmentalLog userWorkEnvironmentalLog = new UserWorkEnvironmentalLog();
            userWorkEnvironmentalLog.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmentalLog.setBeam(params.get(args));
            return userWorkEnvironmentalLog;
        }else if(WORKSHOPTEMP.equals(args)){
            UserWorkEnvironmentalLog userWorkEnvironmentalLog = new UserWorkEnvironmentalLog();
            userWorkEnvironmentalLog.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmentalLog.setWorkshopTemp(params.get(args));
            return userWorkEnvironmentalLog;
        }else if(OUTTEMP.equals(args)){
            UserWorkEnvironmentalLog userWorkEnvironmentalLog = new UserWorkEnvironmentalLog();
            userWorkEnvironmentalLog.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmentalLog.setOutTemp(params.get(args));
            return userWorkEnvironmentalLog;
        }else if(POWER.equals(args)){
            UserWorkEnvironmentalLog userWorkEnvironmentalLog = new UserWorkEnvironmentalLog();
            userWorkEnvironmentalLog.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmentalLog.setPower(params.get(args));
            return userWorkEnvironmentalLog;
        }else if(POWERCONSUME.equals(args)){
            UserWorkEnvironmentalLog userWorkEnvironmentalLog = new UserWorkEnvironmentalLog();
            userWorkEnvironmentalLog.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmentalLog.setPowerConsume(params.get(args));
            return userWorkEnvironmentalLog;
        }else if(TIME.equals(args)){
            UserWorkEnvironmentalLog userWorkEnvironmentalLog = new UserWorkEnvironmentalLog();
            userWorkEnvironmentalLog.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmentalLog.setTime(params.get(args));
            return userWorkEnvironmentalLog;
        }else if(NICKNAME.equals(args)){
            UserWork userWork = new UserWork();
            userWork.setId(Integer.valueOf(params.get("id")));
            userWork.setNickName(params.get(args));
            return userWork;
        }else if(PARTCAPACITY.equals(args)){
            UserWorkInfo userWorkInfo = new UserWorkInfo();
            userWorkInfo.setId(Integer.valueOf(params.get("id")));
            userWorkInfo.setPartCapacity(Integer.valueOf(params.get(args)));
            return userWorkInfo;
        }else if(CARCAPACITY.equals(args)){
            UserWorkInfo userWorkInfo = new UserWorkInfo();
            userWorkInfo.setId(Integer.valueOf(params.get("id")));
            userWorkInfo.setCarCapacity(Integer.valueOf(params.get(args)));
            return userWorkInfo;
        }else if(PRICE.equals(args)){
            UserWorkInfo userWorkInfo = new UserWorkInfo();
            userWorkInfo.setId(Integer.valueOf(params.get("id")));
            userWorkInfo.setPrice(Integer.valueOf(params.get(args)));
            return userWorkInfo;
        }else if(DAY1.equals(args)){
            UserWorkEnvironmental userWorkEnvironmental = new UserWorkEnvironmental();
            userWorkEnvironmental.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmental.setDay(params.get("day"));
            return userWorkEnvironmental;
        }else if(LIGHTSWITCH1.equals(args)){
            UserWorkEnvironmental userWorkEnvironmental = new UserWorkEnvironmental();
            userWorkEnvironmental.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmental.setLightSwitch(params.get("lightSwitch"));
            return userWorkEnvironmental;
        }else if(ACONOFF1.equals(args)){
            UserWorkEnvironmental userWorkEnvironmental = new UserWorkEnvironmental();
            userWorkEnvironmental.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmental.setAcOnOff(params.get("acOnOff"));
            return userWorkEnvironmental;
        }else if(BEAM1.equals(args)){
            UserWorkEnvironmental userWorkEnvironmental = new UserWorkEnvironmental();
            userWorkEnvironmental.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmental.setBeam(params.get("day"));
            return userWorkEnvironmental;
        }else if(WORKSHOPTEMP1.equals(args)){
            UserWorkEnvironmental userWorkEnvironmental = new UserWorkEnvironmental();
            userWorkEnvironmental.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmental.setWorkshopTemp(params.get("workshopTemp"));
            return userWorkEnvironmental;
        }else if(OUTTEMP1.equals(args)){
            UserWorkEnvironmental userWorkEnvironmental = new UserWorkEnvironmental();
            userWorkEnvironmental.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmental.setOutTemp(params.get("outTemp"));
            return userWorkEnvironmental;
        }else if(POWER1.equals(args)){
            UserWorkEnvironmental userWorkEnvironmental = new UserWorkEnvironmental();
            userWorkEnvironmental.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmental.setPower(params.get("power"));
            return userWorkEnvironmental;
        }else if(POWERCONSUME1.equals(args)){
            UserWorkEnvironmental userWorkEnvironmental = new UserWorkEnvironmental();
            userWorkEnvironmental.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmental.setPowerConsume(params.get("powerConsume"));
            return userWorkEnvironmental;
        }else if(TIME1.equals(args)){
            UserWorkEnvironmental userWorkEnvironmental = new UserWorkEnvironmental();
            userWorkEnvironmental.setId(Integer.valueOf(params.get("id")));
            userWorkEnvironmental.setTime(params.get("time"));
            return userWorkEnvironmental;
        }
        return null;

    }
}
