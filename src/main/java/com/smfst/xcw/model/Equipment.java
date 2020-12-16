package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Description
 * @Author  tyx
 * @Date 2020-12-2
 */

public class Equipment {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键" )
    private Integer id;

    /**
     * 设备名称
     */
    @ApiModelProperty(value = "设备名称" )
    private String equipmentName;
    /**
     * 设备描述
     */
    @ApiModelProperty(value = "设备描述" )
    private String content;
    /**
     * 耐久
     */
    @ApiModelProperty(value = "耐久" )
    private Integer hp;
    /**
     * 类型
     */
    @ApiModelProperty(value = "类型" )
    private Integer type;
    /**
     * 价格
     */
    @ApiModelProperty(value = "价格" )
    private Integer price;

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", equipmentName='" + equipmentName + '\'' +
                ", content='" + content + '\'' +
                ", hp=" + hp +
                ", type=" + type +
                ", price=" + price +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }
}
