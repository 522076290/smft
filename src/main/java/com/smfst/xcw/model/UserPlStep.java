package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * @Description  
 * @Author  xcw
 * @Date 2020-11-10 
 */

public class UserPlStep  implements Serializable {

	private static final long serialVersionUID =  5624184588755620060L;

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
	 * 下一个学生生产环节
	 */
   	@ApiModelProperty(value = "下一个学生生产环节" )
	private Long nextUserPlStepId;

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

	public Long getNextUserPlStepId() {
		return this.nextUserPlStepId;
	}

	public void setNextUserPlStepId(Long nextUserPlStepId) {
		this.nextUserPlStepId = nextUserPlStepId;
	}

	@Override
	public String toString() {
		return "TpApiConfig{" +
				"id='" + id + '\'' +
				"userWorkId='" + userWorkId + '\'' +
				"userProductionLineId='" + userProductionLineId + '\'' +
				"nextUserPlStepId='" + nextUserPlStepId + '\'' +
				'}';
	}

}
