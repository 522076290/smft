package com.smfst.xcw.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
/**
 * @quthor lan 2020/10/11
 */
@Setter
@Getter
@ApiModel(description= "返回响应数据")
public class ResultObjectModel<T> implements Serializable {
    /**
     * 返回是否成功
     */
    @ApiModelProperty(value = "是否成功")
    private Integer status;

    /**
     * 提示信息
     */
    @ApiModelProperty(value = "提示信息")
    private String message;

    /**
     * 返回数据内容
     */
    @ApiModelProperty(value = "返回数据内容")
    private T data;

    public ResultObjectModel() {
    }

    public ResultObjectModel(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    /**
     * 返回成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultObjectModel success(T data){
        return new ResultObjectModel(200 , "成功" , data);
    }

    /**
     * 返回成功
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultObjectModel success(String message ,T data){
        return new ResultObjectModel(200 , message , data);
    }

    /**
     * 失败
     * @param message
     * @return
     */
    public static ResultObjectModel fail(String message){
        return new ResultObjectModel(400 , message , null);
    }

    /**
     * 失败
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultObjectModel fail(String message ,T data){
        return new ResultObjectModel(400 , message , data);
    }

    /**
     * 权限不足
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultObjectModel permissions(String message ,T data){
        return new ResultObjectModel(401 , message , data);
    }
}