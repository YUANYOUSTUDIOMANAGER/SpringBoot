package com.oo.springboot03;

import com.oo.springboot03.repository.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/26 15:53
 * @Description :com.oo.springboot03
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class userTest {

    @Autowired
    UserDao userDao;

    @Test
    public void userPostTest(){
        entity.User user = new entity.User();
        user.setU_id(101);
        user.setU_name("王五");
        user.setU_pwd("98889");
        user.setU_pid(0);
        int res = userDao.insert(user);
        System.out.println(res);
    }

}
