package com.zzu.apringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author haofly
 * @Description OPEN FEIGN client
 * @date 2021/1/23 21:51
 * @Version V1.0
 * @注意事项 无
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderOpenFeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignMain80.class,args);
    }

}
