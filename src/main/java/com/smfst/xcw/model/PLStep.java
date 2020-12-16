package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/20
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName PLStep
 *@Author lan
 *@Date 2020/10/20 15:31
 **/
public class PLStep {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**生产环节名称*/
    @ApiModelProperty(value = "生产环节名称")
    private String plStepName;
    /**步骤*/
    @ApiModelProperty(value = "步骤")
    private Integer step;
    /**耐久*/
    @ApiModelProperty(value = "耐久")
    private Integer power;
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer consume;
    /**图标*/
    @ApiModelProperty(value = "图标")
    private String icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlStepName() {
        return plStepName;
    }

    public void setPlStepName(String plStepName) {
        this.plStepName = plStepName;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getConsume() {
        return consume;
    }

    public void setConsume(Integer consume) {
        this.consume = consume;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


    @Override
    public String toString() {
        return "PLStep{" +
                "id=" + id +
                ", plStepName='" + plStepName + '\'' +
                ", step=" + step +
                ", power=" + power +
                ", consume=" + consume +
                ", icon=" + icon +
                '}';
    }
}
