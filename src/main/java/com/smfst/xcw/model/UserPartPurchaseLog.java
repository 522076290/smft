package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/28
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName UserPartPurchaseLog
 *@Author lan
 *@Date 2020/10/28 10:04
 **/
public class UserPartPurchaseLog {

    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**学生工厂*/
    @ApiModelProperty(value = "学生工厂")
    private Integer userWorkId;
    /**学生生产线*/
    @ApiModelProperty(value = "学生生产线")
    private Integer userProductionLineId;
    /**生产工序*/
    @ApiModelProperty(value = "生产工序")
    private Integer userStageId;
    /**原材料*/
    @ApiModelProperty(value = "原材料")
    private Integer PartId;
    /**数量*/
    @ApiModelProperty(value = "数量")
    private Integer num;
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

    public Integer getUserStageId() {
        return userStageId;
    }

    public void setUserStageId(Integer userStageId) {
        this.userStageId = userStageId;
    }

    public Integer getPartId() {
        return PartId;
    }

    public void setPartId(Integer partId) {
        PartId = partId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "UserPartPurchaseLog{" +
                "id=" + id +
                ", userWorkId=" + userWorkId +
                ", userProductionLineId=" + userProductionLineId +
                ", userStageId=" + userStageId +
                ", PartId=" + PartId +
                ", num=" + num +
                ", time=" + time +
                '}';
    }
}
