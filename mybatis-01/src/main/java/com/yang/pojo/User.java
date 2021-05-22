package com.yang.pojo;

import lombok.Data;

/**
 * @Author Ys
 * @Date 2021年05月18日 23:57
 * @Version 1.0
 */
@Data
public class User {

    private String id;//

    private String account;//账号


    private String pwd;//密码

    public User(String id, String account, String pwd) {
        this.id = id;
        this.account = account;
        this.pwd = pwd;
    }
}
