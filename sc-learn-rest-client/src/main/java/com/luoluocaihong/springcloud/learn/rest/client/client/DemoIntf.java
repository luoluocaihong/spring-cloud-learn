package com.luoluocaihong.springcloud.learn.rest.client.client;

import com.luoluocaihong.springcloud.learn.rest.client.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by xh on 2019/1/30.
 */
@FeignClient("sc-restserver-xh")
public interface DemoIntf {

    @GetMapping(path = "/hello/{user}")
    public String sayHelloToYou(@PathVariable("user") String user);

    @GetMapping(path = "/user/{userId}")
    public UserDto getUserInfo(@PathVariable("userId")  Long userId);
}
