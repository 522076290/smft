package com.smfst.xcw.model;
/**
 * @Author lan
 * @Date 2020/10/23
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName Part
 *@Author lan
 *@Date 2020/10/23 13:47
 **/
public class Part {
    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**原材料名称*/
    @ApiModelProperty(value = "原材料名称")
    private String partName;
    /**原材料描述*/
    @ApiModelProperty(value = "原材料描述")
    private String content;
    /**占地*/
    @ApiModelProperty(value = "占地")
    private Integer area;
    /**图标*/
    @ApiModelProperty(value = "图标")
    private String icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", partName='" + partName + '\'' +
                ", content=" + content +
                ", area=" + area +
                ", icon=" + icon +
                '}';
    }

}
