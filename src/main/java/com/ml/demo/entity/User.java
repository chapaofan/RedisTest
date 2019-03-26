package com.ml.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: MaoLin
 * @Date: 2019/3/24 14:36
 * @Version 1.0
 */

@Data
public class User implements Serializable {

    private int userId;

    private String userName;

    private String userPassword;

    public User(int userId, String userName, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
    }
}
