package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/20
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName Stage
 *@Author lan
 *@Date 2020/10/20 15:11
 **/
public class Stage {

    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**工厂名称*/
    @ApiModelProperty(value = "工厂名称")
    private String stageName;
    /**工序介绍*/
    @ApiModelProperty(value = "工序介绍")
    private String content;
    /**生产环节ID*/
    @ApiModelProperty(value = "生产环节ID")
    private Integer plStepId;
    /**下一个生产工序*/
    @ApiModelProperty(value = "下一个生产工序")
    private Integer nextStageId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPlStepId() {
        return plStepId;
    }

    public void setPlStepId(Integer plStepId) {
        this.plStepId = plStepId;
    }

    public Integer getNextStageId() {
        return nextStageId;
    }

    public void setNextStageId(Integer nextStageId) {
        this.nextStageId = nextStageId;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + id +
                ", stageName='" + stageName + '\'' +
                ", content='" + content + '\'' +
                ", plStepId=" + plStepId +
                ", nextStageId=" + nextStageId +
                '}';
    }
}
