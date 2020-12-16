package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName UserNormalCarLog
 * @Author lan
 * @Date 2020/11/4 23:47
 **/
public class UserNormalCarLog {

    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**学生工厂*/
    @ApiModelProperty(value = "学生工厂")
    private Integer userWorkId;
    /**学生生产线*/
    @ApiModelProperty(value = "学生生产线")
    private Integer userProductionLineId;
    /**汽车*/
    @ApiModelProperty(value = "汽车")
    private Integer carId;
    /**时间*/
    @ApiModelProperty(value = "时间")
    private Integer time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserWorkId() {
        return userWorkId;
    }

    public void setUserWorkId(Integer userWorkId) {
        this.userWorkId = userWorkId;
    }

    public Integer getUserProductionLineId() {
        return userProductionLineId;
    }

    public void setUserProductionLineId(Integer userProductionLineId) {
        this.userProductionLineId = userProductionLineId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "UserNormalCarLog{" +
                "id=" + id +
                ", userWorkId=" + userWorkId +
                ", userProductionLineId=" + userProductionLineId +
                ", carId=" + carId +
                ", time=" + time +
                '}';
    }
}
