package com.example.redis.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author SHUJINGPING
 * @date 2022-6-14
 * @description redis操作工具类
 */

@Component
public class RedisUtils {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public boolean set(String key, String value) {
        boolean result = false;
        try{
            stringRedisTemplate.opsForValue().set(key, value);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public boolean getAndSet(String key, String value) {
        boolean result = false;
        try{
            stringRedisTemplate.opsForValue().getAndSet(key, value);
            result = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean delete(String key) {
        boolean result = false;
        try{
            stringRedisTemplate.delete(key);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
