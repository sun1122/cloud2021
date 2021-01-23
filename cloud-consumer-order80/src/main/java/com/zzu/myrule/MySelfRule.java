package com.zzu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author haofly
 * @Description 自定义策略
 * @date 2021/1/23 15:24
 * @Version V1.0
 * @注意事项 无
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return  new RandomRule();//定义为随机 替换轮询
    }
}
