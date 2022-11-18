package com.test1.common;

/**
 * @author hc
 */

public enum ErrorMessage {
    // 返回结果
    UNKNOWN(10001, "系统错误，请联系系统管理");

    private final int code;
    private final String msg;

    ErrorMessage(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}
