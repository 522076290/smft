package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/26
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName UserProductionLine
 *@Author lan
 *@Date 2020/10/26 15:18
 **/
public class UserProductionLine {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**学生工厂*/
    @ApiModelProperty(value = "学生工厂")
    private Integer userWorkId;
    /**当前生产工序*/
    @ApiModelProperty(value = "当前生产工序")
    private Integer stageId;
    /**生产线*/
    @ApiModelProperty(value = "生产线")
    private Integer productionLineId;
    /**状态(0、建设中,1、缺原材料,2、生产中,3、库存已满)*/
    @ApiModelProperty(value = "状态(0、建设中,1、缺原材料,2、生产中,3、库存已满)")
    private Integer type;
    /**位置(0、位置1,1、位置2,2、位置3,3、位置4)*/
    @ApiModelProperty(value = "位置(0、位置1,1、位置2,2、位置3,3、位置4)")
    private Integer position;
    /**是否AI(0、否,1、是)*/
    @ApiModelProperty(value = "是否AI(0、否,1、是)")
    private Integer isAI;

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

    @Override
    public String toString() {
        return "UserProductionLine{" +
                "id=" + id +
                ", userWorkId=" + userWorkId +
                ", stageId=" + stageId +
                ", productionLineId=" + productionLineId +
                ", type=" + type +
                ", position=" + position +
                ", isAI=" + isAI +
                '}';
    }
}
