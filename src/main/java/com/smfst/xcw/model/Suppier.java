package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/23
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName Suppier
 *@Author lan
 *@Date 2020/10/23 14:05
 **/
public class Suppier {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**供货商名称*/
    @ApiModelProperty(value = "供货商名称")
    private String suppierName;
    /**供货商描述*/
    @ApiModelProperty(value = "供货商描述")
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuppierName() {
        return suppierName;
    }

    public void setSuppierName(String suppierName) {
        this.suppierName = suppierName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Suppier{" +
                "id=" + id +
                ", suppierName='" + suppierName + '\'' +
                ", content=" + content +
                '}';
    }
}
