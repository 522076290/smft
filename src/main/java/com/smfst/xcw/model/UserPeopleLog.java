package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * @Description  
 * @Author  xcw
 * @Date 2020-11-05 
 */

public class UserPeopleLog  implements Serializable {

	private static final long serialVersionUID =  4736737954127401975L;

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
	 * 学生员工
	 */
   	@ApiModelProperty(value = "学生员工" )
	private Long userPeopleId;

	/**
	 * 时间
	 */
   	@ApiModelProperty(value = "时间" )
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

	public Long getUserPeopleId() {
		return this.userPeopleId;
	}

	public void setUserPeopleId(Long userPeopleId) {
		this.userPeopleId = userPeopleId;
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
				"userPeopleId='" + userPeopleId + '\'' +
				"time='" + time + '\'' +
				'}';
	}

}
