/**
 * @projectName SpringBoot
 * @package com.test1.controller
 * @className com.test1.controller.OrderController
 */
package com.test1.controller;

import com.test1.dao.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * OrderController
 * @description 测试格式化时间
 * @author shujingping
 * @date 2022/11/3 11:02 上午
 * @version 1.0
 */

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping()
    public Order query() {
        Order order = new Order();
        order.setPayTime(LocalDateTime.now());
        return order;
    }
}
 
