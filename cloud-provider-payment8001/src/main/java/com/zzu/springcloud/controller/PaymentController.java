package com.zzu.springcloud.controller;

import com.zzu.springcloud.entities.CommonResult;
import com.zzu.springcloud.entities.Payment;
import com.zzu.springcloud.errors.ErrorCodes;
import com.zzu.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author haofly
 * @Description 支付交易
 * @date 2021/1/17 22:40
 * @Version V1.0
 * @注意事项 无
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {

        int result = paymentService.create(payment);
        log.info("====插入结果：" + result);
        if (result > 0) {
            return new CommonResult<>(ErrorCodes.SUCCESS.code(),
                    ErrorCodes.SUCCESS.msg()+" port: "+port, result);
        } else {
            return new CommonResult(ErrorCodes.USER_CREATE_FAILED.code(),
                    ErrorCodes.USER_CREATE_FAILED.msg());
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null){
            return new CommonResult<>(ErrorCodes.SUCCESS.code(),
                    ErrorCodes.SUCCESS.msg()+" port: "+port,payment);
        }else {
            return new CommonResult<>(ErrorCodes.USER_NOT_EXISTS.code(),
                    ErrorCodes.USER_NOT_EXISTS.msg());
        }

    }
    @GetMapping(value = "/payment/discovery")
    public Object getInfo(){
        List<String> services = discoveryClient.getServices();
        for (String service : services){
            log.info(service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach(instance -> log.info("ServiceId:{}, Host:{}, Port: {} ,Uri: {}",instance.getServiceId() ,
                instance.getHost(),
                instance.getPort() ,instance.getUri()));


        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPort(){
        return this.port;
    }
}
