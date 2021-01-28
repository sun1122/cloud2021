package com.zzu.springcloud.filter;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author haofly
 * @Description 自定义过滤器
 * @date 2021/1/28 21:45
 * @Version V1.0
 * @注意事项 无
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("***********come in MyLogGateWayFilter:  " + new Date());
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if (StrUtil.isEmpty(uname)) {
            log.info("*******用户名为null，非法用户，o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);
    }

    /**
     * @return int
     * @Description 数字最小 优先级最小
     * @author haofly
     * @date 2021/1/28 21:46
     * @Version V1.0
     * @注意事项 无
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
