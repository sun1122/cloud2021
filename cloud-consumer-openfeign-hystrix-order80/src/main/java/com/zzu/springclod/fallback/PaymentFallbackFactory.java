package com.zzu.springclod.fallback;

import com.zzu.springclod.spi.IPaymentHystrixService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author haofly
 * @Description TODO
 * @date 2021/1/25 21:55
 * @Version V1.0
 * @注意事项 无
 */

public class PaymentFallbackFactory implements FallbackFactory<IPaymentHystrixService> {




    @Override
    public IPaymentHystrixService create(Throwable cause) {
        return null;
    }
}
