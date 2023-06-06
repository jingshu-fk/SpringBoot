package com.test1.util;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.test1.common.ErrorMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;

/**
 * @author hc
 */
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@ApiModel(
        description = "返回基类"
)
public class BaseResult<T> {
    private static final long serialVersionUID = 1L;
    public static final Integer SUCCESS_CODE = 1;
    @ApiModelProperty("返回编码")
    private Integer code;
    @ApiModelProperty("错误信息")
    private String errorMsg;
    @ApiModelProperty("错误详情")
    private String errorDetail;
    @ApiModelProperty("是否成功")
    private Boolean success;
    @ApiModelProperty("成功数据")
    private T data;
    @ApiModelProperty("分页总页数")
    private Integer count;
    @ApiModelProperty(
            value = "错误堆栈信息",
            notes = "仅在调试模式下生效"
    )
    private StackTraceElement[] errorStack;

    public BaseResult() {
    }

    public BaseResult(Integer code, String errorMsg, Boolean success) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.success = success;
    }

    public BaseResult(Integer code, Boolean success) {
        this.code = code;
        this.success = success;
    }

    public BaseResult(Integer code, Boolean success, T data) {
        this.code = code;
        this.success = success;
        this.data = data;
    }

    public BaseResult(Integer code, Boolean success, T data, Integer count) {
        this.code = code;
        this.success = success;
        this.data = data;
        this.count = count;
    }

    public BaseResult(Integer code, String errorMsg, String errorDetail, Boolean success) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.errorDetail = errorDetail;
        this.success = success;
    }

    public static BaseResult ok() {
        return new BaseResult(SUCCESS_CODE, true);
    }

    public static BaseResult ok(Object data) {
        return new BaseResult(SUCCESS_CODE, true, data);
    }

    public static BaseResult ok(Object data, int count) {
        return new BaseResult(SUCCESS_CODE, true, data, count);
    }

    public static BaseResult error() {
        return error(ErrorMessage.UNKNOWN);
    }

    public static BaseResult error(ErrorMessage errorMessage) {
        return new BaseResult(errorMessage.getCode(), errorMessage.getMsg(), false);
    }

    public static BaseResult error(ErrorMessage errorMessage, String msg) {
        return new BaseResult(errorMessage.getCode(), errorMessage.getMsg() + (StringUtils.isBlank(msg) ? "" : ": " + msg), false);
    }

    public Integer getCode() {
        return this.code;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getErrorDetail() {
        return this.errorDetail;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public T getData() {
        return this.data;
    }

    public Integer getCount() {
        return this.count;
    }

    public StackTraceElement[] getErrorStack() {
        return this.errorStack;
    }

    public BaseResult<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public BaseResult<T> setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public BaseResult<T> setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    public BaseResult<T> setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public BaseResult<T> setData(T data) {
        this.data = data;
        return this;
    }

    public BaseResult<T> setCount(Integer count) {
        this.count = count;
        return this;
    }

    public BaseResult<T> setErrorStack(StackTraceElement[] errorStack) {
        this.errorStack = errorStack;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BaseResult)) {
            return false;
        } else {
            BaseResult<?> other = (BaseResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label87: {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label87;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label87;
                    }

                    return false;
                }

                Object this$errorMsg = this.getErrorMsg();
                Object other$errorMsg = other.getErrorMsg();
                if (this$errorMsg == null) {
                    if (other$errorMsg != null) {
                        return false;
                    }
                } else if (!this$errorMsg.equals(other$errorMsg)) {
                    return false;
                }

                label73: {
                    Object this$errorDetail = this.getErrorDetail();
                    Object other$errorDetail = other.getErrorDetail();
                    if (this$errorDetail == null) {
                        if (other$errorDetail == null) {
                            break label73;
                        }
                    } else if (this$errorDetail.equals(other$errorDetail)) {
                        break label73;
                    }

                    return false;
                }

                Object this$success = this.getSuccess();
                Object other$success = other.getSuccess();
                if (this$success == null) {
                    if (other$success != null) {
                        return false;
                    }
                } else if (!this$success.equals(other$success)) {
                    return false;
                }

                label59: {
                    Object this$data = this.getData();
                    Object other$data = other.getData();
                    if (this$data == null) {
                        if (other$data == null) {
                            break label59;
                        }
                    } else if (this$data.equals(other$data)) {
                        break label59;
                    }

                    return false;
                }

                Object this$count = this.getCount();
                Object other$count = other.getCount();
                if (this$count == null) {
                    if (other$count != null) {
                        return false;
                    }
                } else if (!this$count.equals(other$count)) {
                    return false;
                }

                if (!Arrays.deepEquals(this.getErrorStack(), other.getErrorStack())) {
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseResult;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $errorMsg = this.getErrorMsg();
        result = result * 59 + ($errorMsg == null ? 43 : $errorMsg.hashCode());
        Object $errorDetail = this.getErrorDetail();
        result = result * 59 + ($errorDetail == null ? 43 : $errorDetail.hashCode());
        Object $success = this.getSuccess();
        result = result * 59 + ($success == null ? 43 : $success.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        Object $count = this.getCount();
        result = result * 59 + ($count == null ? 43 : $count.hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getErrorStack());
        return result;
    }
}

