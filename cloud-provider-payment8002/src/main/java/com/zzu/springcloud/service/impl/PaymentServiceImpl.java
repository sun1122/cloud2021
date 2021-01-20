package com.zzu.springcloud.service.impl;

import com.zzu.springcloud.dao.PaymentDao;
import com.zzu.springcloud.entities.Payment;
import com.zzu.springcloud.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author haofly
 * @Description 支付服务实现类
 * @date 2021/1/17 22:37
 * @Version V1.0
 * @注意事项 无
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
