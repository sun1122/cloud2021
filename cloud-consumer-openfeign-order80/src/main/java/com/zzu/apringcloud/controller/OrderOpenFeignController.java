package com.zzu.apringcloud.controller;

import com.zzu.apringcloud.spi.IPaymentService;
import com.zzu.springcloud.entities.CommonResult;
import com.zzu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author haofly
 * @Description open feign
 * @date 2021/1/23 22:10
 * @Version V1.0
 * @注意事项 无
 */
@RestController
public class OrderOpenFeignController {

    @Resource
    private IPaymentService paymentService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/openfigen/timeout")
    public String openFeignTimeOut(){
        return paymentService.openFeignTimeOut();
    }
}
