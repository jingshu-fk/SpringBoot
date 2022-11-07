/**
 * @projectName SpringBoot
 * @package com.test1.dao
 * @className com.test1.dao.Order
 */
package com.test1.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Order
 * @description 时间
 * @author shujingping
 * @date 2022/11/3 11:04 上午
 * @version 1.0
 */
@Data
public class Order {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime payTime;

}
 
