package com.luoluocaihong.springcloud.learn.rest.server.api.dto;


import java.io.Serializable;

/**
 * Created by xh on 2019/1/31.
 */
public class CommonResp implements Serializable {

    private int code;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
