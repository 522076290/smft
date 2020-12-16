package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * @Description  
 * @Author  xcw
 * @Date 2020-11-07 
 */

public class Information  implements Serializable {

	private static final long serialVersionUID =  5466825634190371710L;

	/**
	 * 主键
	 */
   	@ApiModelProperty(value = "主键" )
	private Long id;

	/**
	 * 名称
	 */
   	@ApiModelProperty(value = "名称" )
	private String informationName;

	/**
	 * 时间
	 */
   	@ApiModelProperty(value = "时间" )
	private Long time;

	/**
	 * 文字
	 */
   	@ApiModelProperty(value = "文字" )
	private String words;

	/**
	 * 视频
	 */
   	@ApiModelProperty(value = "视频" )
	private String video;

	/**
	 * 图片
	 */
   	@ApiModelProperty(value = "图片" )
	private String icon;

	/**
	 * 类型(0、推荐，1、资讯，2、热点，3、口碑)
	 */
   	@ApiModelProperty(value = "类型(0、推荐，1、资讯，2、热点，3、口碑)" )
	private Long status;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInformationName() {
		return this.informationName;
	}

	public void setInformationName(String informationName) {
		this.informationName = informationName;
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getWords() {
		return this.words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TpApiConfig{" +
				"id='" + id + '\'' +
				"informationName='" + informationName + '\'' +
				"time='" + time + '\'' +
				"words='" + words + '\'' +
				"video='" + video + '\'' +
				"icon='" + icon + '\'' +
				"status='" + status + '\'' +
				'}';
	}

}
