package com.luoluocaihong.springcloud.learn.rest.server.api;

import com.luoluocaihong.springcloud.learn.rest.server.api.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

/**
 * Created by xh on 2019/1/30.
 */
@RestController
public class DemoController {

    @GetMapping(path = "/hello/{user}")
    public String sayHelloToYou(@PathVariable  String user) {
        return "hello:" + user;
    }

    @GetMapping(path = "/user/{userId}")
    public UserDto getUserInfo(@PathVariable  Long userId) {
        UserDto user = new UserDto();
        user.setUserId(userId);
        user.setUserName(userId + ":" + UUID.randomUUID());
        user.setAddress("江苏省南京市区江宁区正方中路" + (new Random().nextInt(1000) + 1) + "号");
        return user;
    }
}
