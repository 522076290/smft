package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/14
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName ProductionLineInfo
 *@Author lan
 *@Date 2020/10/14 16:49
 **/
public class ProductionLineInfo {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**价格*/
    @ApiModelProperty(value = "价格")
    private Integer gold;
    /**第一个生产工序*/
    @ApiModelProperty(value = "第一个生产工序")
    private Integer stageId;
    /**需要能源量*/
    @ApiModelProperty(value = "需要能源量")
    private Integer needEnergyNum;
    /**容量*/
    @ApiModelProperty(value = "容量")
    private Integer capacity;

    public ProductionLineInfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public Integer getNeedEnergyNum() {
        return needEnergyNum;
    }

    public void setNeedEnergyNum(Integer needEnergyNum) {
        this.needEnergyNum = needEnergyNum;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }


    @Override
    public String toString() {
        return "ProductionLineInfo{" +
                "id=" + id +
                ", gold=" + gold +
                ", stageId=" + stageId +
                ", needEnergyNum=" + needEnergyNum +
                ", capacity=" + capacity +
                '}';
    }
}
