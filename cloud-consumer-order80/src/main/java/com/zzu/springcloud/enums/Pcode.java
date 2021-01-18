package com.zzu.springcloud.enums;

/**
 * @author haofly
 * @Description TODO
 * @date 2021/1/19 0:06
 * @Version V1.0
 * @注意事项 无
 */
public enum Pcode {
    /**  服务码 路径 **/
    PAYMENT_CREATE("0001","/payment/create"),
    PAYMENT_QUERY("0002","/payment/get/"),
    ;
    private String code;
    private String url;

    Pcode(String code, String url){
        this.code = code;
        this.url = url;
    }

    public String url(){
        return url;
    }

}
