package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author lan
 * @DATE 2020/10/11
 */
public class CarInfo {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**占地*/
    @ApiModelProperty(value = "占地")
    private Integer area;
    /**价格*/
    @ApiModelProperty(value = "价格")
    private Integer gold;
    /**维修资金*/
    @ApiModelProperty(value = "维修资金")
    private Integer repairGold;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getRepairGold() {
        return repairGold;
    }

    public void setRepairGold(Integer repairGold) {
        this.repairGold = repairGold;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "id=" + id +
                ", area=" + area +
                ", gold=" + gold +
                ", repairGold=" + repairGold +
                '}';
    }
}
