package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;

public class SuppierList {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**供货商id*/
    @ApiModelProperty(value = "供货商id")
    private Integer suppierId;
    /**材料id*/
    @ApiModelProperty(value = "材料id")
    private Integer partId;
    /**价格*/
    @ApiModelProperty(value = "价格")
    private Integer gold;
    /**数量*/
    @ApiModelProperty(value = "数量")
    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSuppierId() {
        return suppierId;
    }

    public void setSuppierId(Integer suppierId) {
        this.suppierId = suppierId;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "SuppierList{" +
                "id=" + id +
                ", suppierId=" + suppierId +
                ", partId=" + partId +
                ", gold=" + gold +
                ", num=" + num +
                '}';
    }
}
