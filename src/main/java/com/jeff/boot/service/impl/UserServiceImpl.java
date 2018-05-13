package com.jeff.boot.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jeff.boot.dao.IUserDao;
import com.jeff.boot.entity.User;
import com.jeff.boot.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户Service
 * @author jeff
 * @date 2017-02-25 09:17
 * @since V1.0.0
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    /**
     * 新增用户
     * @param user 用户信息
     * @return
     */
    @Override
    public String insert(User user) {
        int resultInt=userDao.insert(user);
        JSONObject result = new JSONObject();
        if(resultInt>0){
             result.put("success",true);
             result.put("msg","成功");
        }else{
            result.put("success",false);
            result.put("msg","失败");
        }
        return result.toJSONString();
    }

    /**
     * 获取用户列表
     * @return
     */
    @Override
    public List<User> getList() {
        return userDao.queryList();
    }
}
