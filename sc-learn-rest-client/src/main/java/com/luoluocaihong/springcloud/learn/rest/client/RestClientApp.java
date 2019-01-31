package com.luoluocaihong.springcloud.learn.rest.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by xh on 2019/1/30.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RestClientApp {
    public static void main(String[] args) {
        SpringApplication.run(RestClientApp.class, args);
    }
}
