package com.liuguoquan.ssm.service;

import com.liuguoquan.ssm.entity.User;

import java.util.List;

public interface IUserService {

    List<User> getUsers(Long id);
}
