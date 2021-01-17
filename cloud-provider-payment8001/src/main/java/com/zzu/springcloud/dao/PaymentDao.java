package com.zzu.springcloud.dao;


import com.zzu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description PaymentDao mapper
 * @author haofly
 * @date 2021/1/17 22:28
 * @Version V1.0
 * @注意事项 无
 */
@Mapper
public interface PaymentDao
{
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
