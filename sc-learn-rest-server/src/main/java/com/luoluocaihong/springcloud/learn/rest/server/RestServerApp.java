package com.luoluocaihong.springcloud.learn.rest.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by xh on 2019/1/30.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RestServerApp {
    public static void main(String[] args) {
        SpringApplication.run(RestServerApp.class, args);
    }
}
