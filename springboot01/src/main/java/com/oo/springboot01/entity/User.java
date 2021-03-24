package com.oo.springboot01.entity;

import javafx.print.PrintSides;
import lombok.Data;

import java.io.PushbackInputStream;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/25 01:17
 * @Description :com.oo.springboot01.entity
 * @version: 1.0
 */

@Data
public class User {

    private int u_id; //
    private String u_name; //
    private String u_pwd; //
    private String u_eamil; //
    private int u_pid; //

}
