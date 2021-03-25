package com.oo.springboot01.controller;

import com.oo.springboot01.repository.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/26 00:40
 * @Description :com.oo.springboot01.controller
 * @version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class userTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testAdd(){
//       User user = new User();
//       user.setU_id(34);
//       user.setU_name("petty");
//       user.setU_email("222@..aocm");
//       user.setU_pwd("0000");
//       user.setU_pid(0);
       userDao.getUser(34L);
        System.out.println("删除成功");
    }

}
