package com.example.redis;

import com.example.redis.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class RedisApplicationTests {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @Test
    void contextLoads() {
//        stringRedisTemplate.opsForValue().get("yunai");
//        System.out.println(stringRedisTemplate.opsForValue().get("yunai"));
//        redisTemplate.opsForValue().set("猫猫", "bute");
        List<String> list = new ArrayList<String>();
        list.add("north01");
        list.add("north02");
        list.add("north03");
        stringRedisTemplate.opsForValue().set("20220615", list.toString());
    }

    @Test
    void set() {
       assert redisUtils.set("macOS", "SASS");
    }

    @Test
    void delete() {
        assert redisUtils.delete("思考");
    }

}
