package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * @Description  
 * @Author  xcw
 * @Date 2020-11-07 
 */

public class UserQuestion  implements Serializable {

	private static final long serialVersionUID =  7796075814560282139L;

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
	 * 汽车
	 */
   	@ApiModelProperty(value = "汽车" )
	private Long carId;

	/**
	 * 学生生产线
	 */
   	@ApiModelProperty(value = "学生生产线" )
	private Long userProductionLineId;

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

	public Long getCarId() {
		return this.carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public Long getUserProductionLineId() {
		return this.userProductionLineId;
	}

	public void setUserProductionLineId(Long userProductionLineId) {
		this.userProductionLineId = userProductionLineId;
	}

	@Override
	public String toString() {
		return "TpApiConfig{" +
				"id='" + id + '\'' +
				"userWorkId='" + userWorkId + '\'' +
				"carId='" + carId + '\'' +
				"userProductionLineId='" + userProductionLineId + '\'' +
				'}';
	}

}
