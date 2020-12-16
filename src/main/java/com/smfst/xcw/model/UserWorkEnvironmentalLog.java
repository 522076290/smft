package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author lan
 * @DATE 2020/10/12
 */

public class UserWorkEnvironmentalLog {

    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**学生工厂*/
    @ApiModelProperty(value = "学生工厂")
    private String  userWorkId;
    /**当前天数*/
    @ApiModelProperty(value = "当前天数")
    private String  day;
    /**灯光开启(0,关,1,开)*/
    @ApiModelProperty(value = "灯光开启(0,关,1,开)")
    private String  lightSwitch;
    /**空调开关(0,关,1,冷风,2,暖风)*/
    @ApiModelProperty(value = "空调开关(0,关,1,冷风,2,暖风)")
    private String  acOnOff;
    /**光照*/
    @ApiModelProperty(value = "光照")
    private String  beam;
    /**车间温度*/
    @ApiModelProperty(value = "车间温度")
    private String  workshopTemp;
    /**室外温度*/
    @ApiModelProperty(value = "室外温度")
    private String  outTemp;
    /**电力供应*/
    @ApiModelProperty(value = "电力供应")
    private String  power;
    /**电力消耗*/
    @ApiModelProperty(value = "电力消耗")
    private String  powerConsume;
    /**时间*/
    @ApiModelProperty(value = "时间")
    private String  time;

    public UserWorkEnvironmentalLog() {}

    public UserWorkEnvironmentalLog(Integer id, String userWorkId) {
        this.id = id;
        this.userWorkId = userWorkId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserWorkId() {
        return userWorkId;
    }

    public void setUserWorkId(String userWorkId) {
        this.userWorkId = userWorkId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLightSwitch() {
        return lightSwitch;
    }

    public void setLightSwitch(String lightSwitch) {
        this.lightSwitch = lightSwitch;
    }

    public String getAcOnOff() {
        return acOnOff;
    }

    public void setAcOnOff(String acOnOff) {
        this.acOnOff = acOnOff;
    }

    public String getBeam() {
        return beam;
    }

    public void setBeam(String beam) {
        this.beam = beam;
    }

    public String getWorkshopTemp() {
        return workshopTemp;
    }

    public void setWorkshopTemp(String workshopTemp) {
        this.workshopTemp = workshopTemp;
    }

    public String getOutTemp() {
        return outTemp;
    }

    public void setOutTemp(String outTemp) {
        this.outTemp = outTemp;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPowerConsume() {
        return powerConsume;
    }

    public void setPowerConsume(String powerConsume) {
        this.powerConsume = powerConsume;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "UserWorkEnvironmentalLog{" +
                "id=" + id +
                ", userWorkId='" + userWorkId + '\'' +
                ", day='" + day + '\'' +
                ", lightSwitch='" + lightSwitch + '\'' +
                ", acOnOff='" + acOnOff + '\'' +
                ", beam='" + beam + '\'' +
                ", workshopTemp='" + workshopTemp + '\'' +
                ", outTemp='" + outTemp + '\'' +
                ", power='" + power + '\'' +
                ", powerConsume='" + powerConsume + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
