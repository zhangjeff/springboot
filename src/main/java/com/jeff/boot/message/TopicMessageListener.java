package com.jeff.boot.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Youpeng.Zhang on 2018/8/9.
 */
@Service
public class TopicMessageListener implements MessageListener {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    @Override
    public void onMessage(Message message, byte[] bytes) {
        byte[] body = message.getBody();//请使用valueSerializer
        byte[] channel = message.getChannel();
        //请参考配置文件，本例中key，value的序列化方式均为string。
        //其中key必须为stringSerializer。和redisTemplate.convertAndSend对应
        String itemValue = (String)redisTemplate.getValueSerializer().deserialize(body);
        String topic = (String)redisTemplate.getStringSerializer().deserialize(channel);

        System.out.println("TopicMessageListener onMessage itemValue=" + itemValue);
        System.out.println("TopicMessageListener onMessage topic=" + topic);

    }
}
