package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

/**
 * @Description
 * @Author  tyx
 * @Date 2020-11-26
 */
public class UserPlStep2 {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键" )
    private Integer id;

    /**
     * 学生工厂
     */
    @ApiModelProperty(value = "学生工厂" )
    private Integer userWorkId;

    /**
     * 学生生产线
     */
    @ApiModelProperty(value = "学生生产线" )
    private Integer userProductionLineId;

    /**
     * 下一个学生生产环节
     */
    @ApiModelProperty(value = "下一个学生生产环节" )
    private Integer nextUserPlStepId;
    /**
     * 生产环节名称
     */
    @ApiModelProperty(value = "生产环节名称" )
    private String plStepName;

    /**
     * 生产工序
     */
    @ApiModelProperty(value = "生产工序" )
    private Integer stageId;

    /**
     * 耗时
     */
    @ApiModelProperty(value = "耗时" )
    private Integer costTime;

    /**
     * 步骤
     */
    @ApiModelProperty(value = "步骤" )
    private Integer step;

    /**
     * 耐久
     */
    @ApiModelProperty(value = "耐久" )
    private Integer power;

    /**
     * 生产所耗
     */
    @ApiModelProperty(value = "生产所耗" )
    private Integer consume;
    /**工厂名称*/
    @ApiModelProperty(value = "工厂名称")
    private String stageName;
    /**
     * 下一生产环节名称
     */
    @ApiModelProperty(value = "下一生产环节名称" )
    private String plStepName1;

    public String getPlStepName1() {
        return plStepName1;
    }

    public void setPlStepName1(String plStepName1) {
        this.plStepName1 = plStepName1;
    }

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

    public Integer getNextUserPlStepId() {
        return nextUserPlStepId;
    }

    public void setNextUserPlStepId(Integer nextUserPlStepId) {
        this.nextUserPlStepId = nextUserPlStepId;
    }

    public String getPlStepName() {
        return plStepName;
    }

    public void setPlStepName(String plStepName) {
        this.plStepName = plStepName;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getConsume() {
        return consume;
    }

    public void setConsume(Integer consume) {
        this.consume = consume;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    @Override
    public String toString() {
        return "UserPlStep2{" +
                "id=" + id +
                ", userWorkId=" + userWorkId +
                ", userProductionLineId=" + userProductionLineId +
                ", nextUserPlStepId=" + nextUserPlStepId +
                ", plStepName=" + plStepName +
                ", stageId=" + stageId +
                ", costTime=" + costTime +
                ", step=" + step +
                ", power=" + power +
                ", consume=" + consume +
                ", stageName='" + stageName + '\'' +
                ", nextplStepName=" + plStepName1 +
                '}';
    }
}
