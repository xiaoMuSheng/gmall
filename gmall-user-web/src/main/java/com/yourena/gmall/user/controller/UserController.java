package com.yourena.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yourena.gmall.bean.UmsMember;
import com.yourena.gmall.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/getUmsMemberById")
    public List<UmsMember> getUmsMemberById() {
        return userService.getUmsMemberById("1");
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }


}
