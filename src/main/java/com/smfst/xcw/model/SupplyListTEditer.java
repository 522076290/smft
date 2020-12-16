package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;

public class SupplyListTEditer {

    /**
     * id : 93
     * supplyId : 5
     * materialId : 15
     * price : 3890
     * costTime : 7
     * num : 6
     * lastUpdateTime : 1568012522
     * supplyName : 天辉汽车配件
     * materialName : SUV底盘
     */
    /**主键*/
    @ApiModelProperty(value = "主键")
    private int id;
    /**供货商id*/
    @ApiModelProperty(value = "供货商id")
    private int suppierId;
    /**材料id*/
    @ApiModelProperty(value = "材料id")
    private int partId;
    /**价格*/
    @ApiModelProperty(value = "价格")
    private int gold;
    /**运输时间*/
    @ApiModelProperty(value = "运输时间")
    private int costTime;
    /**数量*/
    @ApiModelProperty(value = "数量")
    private int num;
    /**供货商名称*/
    @ApiModelProperty(value = "供货商名称")
    private String suppierName;
    /**材料名称*/
    @ApiModelProperty(value = "材料名称")
    private String partName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSuppierId() {
        return suppierId;
    }

    public void setSuppierId(int suppierId) {
        this.suppierId = suppierId;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getCostTime() {
        return costTime;
    }

    public void setCostTime(int costTime) {
        this.costTime = costTime;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSupplyName() {
        return suppierName;
    }

    public void setSupplyName(String suppierName) {
        this.suppierName = suppierName;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    @Override
    public String toString() {
        return "supplyListTEditer{" +
                "id=" + id +
                ", suppierId=" + suppierId +
                ", partId=" + partId +
                ", gold=" + gold +
                ", costTime=" + costTime +
                ", num=" + num +
                ", supplyName='" + suppierName + '\'' +
                ", partName='" + partName + '\'' +
                '}';
    }
}
