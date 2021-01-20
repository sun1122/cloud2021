package com.zzu.springcloud.controller;

import com.zzu.springcloud.entities.CommonResult;
import com.zzu.springcloud.entities.Payment;
import com.zzu.springcloud.enums.PCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author haofly
 * @Description 消费服务
 * @date 2021/1/18 23:37
 * @Version V1.0
 * @注意事项 无
 */
@RestController
@Slf4j
public class OrderController {

    //public static final String PAYMENT_URL ="http://localhost:8001";
    public static final String PAYMENT_URL ="http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+ PCode.PAYMENT_CREATE.url(),payment,CommonResult.class);
    }
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") long id){
        return restTemplate.getForObject(PAYMENT_URL+ PCode.PAYMENT_QUERY.url()+id,CommonResult.class);
    }
}
