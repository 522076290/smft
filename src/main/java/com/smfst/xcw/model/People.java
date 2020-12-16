package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/20
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName People
 *@Author lan
 *@Date 2020/10/20 19:30
 **/
public class People {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**姓名*/
    @ApiModelProperty(value = "姓名")
    private String peopleName;
    /**头像*/
    @ApiModelProperty(value = "头像")
    private String icon;
    /**工作类型(0、工程师,1、工人,2、技术人员,3、检测人员)*/
    @ApiModelProperty(value = "工作类型(0、工程师,1、工人,2、技术人员,3、检测人员)")
    private String status;
    /**人才市场*/
    @ApiModelProperty(value = "人才市场")
    private String talentMarketId;
    /**报酬*/
    @ApiModelProperty(value = "报酬")
    private String gold;
    /**描述*/
    @ApiModelProperty(value = "描述")
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTalentMarketId() {
        return talentMarketId;
    }

    public void setTalentMarketId(String talentMarketId) {
        this.talentMarketId = talentMarketId;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", peopleName='" + peopleName + '\'' +
                ", icon='" + icon + '\'' +
                ", status='" + status + '\'' +
                ", talentMarketId='" + talentMarketId + '\'' +
                ", gold='" + gold + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
