package com.luoluocaihong.springcloud.learn.rest.client.dto;

import java.io.Serializable;

/**
 * Created by xh on 2019/1/30.
 */
public class UserDto implements Serializable{
    private Long userId;

    private String userName;

    private String address;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
