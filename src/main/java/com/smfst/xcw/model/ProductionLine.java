package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/14
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName ProductionLine
 *@Author lan
 *@Date 2020/10/14 16:16
 **/
public class ProductionLine {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**生产线名称*/
    @ApiModelProperty(value = "生产线名称")
    private String  productionLineName;
    /**生产线描述*/
    @ApiModelProperty(value = "生产线描述")
    private String  content;
    /**车型*/
    @ApiModelProperty(value = "车型")
    private Integer carId;

    public ProductionLine() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductionLineName() {
        return productionLineName;
    }

    public void setProductionLineName(String productionLineName) {
        this.productionLineName = productionLineName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "ProductionLine{" +
                "id=" + id +
                ", productionLineName='" + productionLineName + '\'' +
                ", content='" + content + '\'' +
                ", carId=" + carId +
                '}';
    }
}
