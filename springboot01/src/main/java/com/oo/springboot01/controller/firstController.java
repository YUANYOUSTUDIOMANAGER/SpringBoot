package com.oo.springboot01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/24 21:51
 * @Description :com.oo.springboot01.controller
 * @version: 1.0
 */

@RestController
public class firstController {

    @RequestMapping("/")
    public String first(){
        return "Hello SpringBoot";
    }

}