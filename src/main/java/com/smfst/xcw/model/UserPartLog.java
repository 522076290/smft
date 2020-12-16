package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/28
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName UserPartLog
 *@Author lan
 *@Date 2020/10/28 9:17
 **/
public class UserPartLog {

    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**学生工厂*/
    @ApiModelProperty(value = "学生工厂")
    private Integer userWorkId;
    /**供货列表*/
    @ApiModelProperty(value = "供货列表")
    private Integer suppierListId;
    /**数量*/
    @ApiModelProperty(value = "数量")
    private Integer num;
    /**购买时间*/
    @ApiModelProperty(value = "购买时间")
    private String time;
    /**价格*/
    @ApiModelProperty(value = "价格")
    private Integer gold;

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

    public Integer getSuppierListId() {
        return suppierListId;
    }

    public void setSuppierListId(Integer suppierListId) {
        this.suppierListId = suppierListId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    @Override
    public String toString() {
        return "UserPartLog{" +
                "id=" + id +
                ", userWorkId=" + userWorkId +
                ", suppierListId=" + suppierListId +
                ", num=" + num +
                ", time='" + time + '\'' +
                ", gold=" + gold +
                '}';
    }
}
