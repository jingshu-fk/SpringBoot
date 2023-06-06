/**
 * @projectName SpringBoot
 * @package com.test1.common
 * @className com.test1.common.BusinessException
 */
package com.test1.common;

/**
 * BusinessException
 * @description 业务异常
 * @author shujingping
 * @date 2022/12/8 11:22 上午
 * @version 1.0
 */
public class BusinessException extends RuntimeException{
    public BusinessException() {
        super();
    }

    public BusinessException(String errMsg) {
        super(errMsg);
    }

    public BusinessException(String errMsg, Throwable throwable) {
        super(errMsg, throwable);
    }

}
 
