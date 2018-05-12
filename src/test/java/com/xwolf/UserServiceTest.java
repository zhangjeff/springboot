package com.xwolf;

import com.xwolf.boot.entity.User;
import com.xwolf.boot.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
        userService.insert(user);
    }
}
