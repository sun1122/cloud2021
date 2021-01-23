package com.zzu.springcloud.lb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author haofly
 * @Description MyLoadBalancer
 * @date 2021/1/23 20:59
 * @Version V1.0
 * @注意事项 无
 */
@Component
@Slf4j
public class MyLoadBalancer implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        int index = getAndIncrement() % serviceInstances.size();


        return serviceInstances.get(index);
    }

    /**
     * @return int
     * @Description juc 自旋锁
     * @author haofly
     * @date 2021/1/23 21:05
     * @Version V1.0
     * @注意事项 无
     */
    private final int getAndIncrement() {
        for (; ; ) {
            int current = atomicInteger.get();
            int next = current >= 2147483647 ? 0 : current + 1;
            if (atomicInteger.compareAndSet(current, next)) {
                log.info("*******第{}次访问*******", next);
                return next;
            }
        }
    }

}
