package com.zzu.springcloud.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author haofly
 * @Description 配置bean
 * @date 2021/1/18 23:46
 * @Version V1.0
 * @注意事项 无
 */
@Configuration
public class configBean {

    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
