package com.oo.springboot03.repository;

import com.oo.springboot03.entity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/26 02:50
 * @Description :com.oo.springboot03.repository
 * @version: 1.0
 */

@Mapper
public interface UserDao{

    public int insert(entity.User user);

    public int delete(int u_id);

    public int update(entity.User user);

    public entity.User findById(int u_id);

    public List<entity.User> findUserList(int u_id);

}
