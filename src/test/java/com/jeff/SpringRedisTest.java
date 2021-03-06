package com.jeff;
/**
 * @author Youpeng.Zhang on 2018/8/7.
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-redis.xml" })
@WebAppConfiguration
public class SpringRedisTest {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void testFirst() {

        redisTemplate.convertAndSend("topic.channel", "hello world!2222");
        // set username wlwlwlwl015
        redisTemplate.opsForValue().set("username", "wlwlwlwl015");
//        // get username
        System.out.println(redisTemplate.opsForValue().get("username"));
    }

}