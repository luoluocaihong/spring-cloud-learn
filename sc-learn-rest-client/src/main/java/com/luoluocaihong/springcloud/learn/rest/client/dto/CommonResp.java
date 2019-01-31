package com.luoluocaihong.springcloud.learn.rest.client.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by xh on 2019/1/31.
 */
@Data
public class CommonResp implements Serializable {

    private int code;

    private String message;
}
