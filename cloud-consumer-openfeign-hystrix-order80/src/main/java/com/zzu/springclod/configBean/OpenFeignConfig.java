package com.zzu.springclod.configBean;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author haofly
 * @Description OpenFeign的日志级别
 * @date 2021/1/23 22:37
 * @Version V1.0
 * @注意事项 无
 */
@Configuration
public class OpenFeignConfig {
    /**
     * @Description
     * NONE:默认的，不显示任何日志;
     * BASIC:仅记录请求方法、URL、 响应状态码及执行时间;
     * HEADERS:除了BASIC 中定义的信息之外，还有请求和响应的头信息;
     * FULL:除了HEADERS中定义的信息之外,还有请求和响应的正文及元数据。
     * @return feign.Logger.Level
     * @author haofly
     * @date 2021/1/23 22:37
     * @Version V1.0
     * @注意事项 无
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
