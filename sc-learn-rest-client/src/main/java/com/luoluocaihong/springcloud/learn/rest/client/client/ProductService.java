package com.luoluocaihong.springcloud.learn.rest.client.client;

import com.luoluocaihong.springcloud.learn.rest.client.dto.CommonResp;
import com.luoluocaihong.springcloud.learn.rest.client.dto.ConfirmCarwachOrderReq;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by xh on 2019/1/31.
 */
@FeignClient(name = "${sc.rest.service.name}", path = "${sc.rest.service.path}")
public interface ProductService {

    @PostMapping("/confirm_carwash_order")
    public CommonResp conformCarwashOrder(@RequestBody ConfirmCarwachOrderReq req);
}
