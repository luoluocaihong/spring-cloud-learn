package com.luoluocaihong.springcloud.learn.rest.client.api;

import com.luoluocaihong.springcloud.learn.rest.client.client.ProductService;
import com.luoluocaihong.springcloud.learn.rest.client.dto.CommonResp;
import com.luoluocaihong.springcloud.learn.rest.client.dto.ConfirmCarwachOrderReq;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xh on 2019/1/31.
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/conformCarwashOrder")
    public CommonResp conformCarwashOrder(@RequestParam String  userId) {
        ConfirmCarwachOrderReq dto = new ConfirmCarwachOrderReq();
        if (!StringUtils.isEmpty(userId)) {
            dto.setUserId(userId);
        }
        return productService.conformCarwashOrder(dto);
    }
}
