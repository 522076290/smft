package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * @Description  
 * @Author  xcw
 * @Date 2020-11-07 
 */

public class UserSellOutLog  implements Serializable {

	private static final long serialVersionUID =  2147805336024208703L;

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
	 *  汽车
	 */
   	@ApiModelProperty(value = " 汽车" )
	private Long carId;

	/**
	 * 价格
	 */
   	@ApiModelProperty(value = "价格" )
	private Long gold;

	/**
	 * 卖出时间
	 */
   	@ApiModelProperty(value = "卖出时间" )
	private Long time;

	/**
	 * 卖出数量
	 */
   	@ApiModelProperty(value = "卖出数量" )
	private Long num;

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

	public Long getGold() {
		return this.gold;
	}

	public void setGold(Long gold) {
		this.gold = gold;
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Long getNum() {
		return this.num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "TpApiConfig{" +
				"id='" + id + '\'' +
				"userWorkId='" + userWorkId + '\'' +
				"carId='" + carId + '\'' +
				"gold='" + gold + '\'' +
				"time='" + time + '\'' +
				"num='" + num + '\'' +
				'}';
	}

}
