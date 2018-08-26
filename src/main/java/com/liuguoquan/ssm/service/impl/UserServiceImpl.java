package com.liuguoquan.ssm.service.impl;

import com.liuguoquan.ssm.entity.User;
import com.liuguoquan.ssm.mapper.UserMapper;
import com.liuguoquan.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers(Long id) {

        System.out.println("进来找到：" + id);
        return userMapper.getUsers();
    }
}
