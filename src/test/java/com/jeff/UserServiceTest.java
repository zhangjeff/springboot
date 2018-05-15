package com.jeff;

import com.jeff.boot.entity.User;
import com.jeff.boot.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by zhangying on 2018/2/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testJuint(){
        System.out.println("zhangyoupeng");
    }

    @Test
    public void testUserService(){
        User user = new User();
        user.setUid(23455);
        user.setBirth(new Date());
        user.setUname("zhangyuheng");
        userService.insert(user);
    }

    @Test
    public void testUserServiceById(){
       User user = userService.getUserById("444");
        System.out.println(user);
    }
}
