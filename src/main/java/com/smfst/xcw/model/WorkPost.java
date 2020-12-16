package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/20
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName WorkPost
 *@Author lan
 *@Date 2020/10/20 18:29
 **/
public class WorkPost {

    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**岗位名称*/
    @ApiModelProperty(value = "岗位名称")
    private String  workPostName;
    /**生产线*/
    @ApiModelProperty(value = "生产线")
    private Integer productionLineInfold;
    /**工作类型(0、工程师,1、工人,3、检测人员)*/
    @ApiModelProperty(value = "工作类型(0、工程师,1、工人,3、检测人员)")
    private Integer status;
    /**消耗体力*/
    @ApiModelProperty(value = "消耗体力")
    private Integer consume;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkPostName() {
        return workPostName;
    }

    public void setWorkPostName(String workPostName) {
        this.workPostName = workPostName;
    }

    public Integer getProductionLineInfold() {
        return productionLineInfold;
    }

    public void setProductionLineInfold(Integer productionLineInfold) {
        this.productionLineInfold = productionLineInfold;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getConsume() {
        return consume;
    }

    public void setConsume(Integer consume) {
        this.consume = consume;
    }

    @Override
    public String toString() {
        return "WorkPost{" +
                "id=" + id +
                ", workPostName='" + workPostName + '\'' +
                ", productionLineInfold=" + productionLineInfold +
                ", status=" + status +
                ", consume=" + consume +
                '}';
    }
}
