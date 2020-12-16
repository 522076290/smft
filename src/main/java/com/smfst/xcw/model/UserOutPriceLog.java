package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/26
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName UserOutPriceLog
 *@Author lan
 *@Date 2020/10/26 11:35
 **/
public class UserOutPriceLog {

    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**学生工厂*/
    @ApiModelProperty(value = "学生工厂")
    private Integer userWorkId;
    /**金币*/
    @ApiModelProperty(value = "金币")
    private Integer price;
    /**剩余金币*/
    @ApiModelProperty(value = "剩余金币")
    private Integer endPrice;
    /**时间*/
    @ApiModelProperty(value = "时间")
    private String time;
    /**类型(0、原材料,1、人员,2、生产线,3、维修生产环节,4、维修车辆,5、售出)*/
    @ApiModelProperty(value = "类型(0、原材料,1、人员,2、生产线,3、维修生产环节,4、维修车辆,5、售出)")
    private Integer type;


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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(Integer endPrice) {
        this.endPrice = endPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "UserOutPriceLog{" +
                "id=" + id +
                ", userWorkId=" + userWorkId +
                ", price=" + price +
                ", endPrice=" + endPrice +
                ", time='" + time + '\'' +
                ", type=" + type +
                '}';
    }
}
