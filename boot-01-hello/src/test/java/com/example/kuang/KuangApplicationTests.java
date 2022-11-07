package com.example.kuang;

import com.example.kuang.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KuangApplicationTests {

    @Autowired
    Person person;  // 将person自动注入进来

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
