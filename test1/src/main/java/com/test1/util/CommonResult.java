package com.test1.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author hc
 */
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@ApiModel(
        description = "返回基类"
)
public class CommonResult<T> {
    private static final long serialVersionUID = 1L;
    public static final Integer SUCCESS_CODE = 1;
    @ApiModelProperty("返回编码")
    private Integer code;
    @ApiModelProperty("是否成功")
    private Boolean success;
    @ApiModelProperty("成功数据")
    private T msg;

    public CommonResult() {
    }

    public CommonResult(Integer code, T msg, Boolean success) {
        this.code = code;
        this.msg = msg;
        this.success = success;
    }

    public CommonResult(Integer code, Boolean success) {
        this.code = code;
        this.success = success;
    }

    public CommonResult(Integer code, Boolean success, T msg) {
        this.code = code;
        this.success = success;
        this.msg = msg;
    }


    public static CommonResult ok(Object data) {
        return new CommonResult(SUCCESS_CODE, true, data);
    }

    public Integer getCode() {
        return this.code;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public T getMsg() {
        return this.msg;
    }


    public CommonResult<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public CommonResult<T> setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public CommonResult<T> setMsg(T msg) {
        this.msg = msg;
        return this;
    }


}


 
