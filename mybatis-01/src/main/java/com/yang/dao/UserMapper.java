package com.yang.dao;

import com.yang.pojo.User;

import java.util.List;

/**
 * @Author Ys
 * @Date 2021年05月18日 23:59
 * @Version 1.0
 */
public interface UserMapper {
    int addUser(User user);

    List<User> getUserList();

    int updateUser(User user);

    int deleteUser(String id);

    int insertUser(User user);

}
