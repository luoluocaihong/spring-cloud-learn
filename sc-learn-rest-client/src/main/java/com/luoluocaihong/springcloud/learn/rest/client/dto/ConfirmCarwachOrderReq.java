package com.luoluocaihong.springcloud.learn.rest.client.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by xh on 2019/1/31.
 */
@Data
public class ConfirmCarwachOrderReq implements Serializable {

    private String userId;

    private String mallOrderNo;

    private String bossTicketId;

    private int ticketType;

    private String createTime;

    private String beginTime;

    private String expiredtime;

    private String description;


}
