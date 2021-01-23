package com.zzu.springcloud.enums;

/**
 * @author haofly
 * @Description 微服务名
 * @date 2021/1/23 22:01
 * @Version V1.0
 * @注意事项 无
 */
public enum ServiceName {
    /**   微服务名 **/
    CLOUD_PAYMENT_SERVICE("CLOUD-PAYMENT-SERVICE"),
    ;

    private String eName;

    ServiceName(String eName){
        this.eName = eName;
    }

    public String eName(){
        return this.eName;
    }
}
