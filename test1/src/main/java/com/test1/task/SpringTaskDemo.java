/**
 * @projectName SpringBoot
 * @package com.test1.task
 * @className com.test1.task.SpringTaskDemo
 */
package com.test1.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * SpringTaskDemo
 * @description SpringTask定时任务
 * @author shujingping
 * @date 2022/11/4 10:26 上午
 * @version 1.0
 */
@Component
public class SpringTaskDemo {
    private static final Logger log = LoggerFactory.getLogger(SpringTaskDemo.class);

    @Async
    @Scheduled(cron = "0/2 * * * * ? ")
    public void scheduled1() throws InterruptedException {
        Thread.sleep(3000);
        log.info("scheduled1 每2秒执行一次：{}", LocalDateTime.now());
    }

    @Scheduled(fixedRate = 1000)
    public void schduled2() throws InterruptedException {
        Thread.sleep(3000);
        log.info("schduled2 每1秒执行一次：{}", LocalDateTime.now());
    }

    @Scheduled(fixedDelay = 3000)
    public void schduled3() throws InterruptedException {
        Thread.sleep(5000);
        log.info("schduled3 上次执行完毕后隔3秒继续执行：{}", LocalDateTime.now());
    }

}
 
