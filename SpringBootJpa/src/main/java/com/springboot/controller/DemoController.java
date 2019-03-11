package com.springboot.controller;


import com.springboot.dao.UserDao;
import com.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/index")
    public String index(Map<String, Object> map) {
        map.put("name", "美丽的天使...");
        return "index";
    }

    @RequestMapping("/createUser")
    public User createUser(Integer id) {
         return userDao.findOne(id);
    }

}
