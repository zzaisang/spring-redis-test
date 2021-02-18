package com.spring.springredis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021-02-19
 */
@SpringBootTest
class RedisTest {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    @DisplayName("")
    void name() {
        final String key1 = "hi";

        final ValueOperations<String, String> stringStringValueOperations = redisTemplate.opsForValue();
        stringStringValueOperations.set(key1,"hello");

        final String value1 = stringStringValueOperations.get(key1);

        System.out.println(value1);

        System.out.println(stringStringValueOperations.get("name"));

    }
}
