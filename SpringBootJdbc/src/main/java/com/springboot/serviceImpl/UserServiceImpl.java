package com.springboot.serviceImpl;

import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(String name, String age) {
        jdbcTemplate.update("insert into user(address,name,age) values ('1',?,?)", name, age);
    }
}
