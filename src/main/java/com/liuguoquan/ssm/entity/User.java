package com.liuguoquan.ssm.entity;

import lombok.Data;

@Data
public class User {

    private Long id;//ID

    private String username;//用户名

    private String password;//密码

    private String nickname;//昵称
}
