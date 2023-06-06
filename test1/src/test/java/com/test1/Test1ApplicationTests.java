package com.test1;

import com.test1.common.BusinessException;
import com.test1.dao.Course;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test1ApplicationTests {

    @Test
    void contextLoads() {
        try {
            Course course = null;
            System.out.println(course.getName());
        } catch (Exception ex) {
            throw new BusinessException("捕获try的异常" + ex.getMessage());
        } finally {
            System.out.println("----finally最终执行----");
            return;
        }
    }

}
