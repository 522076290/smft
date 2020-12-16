package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/23
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName PassRate
 *@Author lan
 *@Date 2020/10/23 15:07
 **/
public class PassRate {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**名称*/
    @ApiModelProperty(value = "名称")
    private String passRateName;
    /**描述*/
    @ApiModelProperty(value = "描述")
    private String content;
    /**车辆*/
    @ApiModelProperty(value = "车辆")
    private Integer carId;
    /**合格率*/
    @ApiModelProperty(value = "合格率")
    private Integer rate;
    /**维修时间*/
    @ApiModelProperty(value = "维修时间")
    private Integer costTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassRateName() {
        return passRateName;
    }

    public void setPassRateName(String passRateName) {
        this.passRateName = passRateName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    @Override
    public String toString() {
        return "PassRate{" +
                "id=" + id +
                ", passRateName='" + passRateName + '\'' +
                ", content='" + content + '\'' +
                ", carId=" + carId +
                ", rate=" + rate +
                ", costTime=" + costTime +
                '}';
    }
}
