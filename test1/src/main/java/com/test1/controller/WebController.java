
package com.test1.controller;

import com.test1.util.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * WebController
 * @description webhook告警通知接收
 * @author shujingping
 * @date 2022/11/11 3:14 下午
 * @version 1.0
 */

@RestController
public class WebController {
//    static final Counter MyRequests = Counter.build()
//            .name("requests_total").help("Total requests.").register();
    @PostMapping("/message")
    public CommonResult getMessage(@RequestBody Object a) {
        return CommonResult.ok("测试POST成功！");
    }

    @GetMapping("/message")
    public CommonResult testMessage(@RequestBody Object a) {
        return CommonResult.ok("测试GET成功！");
    }

}
 
