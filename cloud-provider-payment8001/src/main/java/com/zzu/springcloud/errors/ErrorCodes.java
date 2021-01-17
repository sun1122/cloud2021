package com.zzu.springcloud.errors;

/**
 * @author haofly
 * @Description 错误码
 * @date 2021/1/17 22:48
 * @Version V1.0
 * @注意事项 无
 */
public enum ErrorCodes {
    /**  错误码 **/
    SUCCESS("000000","交易成功"),
    FAIL("999999","交易失败"),

    USER_CREATE_FAILED("000001","用户新增失败"),
    USER_NOT_EXISTS("000002","用户不存在"),
    ;
    private String code;
    private String msg;

    ErrorCodes(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String code() {
        return code;
    }

    public String msg() {
        return msg;
    }
}
