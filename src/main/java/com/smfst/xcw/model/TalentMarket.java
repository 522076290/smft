package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/20
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName TalentMarket
 *@Author lan
 *@Date 2020/10/20 20:39
 **/
public class TalentMarket {

    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**人才市场名称*/
    @ApiModelProperty(value = "人才市场名称")
    private String talentMarketName;
    /**描述*/
    @ApiModelProperty(value = "描述")
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTalentMarketName() {
        return talentMarketName;
    }

    public void setTalentMarketName(String talentMarketName) {
        this.talentMarketName = talentMarketName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "TalentMarket{" +
                "id=" + id +
                ", talentMarketName='" + talentMarketName + '\'' +
                ", content=" + content +
                '}';
    }
}
