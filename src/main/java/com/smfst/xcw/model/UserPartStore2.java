package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author tyx
 * @DATE 2020/11/27
 */
public class UserPartStore2 {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**学生工厂*/
    @ApiModelProperty(value = "学生工厂")
    private Integer userWorkId;
    /**学生生产线*/
    @ApiModelProperty(value = "学生生产线")
    private String ProductionLineName;
    /**原材料数量*/
    @ApiModelProperty(value = "原材料数量")
    private String partName;
    /**数量*/
    @ApiModelProperty(value = "数量")
    private Integer num;
    /**学生生产线*/
    @ApiModelProperty(value = "学生生产线id")
    private Integer userProductionLineId;
    /**原材料*/
    @ApiModelProperty(value = "原材料id")
    private Integer partId;
    /**生产线id*/
    @ApiModelProperty(value = "生产线id")
    private Integer productionLineId;

    public Integer getProductionLineId() {
        return productionLineId;
    }

    public void setProductionLineId(Integer productionLineId) {
        this.productionLineId = productionLineId;
    }

    @Override
    public String toString() {
        return "UserParts2{" +
                "id=" + id +
                ", userWorkId=" + userWorkId +
                ", ProductionLineName='" + ProductionLineName + '\'' +
                ", partName='" + partName + '\'' +
                ", num=" + num +
                ", userProductionLineId=" + userProductionLineId +
                ", partId=" + partId +
                ", productionLineId=" + productionLineId +
                '}';
    }

    public String getProductionLineName() {
        return ProductionLineName;
    }

    public void setProductionLineName(String productionLineName) {
        ProductionLineName = productionLineName;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserProductionLineId() {
        return userProductionLineId;
    }

    public void setUserProductionLineId(Integer userProductionLineId) {
        this.userProductionLineId = userProductionLineId;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
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

    public String getUserProductionLineName() {
        return ProductionLineName;
    }

    public void setUserProductionLineName(String userProductionLineName) {
        this.ProductionLineName = userProductionLineName;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

}
