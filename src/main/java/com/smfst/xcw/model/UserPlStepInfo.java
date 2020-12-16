package com.smfst.xcw.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * @Description  
 * @Author  xcw
 * @Date 2020-11-10 
 */

public class UserPlStepInfo  implements Serializable {

	private static final long serialVersionUID =  2671898669981145566L;

	/**
	 * 主键
	 */
   	@ApiModelProperty(value = "主键" )
	private Long id;

	/**
	 * 生产环节名称
	 */
   	@ApiModelProperty(value = "生产环节名称" )
	private String plStepName;

	/**
	 * 生产工序
	 */
   	@ApiModelProperty(value = "生产工序" )
	private Long stageId;

	/**
	 * 耗时
	 */
   	@ApiModelProperty(value = "耗时" )
	private Long costTime;

	/**
	 * 步骤
	 */
   	@ApiModelProperty(value = "步骤" )
	private Long step;

	/**
	 * 耐久
	 */
   	@ApiModelProperty(value = "耐久" )
	private Long power;

	/**
	 * 生产所耗
	 */
   	@ApiModelProperty(value = "生产所耗" )
	private Long consume;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlStepName() {
		return this.plStepName;
	}

	public void setPlStepName(String plStepName) {
		this.plStepName = plStepName;
	}

	public Long getStageId() {
		return this.stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public Long getCostTime() {
		return this.costTime;
	}

	public void setCostTime(Long costTime) {
		this.costTime = costTime;
	}

	public Long getStep() {
		return this.step;
	}

	public void setStep(Long step) {
		this.step = step;
	}

	public Long getPower() {
		return this.power;
	}

	public void setPower(Long power) {
		this.power = power;
	}

	public Long getConsume() {
		return this.consume;
	}

	public void setConsume(Long consume) {
		this.consume = consume;
	}

	@Override
	public String toString() {
		return "TpApiConfig{" +
				"id='" + id + '\'' +
				"plStepName='" + plStepName + '\'' +
				"stageId='" + stageId + '\'' +
				"costTime='" + costTime + '\'' +
				"step='" + step + '\'' +
				"power='" + power + '\'' +
				"consume='" + consume + '\'' +
				'}';
	}

}
