package com.zzu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author haofly
 * @Description Payment服务
 * @date 2021/1/17 22:01
 * @Version V1.0
 * @注意事项 无
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class);
    }

}
