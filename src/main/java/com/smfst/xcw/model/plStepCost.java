package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/26
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName plStepCost
 *@Author lan
 *@Date 2020/10/26 9:30
 **/
public class plStepCost {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**生产环节*/
    @ApiModelProperty(value = "生产环节")
    private String  plStepId;
    /**材料*/
    @ApiModelProperty(value = "材料")
    private String  partId;
    /**数量*/
    @ApiModelProperty(value = "数量")
    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlStepId() {
        return plStepId;
    }

    public void setPlStepId(String plStepId) {
        this.plStepId = plStepId;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "plStepCost{" +
                "id=" + id +
                ", plStepId='" + plStepId + '\'' +
                ", partId='" + partId + '\'' +
                ", num=" + num +
                '}';
    }
}
