package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * @Description  
 * @Author  xcw
 * @Date 2020-11-07 
 */

public class UserAppointment  implements Serializable {

	private static final long serialVersionUID =  2203107126194492919L;

	/**
	 * 主键
	 */
   	@ApiModelProperty(value = "主键" )
	private Long id;

	/**
	 * 学生工厂(0、红色，1、蓝色，2、绿色)
	 */
   	@ApiModelProperty(value = "学生工厂(0、红色，1、蓝色，2、绿色)" )
	private Long userWorkId;

	/**
	 * 订单名称
	 */
   	@ApiModelProperty(value = "订单名称" )
	private String userAppointmentName;

	/**
	 * 订单描述
	 */
   	@ApiModelProperty(value = "订单描述" )
	private String content;

	/**
	 * (0、已下单，1、生产中，2、完成)
	 */
   	@ApiModelProperty(value = "(0、已下单，1、生产中，2、完成)" )
	private Long type;

	/**
	 * 车型
	 */
   	@ApiModelProperty(value = "车型" )
	private Long carId;

	/**
	 * 交付时间
	 */
   	@ApiModelProperty(value = "交付时间" )
	private Long time;

	/**
	 * 数量
	 */
   	@ApiModelProperty(value = "数量" )
	private Long num;

	/**
	 * 收益
	 */
   	@ApiModelProperty(value = "收益" )
	private Long gold;

	/**
	 * 发动机排量(0、1.0，1、1.5，2、2.0，3、2.5，4、3.0，5、4.0)
	 */
   	@ApiModelProperty(value = "发动机排量(0、1.0，1、1.5，2、2.0，3、2.5，4、3.0，5、4.0)" )
	private double engine;

	/**
	 * 变速箱(0、自动，1、手动)
	 */
   	@ApiModelProperty(value = "变速箱(0、自动，1、手动)" )
	private Long speed;

	/**
	 * 轮毂(0、烤漆，1、电镀)
	 */
   	@ApiModelProperty(value = "轮毂(0、烤漆，1、电镀)" )
	private Long wheel;

	/**
	 * 中控(0、低配，1、高配)
	 */
   	@ApiModelProperty(value = "中控(0、低配，1、高配)" )
	private Long control;

	/**
	 * 刹车(0、，鼓式制动器，1、盘式制动器)
	 */
   	@ApiModelProperty(value = "刹车(0、，鼓式制动器，1、盘式制动器)" )
	private Long brake;

	/**
	 * 悬挂(1、独立悬挂系统，2、主动悬挂系统，3、横臂式悬挂系统，4、纵臂式悬
挂系统，5、烛式悬挂系统，6、多连杆式悬挂系统，7、麦弗逊式悬挂系统)

	 */
   	@ApiModelProperty(value = "悬挂(1、独立悬挂系统，2、主动悬挂系统，3、横臂式悬挂系统，4、纵臂式悬 挂系统，5、烛式悬挂系统，6、多连杆式悬挂系统，7、麦弗逊式悬挂系统)" )
	private Long hang;

	/**
	 * 外观装饰(0、红色，1、蓝色，2、绿色)
	 */
   	@ApiModelProperty(value = "外观装饰(0、红色，1、蓝色，2、绿色)" )
	private Long color;

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

	public String getUserAppointmentName() {
		return this.userAppointmentName;
	}

	public void setUserAppointmentName(String userAppointmentName) {
		this.userAppointmentName = userAppointmentName;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getCarId() {
		return this.carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
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

	public Long getGold() {
		return this.gold;
	}

	public void setGold(Long gold) {
		this.gold = gold;
	}

	public double getEngine() {
		return this.engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public Long getSpeed() {
		return this.speed;
	}

	public void setSpeed(Long speed) {
		this.speed = speed;
	}

	public Long getWheel() {
		return this.wheel;
	}

	public void setWheel(Long wheel) {
		this.wheel = wheel;
	}

	public Long getControl() {
		return this.control;
	}

	public void setControl(Long control) {
		this.control = control;
	}

	public Long getBrake() {
		return this.brake;
	}

	public void setBrake(Long brake) {
		this.brake = brake;
	}

	public Long getHang() {
		return this.hang;
	}

	public void setHang(Long hang) {
		this.hang = hang;
	}

	public Long getColor() {
		return this.color;
	}

	public void setColor(Long color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "TpApiConfig{" +
				"id='" + id + '\'' +
				"userWorkId='" + userWorkId + '\'' +
				"userAppointmentName='" + userAppointmentName + '\'' +
				"content='" + content + '\'' +
				"type='" + type + '\'' +
				"carId='" + carId + '\'' +
				"time='" + time + '\'' +
				"num='" + num + '\'' +
				"gold='" + gold + '\'' +
				"engine='" + engine + '\'' +
				"speed='" + speed + '\'' +
				"wheel='" + wheel + '\'' +
				"control='" + control + '\'' +
				"brake='" + brake + '\'' +
				"hang='" + hang + '\'' +
				"color='" + color + '\'' +
				'}';
	}

}
