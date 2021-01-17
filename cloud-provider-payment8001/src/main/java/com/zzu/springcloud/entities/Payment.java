package com.zzu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhoujiashen
 * @Description 支付流水表
 * @date 2021/1/17 22:19
 * @Version V1.0
 * @注意事项 无
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private long id;
    private String serial;
}
