package com.liuguoquan.ssm.controller;

import com.liuguoquan.ssm.entity.User;
import com.liuguoquan.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/getall")
    public List<User> getUsers(Long id) {
        return userService.getUsers(id);
    }
}
