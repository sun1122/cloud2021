package com.zzu.apringcloud.spi;

import com.zzu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author haofly
 * @Description OPEN FEIGN CLIENT
 * @date 2021/1/23 21:57
 * @Version V1.0
 * @注意事项 无
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface IPaymentService {

    /**
     * @Description 调用 payemnt服务提供者的 controller
     * @param id
     * @return com.zzu.springcloud.entities.CommonResult
     * @author haofly
     * @date 2021/1/23 22:12
     * @Version V1.0
     * @注意事项 无
     */
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/openfigen/timeout")
    public String openFeignTimeOut();
}
