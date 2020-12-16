package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/27
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName UserParts
 *@Author lan
 *@Date 2020/10/27 17:28
 **/
public class UserParts {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**学生工厂*/
    @ApiModelProperty(value = "学生工厂")
    private Integer userWorkId;
    /**学生生产线*/
    @ApiModelProperty(value = "学生生产线")
    private Integer userProductionLineId;
    /**原材料*/
    @ApiModelProperty(value = "原材料")
    private Integer partId;
    /**数量*/
    @ApiModelProperty(value = "数量")
    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserWorkId() {
        return userWorkId;
    }

    public void setUserWorkId(Integer userWorkId) {
        this.userWorkId = userWorkId;
    }

    public Integer getUserProductionLineId() {
        return userProductionLineId;
    }

    public void setUserProductionLineId(Integer userProductionLineId) {
        this.userProductionLineId = userProductionLineId;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
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
        return "UserParts{" +
                "id=" + id +
                ", userWorkId=" + userWorkId +
                ", userProductionLineId=" + userProductionLineId +
                ", partId=" + partId +
                ", num=" + num +
                '}';
    }
}
