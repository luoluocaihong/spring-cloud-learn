package com.luoluocaihong.springcloud.learn.rest.server.api;

import com.luoluocaihong.springcloud.learn.rest.server.api.dto.CommonResp;
import com.luoluocaihong.springcloud.learn.rest.server.api.dto.ConfirmCarwachOrderReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xh on 2019/1/31.
 */
@RestController
@RequestMapping("/oscar_boss/product")
public class ProductController {
@PostMapping("/confirm_carwash_order")
    public CommonResp conformCarwashOrder(@RequestBody ConfirmCarwachOrderReq dto) {
        CommonResp resp = new CommonResp();
        if (dto != null && dto.getUserId() != null) {
            resp.setCode(1);
            resp.setMessage("OK");

        }
        else {
            resp.setCode(0);
            resp.setMessage("error");
        }

        return resp;
    }
}
