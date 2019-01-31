package com.luoluocaihong.springcloud.learn.rest.client.api;

import com.luoluocaihong.springcloud.learn.rest.client.client.DemoIntf;
import com.luoluocaihong.springcloud.learn.rest.client.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

/**
 * Created by xh on 2019/1/30.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoIntf demoIntf;

    @GetMapping(path = "/hello/{user}")
    public String sayHelloToYou(@PathVariable  String user) {
        return demoIntf.sayHelloToYou(user);
    }

    @GetMapping(path = "/user/{userId}")
    public UserDto getUserInfo(@PathVariable  Long userId) {
        return demoIntf.getUserInfo(userId);
    }
}
