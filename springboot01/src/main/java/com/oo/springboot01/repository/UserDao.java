package com.oo.springboot01.repository;

import com.oo.springboot01.entity.User;

import java.util.List;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/25 23:59
 * @Description :com.oo.springboot01.repository
 * @version: 1.0
 */
public interface UserDao {

    int add(User user);

    int delete(Long u_id);

    int update(User user);

    User getUser(Long u_id);

    List<User> getUserList(Long u_id);

}
