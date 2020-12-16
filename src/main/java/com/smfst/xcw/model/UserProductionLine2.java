package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author tyx
 * @DATE 2020/11/25
 */
public class UserProductionLine2 {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**当前生产环节*/
    @ApiModelProperty(value = "当前生产环节")
    private String plStepName;
    /**当前生产环节id*/
    @ApiModelProperty(value = "当前生产环节id")
    private Integer stageId;
    /**生产线名称id*/
    @ApiModelProperty(value = "生产线名称id")
    private String productionLineName;
    /**生产线名称*/
    @ApiModelProperty(value = "生产线名称")
    private Integer productionLineId;
    /**状态*/
    @ApiModelProperty(value = "状态")
    private Integer type;
    /**位置*/
    @ApiModelProperty(value = "位置")
    private Integer position;
    /**是否AI*/
    @ApiModelProperty(value = "是否AI")
    private Integer isAI;

    @Override
    public String toString() {
        return "UserProductionLine2{" +
                "id=" + id +
                ", plStepName='" + plStepName + '\'' +
                ", stageId=" + stageId +
                ", productionLineName='" + productionLineName + '\'' +
                ", productionLineId=" + productionLineId +
                ", type=" + type +
                ", position=" + position +
                ", isAI=" + isAI +
                '}';
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public Integer getProductionLineId() {
        return productionLineId;
    }

    public void setProductionLineId(Integer productionLineId) {
        this.productionLineId = productionLineId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlStepName() {
        return plStepName;
    }

    public void setPlStepName(String plStepName) {
        this.plStepName = plStepName;
    }

    public String getProductionLineName() {
        return productionLineName;
    }

    public void setProductionLineName(String productionLineName) {
        this.productionLineName = productionLineName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getIsAI() {
        return isAI;
    }

    public void setIsAI(Integer isAI) {
        this.isAI = isAI;
    }

}
