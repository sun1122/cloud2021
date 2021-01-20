package com.zzu.springcloud.service;

import com.zzu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author haofly
 * @Description 支付服务接口
 * @date 2021/1/17 22:36
 * @Version V1.0
 * @注意事项 无
 */
public interface IPaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
