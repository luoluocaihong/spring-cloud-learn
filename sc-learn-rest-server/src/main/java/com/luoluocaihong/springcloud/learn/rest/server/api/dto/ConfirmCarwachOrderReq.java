package com.luoluocaihong.springcloud.learn.rest.server.api.dto;

import java.io.Serializable;

/**
 * Created by xh on 2019/1/31.
 */
public class ConfirmCarwachOrderReq implements Serializable {

    private String userId;

    private String mallOrderNo;

    private String bossTicketId;

    private int ticketType;

    private String createTime;

    private String beginTime;

    private String expiredtime;

    private String description;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMallOrderNo() {
        return mallOrderNo;
    }

    public void setMallOrderNo(String mallOrderNo) {
        this.mallOrderNo = mallOrderNo;
    }

    public String getBossTicketId() {
        return bossTicketId;
    }

    public void setBossTicketId(String bossTicketId) {
        this.bossTicketId = bossTicketId;
    }

    public int getTicketType() {
        return ticketType;
    }

    public void setTicketType(int ticketType) {
        this.ticketType = ticketType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getExpiredtime() {
        return expiredtime;
    }

    public void setExpiredtime(String expiredtime) {
        this.expiredtime = expiredtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
