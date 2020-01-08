package com.heren.redis_demo.service;

public interface RedisService {
    //获得userName
    public String getUserName(int id);
    //添加userName
    public void addUserName(int id);
}
