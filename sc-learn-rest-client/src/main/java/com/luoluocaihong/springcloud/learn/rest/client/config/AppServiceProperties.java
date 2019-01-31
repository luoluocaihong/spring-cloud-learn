package com.luoluocaihong.springcloud.learn.rest.client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by xh on 2019/1/31.
 */
@ConfigurationProperties(
        prefix = "sc.rest.service"
)
public class AppServiceProperties {

    private String oneName;

    public String getOneName() {
        return oneName;
    }

    public void setOneName(String oneName) {
        this.oneName = oneName;
    }
}
