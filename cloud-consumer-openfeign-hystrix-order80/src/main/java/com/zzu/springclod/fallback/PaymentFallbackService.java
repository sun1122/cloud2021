package com.zzu.springclod.fallback;

import com.zzu.springclod.spi.IPaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author haofly
 * @Description TODO
 * @date 2021/1/25 21:28
 * @Version V1.0
 * @注意事项 无
 */
@Component
public class PaymentFallbackService implements IPaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
