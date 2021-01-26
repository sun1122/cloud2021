package com.zzu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @Description GateWayMain9527
 * @author haofly
 * @date 2021/1/26 23:03
 * @Version V1.0
 * @注意事项 无
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527
{
    public static void main(String[] args) {
            SpringApplication.run(GateWayMain9527.class, args);
    }
}
