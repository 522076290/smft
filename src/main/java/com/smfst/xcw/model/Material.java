package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;

public class Material {

    /**
     * id : 26
     * materialName : MPV方向盘
     * content : 新星汽车配件供货商
     * size : 1
     * icon : UI_fangxiangpan02
     * lastUpdateTime : 1568009900
     * supplyId : 1
     * materialId : 26
     * price : 1100
     * num : 2
     * costTime : 3
     * supplyName : 新星汽车配件
     * supplyListId : 1
     */
    @ApiModelProperty(value = "主键")
    private int partId;
    @ApiModelProperty(value = "材料名称")
    private String partName;
    @ApiModelProperty(value = "供货商介绍")
    private String content;
    @ApiModelProperty(value = "占地")
    private int area;
    @ApiModelProperty(value = "图标")
    private String icon;
    @ApiModelProperty(value = "最后更新时间")
    private int lastUpdateTime;
    @ApiModelProperty(value = "供货商id")
    private int suppierId;
    @ApiModelProperty(value = "价格")
    private int gold;
    @ApiModelProperty(value = "数量")
    private int num;
    @ApiModelProperty(value = "运输时间")
    private int costTime;
    @ApiModelProperty(value = "供货商名称")
    private String suppierName;
    @ApiModelProperty(value = "供货列表id")
    private int id;

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(int lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public int getSuppierId() {
        return suppierId;
    }

    public void setSuppierId(int suppierId) {
        this.suppierId = suppierId;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCostTime() {
        return costTime;
    }

    public void setCostTime(int costTime) {
        this.costTime = costTime;
    }

    public String getSuppierName() {
        return suppierName;
    }

    public void setSuppierName(String suppierName) {
        this.suppierName = suppierName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Material{" +
                "partId=" + partId +
                ", partName='" + partName + '\'' +
                ", content='" + content + '\'' +
                ", area=" + area +
                ", icon='" + icon + '\'' +
                ", lastUpdateTime=" + lastUpdateTime +
                ", suppierId=" + suppierId +
                ", gold=" + gold +
                ", num=" + num +
                ", costTime=" + costTime +
                ", suppierName='" + suppierName + '\'' +
                ", id=" + id +
                '}';
    }
}
