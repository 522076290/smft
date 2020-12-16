package com.smfst.xcw.model;/**
 * @Author lan
 * @Date 2020/10/23
 */

import io.swagger.annotations.ApiModelProperty;

/**
 *@ClassName UserWork
 *@Author lan
 *@Date 2020/10/23 15:23
 **/
public class UserWork {

    /**主键*/
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**登录名*/
    @ApiModelProperty(value = "登录名")
    private String loginName;
    /**昵称*/
    @ApiModelProperty(value = "昵称")
    private String nickName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserWork{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", nickName=" + nickName +
                '}';
    }
}
