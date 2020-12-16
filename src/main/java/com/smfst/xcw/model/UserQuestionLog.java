package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * @Description  
 * @Author  xcw
 * @Date 2020-11-07 
 */

public class UserQuestionLog  implements Serializable {

	private static final long serialVersionUID =  7753347033506194773L;

	/**
	 * 主键
	 */
   	@ApiModelProperty(value = "主键" )
	private Long id;

	/**
	 * 学生工厂
	 */
   	@ApiModelProperty(value = "学生工厂" )
	private Long userWorkId;

	/**
	 * 学生生产线
	 */
   	@ApiModelProperty(value = "学生生产线" )
	private Long userProductionLineId;

	/**
	 * 学生问题车辆
	 */
   	@ApiModelProperty(value = "学生问题车辆" )
	private Long userQuestionId;

	/**
	 * 维修时间
	 */
   	@ApiModelProperty(value = "维修时间" )
	private Long time;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserWorkId() {
		return this.userWorkId;
	}

	public void setUserWorkId(Long userWorkId) {
		this.userWorkId = userWorkId;
	}

	public Long getUserProductionLineId() {
		return this.userProductionLineId;
	}

	public void setUserProductionLineId(Long userProductionLineId) {
		this.userProductionLineId = userProductionLineId;
	}

	public Long getUserQuestionId() {
		return this.userQuestionId;
	}

	public void setUserQuestionId(Long userQuestionId) {
		this.userQuestionId = userQuestionId;
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "TpApiConfig{" +
				"id='" + id + '\'' +
				"userWorkId='" + userWorkId + '\'' +
				"userProductionLineId='" + userProductionLineId + '\'' +
				"userQuestionId='" + userQuestionId + '\'' +
				"time='" + time + '\'' +
				'}';
	}

}
