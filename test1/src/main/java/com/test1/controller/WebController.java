/**
 * @projectName SpringBoot
 * @package com.test1.controller
 * @className com.test1.controller.WebController
 */
package com.test1.controller;

import org.springframework.web.bind.annotation.*;

/**
 * WebController
 * @description webhook告警通知接收
 * @author shujingping
 * @date 2022/11/11 3:14 下午
 * @version 1.0
 */

@RestController
@RequestMapping("/hook")
public class WebController {

    @PostMapping("/message")
    public String getMessage(@RequestBody Object a) {
        return "I receive your alarm info";
    }

    @GetMapping("/test")
    public String testMsg() {
        return "true";
    }
}
 
