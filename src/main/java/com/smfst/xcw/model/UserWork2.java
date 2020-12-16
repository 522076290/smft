package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author tyx
 * @DATE 2020/11/24
 */
public class UserWork2 {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**登录名*/
    @ApiModelProperty(value = "登录名")
    private String loginName;
    /**昵称*/
    @ApiModelProperty(value = "昵称")
    private String nickName;
    /**原材料容量*/
    @ApiModelProperty(value = "原材料容量")
    private Integer partCapacity;
    /**汽车容量*/
    @ApiModelProperty(value = "汽车容量")
    private Integer carCapacity;
    /**金币*/
    @ApiModelProperty(value = "金币")
    private Integer price;
    /**当前天数*/
    @ApiModelProperty(value = "当前天数")
    private String  day;
    /**灯光开启(0、关,1、开)*/
    @ApiModelProperty(value = "灯光开启(0、关,1、开)")
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getPartCapacity() {
        return partCapacity;
    }

    public void setPartCapacity(Integer partCapacity) {
        this.partCapacity = partCapacity;
    }

    public Integer getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(Integer carCapacity) {
        this.carCapacity = carCapacity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
        return "UserWork2{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", partCapacity='" + partCapacity + '\'' +
                ", carCapacity='" + carCapacity + '\'' +
                ", price='" + price + '\'' +
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
