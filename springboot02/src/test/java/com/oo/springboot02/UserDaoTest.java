package com.oo.springboot02;

import com.oo.springboot02.entity.User;
import com.oo.springboot02.repository.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/26 02:11
 * @Description :com.oo.springboot02
 * @version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testFindById(){
        Optional<User> user = userDao.findById(1);
        System.out.println(user.get().getU_name());
    }

}
