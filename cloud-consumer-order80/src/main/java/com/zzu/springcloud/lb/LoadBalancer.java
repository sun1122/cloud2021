package com.zzu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author haofly
 * @Description 自定义LoadBalancer接口
 * @date 2021/1/23 20:58
 * @Version V1.0
 * @注意事项 无
 */
public interface LoadBalancer {

    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
