package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/23
 */

import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.annotations.Mapper;

/**
 *@ClassName UserWorkInfo
 *@Author lan
 *@Date 2020/10/23 16:16
 **/
public class UserWorkInfo {

    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**原材料容量*/
    @ApiModelProperty(value = "原材料容量")
    private Integer partCapacity;
    /**汽车容量*/
    @ApiModelProperty(value = "汽车容量")
    private Integer carCapacity;
    /**金币*/
    @ApiModelProperty(value = "金币")
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPartCapacity() {
        return partCapacity;
    }

    public void setPartCapacity(Integer partCapacity) {
        this.partCapacity = partCapacity;
    }

    public Integer getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(Integer carCapacity) {
        this.carCapacity = carCapacity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "UserWorkInfo{" +
                "id=" + id +
                ", partCapacity=" + partCapacity +
                ", carCapacity=" + carCapacity +
                ", price=" + price +
                '}';
    }
}
