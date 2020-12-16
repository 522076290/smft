package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author lan
 * @DATE 2020/10/10
 */
public class Car {

    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**车型描述*/
    @ApiModelProperty(value = "车型描述")
    private String content;
    /**车型名称*/
    @ApiModelProperty(value = "车型名称")
    private String carName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", carName='" + carName + '\'' +
                '}';
    }
}
