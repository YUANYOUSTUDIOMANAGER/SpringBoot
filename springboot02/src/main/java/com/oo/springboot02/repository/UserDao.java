package com.oo.springboot02.repository;

import com.oo.springboot02.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/26 01:55
 * @Description :com.oo.springboot02.repository
 * @version: 1.0
 */
public interface UserDao extends JpaRepository<User,Long> {

    public Optional<User> findById(int u_id);

//    @Query("select au from com.oo.springboot02.entity.User au where u_id=:u_id")
//    public List<User> queryByUser(@Param("u_id") Long u_id);

}
