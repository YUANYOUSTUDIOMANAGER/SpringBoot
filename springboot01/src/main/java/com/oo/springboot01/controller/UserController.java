//package com.oo.springboot01.controller;
//
//import com.oo.springboot01.entity.User;
//import com.oo.springboot01.moudle.schedule;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
///**
// * @Auther: YUANYOUSTUDIO
// * @Date: 2021/3/25 01:29
// * @Description :com.oo.springboot01.controller
// * @version: 1.0
// */
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    /**
//     * get
//     * @return
//     */
//   @GetMapping("/")
//   public List<User> getUserList(){
//       List<User> list = new ArrayList<User>(users.values());
//       return list;
//   }
//
//    /**
//     * post
//     * @param user
//     * @return
//     */
//   @PostMapping("/")
//    public String postUser(@RequestBody User user){
//       users.add(user);
//       return "success";
//    }
//
//    /**
//     * delete
//     * @param u_name
//     * @return
//     */
//    @DeleteMapping("/{u_name}")
//    public String deleteUser(@PathVariable String u_name){
//        users.delete(u_name);
//        return "success";
//    }
//
//    /**
//     * put
//     * @param u_name
//     * @param user
//     * @return
//     */
//    @PutMapping("/{u_name}")
//    public String putUser(@PathVariable String u_name,@RequestBody User user){
//        User u = users.get(u_name);
//        u.setU_email(user.getU_email());
//        users.update(u_name,u);
//        return "success";
//    }
//
//    /**
//     * get
//     * @param u_name
//     * @return
//     */
//    @GetMapping("/{u_name}")
//    public User getUser(@PathVariable int u_name){
//        return users.getUser(u_name);
//    }
//
//    /**
//     * get List
//     * @param u_name
//     * @return
//     */
//    @GetMapping("/{u_name}")
//    public List<User> getUserList(@PathVariable int u_name){
//        return users.getUserList(u_name);
//    }
//
//}
//
