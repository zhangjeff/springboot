//package com.jeff.boot.controller;
//
//import com.github.pagehelper.PageHelper;
//import com.jeff.boot.entity.User;
//import com.jeff.boot.service.IUserService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Date;
//import java.util.List;
//
///**
// *
// * @author jeff
// * @date 2017-02-25 09:20
// * @since 1.8
// * @version 1.0.0
// */
//@RestController
//@RequestMapping("user")
//@Slf4j
//public class UserController {
//
//
//    @Autowired
//    private IUserService userService;
//
//    /**
//     * 添加用户
//     * @param user
//     * @return
//     */
//    @PostMapping(value = "add")
//    public String insert(User user){
//        // user.setBirth(new Date());
////        log.info("请求参数:{}",user);
//        user.setUid(122);
//        user.setUname("jeff zhang");
//        user.setBirth(new Date());
//        String result = userService.insert(user);
//        return result;
//    }
//
//    /**
//     * 获取用户列表
//     * @param start
//     * @param size
//     * @return
//     */
//    @GetMapping(value = "list/{start}/{size}")
//    public List<User> getUserList(@PathVariable("start")int start,@PathVariable("size")int size){
//       PageHelper.startPage(start,size);
//       List<User> list= userService.getList();
//       return list;
//    }
//}
