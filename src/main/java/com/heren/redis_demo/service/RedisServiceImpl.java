package com.heren.redis_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Override
    public String getUserName(int id) {
        System.out.println("查询=》"+id);
        String userName = null;
        userName = (String) redisTemplate.opsForValue().get("user"+id);
        return userName;
    }

    @Override
    public void addUserName(int id) {
        System.out.println("插入REDIS");
        redisTemplate.opsForValue().set("user"+id,"user"+id+"=>userName");
    }
}
