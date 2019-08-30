package com.mybatis.demo.controller;

import com.mybatis.demo.model.User;
import com.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    UserService _UserService;

    @RequestMapping("/hello")
    public String hello()
    {
        return "sdfsdf";
    }
    @RequestMapping("/getAll")
    public List<User> getAll(String email)
    {
        return _UserService.getAll(email);
    }
}
