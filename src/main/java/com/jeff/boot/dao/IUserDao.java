package com.jeff.boot.dao;

import com.jeff.boot.entity.User;

import java.util.List;

/**
 * @author jeff
 * @date 2017-02-25 09:07
 * @since 1.8
 * @version 1.0.0
 */
public interface IUserDao {

    int insert(User user);

    List<User> queryList();

    User getUserById(String id);
}
