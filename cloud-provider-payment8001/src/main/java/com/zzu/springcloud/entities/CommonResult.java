package com.zzu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author haofly
 * @Description 公共结果封装
 * @date 2021/1/17 22:23
 * @Version V1.0
 * @注意事项 无
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{
    private String code;
    private String  message;
    private T       data;

    public CommonResult(String code,String message)
    {
        this(code,message,null);
    }
}
