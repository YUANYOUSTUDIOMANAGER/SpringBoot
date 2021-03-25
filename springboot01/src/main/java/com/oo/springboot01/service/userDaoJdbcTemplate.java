package com.oo.springboot01.service;

import com.oo.springboot01.entity.User;
import com.oo.springboot01.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/26 00:15
 * @Description :com.oo.springboot01.service
 * @version: 1.0
 */

@Repository
public class userDaoJdbcTemplate implements UserDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate; //

    @Override
    public int add(User user) {
        String sql = "insert into user(u_id,u_name,u_pwd,u_email,u_pid) values(:u_id,:u_name,:u_pwd,:u_email,:u_pid)";
        Map<String,Object> param = new HashMap<>();
        param.put("u_id",user.getU_id());
        param.put("u_name",user.getU_name());
        param.put("u_pwd",user.getU_pwd());
        param.put("u_email",user.getU_email());
        param.put("u_pid",user.getU_pid());
        return (int)jdbcTemplate.update(sql,param);
    }

    @Override
    public int delete(Long u_id) {
        String sql = "delete from user where u_id = :u_id";
        Map<String,Object> param = new HashMap<>();
        param.put("u_id",u_id);
        return (int)jdbcTemplate.update(sql,param);
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public User getUser(Long u_id) {
        return null;
    }

    @Override
    public List<User> getUserList(Long u_id) {
        return null;
    }
}
