package com.heren.redis_demo.controller;

import com.heren.redis_demo.service.RedisService;
import com.heren.redis_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private RedisService redisServiceImpl;
    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("/getUser/{id}")
    public String getUser(@PathVariable int id){
        String userName = redisServiceImpl.getUserName(id);
        if(userName == null){
           userName = userServiceImpl.getUserName(id);
           redisServiceImpl.addUserName(id);
        }
        return userName;
    }
    @RequestMapping("/")
    public String add(){
        return "nihao";
    }
}
