package com.springboot.controller;


import com.springboot.orderService.OrderService;
import com.springboot.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    @Autowired
    UserService userService;

    @Autowired
    OrderService orderService;

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
    public String createUser(String name,Integer age) {

         return "插入成功";
    }

    @RequestMapping("/createOrder")
    @Transactional
    public String createOrder(String orderName,String money) {
        userService.insert("1",10);
//        System.out.println(1/0);
        orderService.insert("11","100");
        return "插入成功";
    }
}
