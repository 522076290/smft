package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * @Description  
 * @Author  xcw
 * @Date 2020-11-05 
 */

public class UserPeople  implements Serializable {

	private static final long serialVersionUID =  5219473583455899195L;

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
	 * 体力
	 */
   	@ApiModelProperty(value = "体力" )
	private Long power;

	/**
	 * 人员
	 */
   	@ApiModelProperty(value = "人员" )
	private Long peopleId;

	/**
	 * 学生生产线
	 */
   	@ApiModelProperty(value = "学生生产线" )
	private Long userProductionLineId;

	/**
	 * 岗位
	 */
   	@ApiModelProperty(value = "岗位" )
	private Long workPostId;

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

	public Long getPower() {
		return this.power;
	}

	public void setPower(Long power) {
		this.power = power;
	}

	public Long getPeopleId() {
		return this.peopleId;
	}

	public void setPeopleId(Long peopleId) {
		this.peopleId = peopleId;
	}

	public Long getUserProductionLineId() {
		return this.userProductionLineId;
	}

	public void setUserProductionLineId(Long userProductionLineId) {
		this.userProductionLineId = userProductionLineId;
	}

	public Long getWorkPostId() {
		return this.workPostId;
	}

	public void setWorkPostId(Long workPostId) {
		this.workPostId = workPostId;
	}

	@Override
	public String toString() {
		return "TpApiConfig{" +
				"id='" + id + '\'' +
				"userWorkId='" + userWorkId + '\'' +
				"power='" + power + '\'' +
				"peopleId='" + peopleId + '\'' +
				"userProductionLineId='" + userProductionLineId + '\'' +
				"workPostId='" + workPostId + '\'' +
				'}';
	}

}
