//package com.jeff.boot.controller;
//
//import com.google.common.collect.Maps;
//import com.jeff.boot.entity.User;
//import com.jeff.boot.service.IUserService;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiImplicitParams;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
///**
// * Swagger API测试Controller,无明确时限,以Map代替CRUD
// * @author jeff
// * @date 2017-02-26 20:15
// * @since 1.8
// * @version 1.0.0
// */
//@RestController
//@RequestMapping(value="/api")
//public class ApiController {
//
//    @Autowired
//    private IUserService userService;
//
//    private static Map<Integer, User> users = Maps.newConcurrentMap();
//
//    @ApiOperation(value="获取用户列表", notes="")
//    @GetMapping(value={"/list"})
//    public List<User> getUserList() {
//        List<User> r = userService.getList();
////        List<User> r = new ArrayList<User>(users.values());
////
////        User user = new User();
////        user.setUname("zyp");
////        user.setUid(112);
////        String strDate = "2008-10-19 10:10:10" ;
////        String pat1 = "yyyy-MM-dd HH:mm:ss" ;
////        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1) ;        // 实例化模板对象
////        try{
////            user.setBirth(sdf1.parse(strDate));
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////
////        User user2 = new User();
////        user2.setUname("zyp221");
////        user2.setUid(123);
////        user2.setBirth(new Date());
////
////        r.add(user);
////        r.add(user2);
//        return r;
//    }
//
//    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
//    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
//    @PostMapping(value="/add")
//    public String postUser(@RequestBody User user) {
////        users.put(user.getUid(), user);
//        return userService.insert(user);
////        return "success";
//    }
//
//
////    @ApiIgnore
////    @RequestMapping(value = "/advertise-manually-listadd")
////    public String advertisemanuallylistadd(Model model,
////                                           @RequestParam(value = "market_id", required = false, defaultValue = "0") String market_id,
////                                           @RequestParam(value = "building_id", required = false, defaultValue = "0") String building_id,
////                                           @RequestParam(value = "floor_id", required = false, defaultValue = "0") String floor_id,
////                                           @RequestParam(value = "advHeight", required = false, defaultValue = "") String advHeight,
////                                           @RequestParam(value = "advLen", required = false, defaultValue = "") String advLen,
////                                           HttpServletRequest request)
//
//    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
//    @RequestMapping(value="/getUserById", method= RequestMethod.GET)
//    public User getUser(@RequestParam String id) {
//        return userService.getUserById(id);
//    }
//
//
//    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer"),
//            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
//    })
////    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
////    public String putUser(@PathVariable Integer id, @RequestBody User user) {
////        User u = users.get(id);
////        u.setUname(user.getUname());
////        users.put(id, u);
////        return "success";
////    }
//
//    /**
//     * 删除用户
//     * @param id 用户ID
//     * @return
//     */
////    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
//    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
//    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
//    public String deleteUser(@PathVariable Integer id) {
//        users.remove(id);
//        return "success";
//    }
//}
