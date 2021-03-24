package com.oo.springboot01.controller;

import com.oo.springboot01.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/25 01:29
 * @Description :com.oo.springboot01.controller
 * @version: 1.0
 */

@RestController
@RequestMapping("/user")
public class UserController {

    static Map<String, User> users = Collections.synchronizedMap(new HashMap<String, User>());

    @RequestMapping("/uu")
    public String uu(){
        return "RESTful";
    }

    /**
     * get
     * @return
     */
   @GetMapping("/")
   public List<User> getUserList(){
       List<User> list = new ArrayList<User>(users.values());
       return list;
   }

   @PostMapping("/")
    public String postUser(@RequestBody User user){
       users.put(user.getU_name(),user);
       return "success";
    }

    @GetMapping("/{u_name}")
    public User getUser(@PathVariable int u_name){
        return users.get(u_name);
    }

    @PutMapping("/{u_name}")
    public String putUser(@PathVariable String u_name,@RequestBody User user){
        User u = users.get(u_name);
        u.setU_eamil(user.getU_eamil());
        users.put(u_name,u);
        return "success";
    }

    @DeleteMapping("/{u_name}")
    public String deleteUser(@PathVariable String u_name){
        users.remove(u_name);
        return "success";
    }

}
