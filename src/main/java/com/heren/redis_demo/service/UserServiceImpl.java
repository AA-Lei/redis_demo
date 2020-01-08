package com.heren.redis_demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName(int id) {
        return id+"=>userName添加缓存";
    }
}
