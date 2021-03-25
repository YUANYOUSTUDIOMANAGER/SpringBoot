package com.oo.springboot02.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/25 01:17
 * @Description :com.oo.springboot01.entity
 * @version: 1.0
 */

@Data
@Entity
public class User {

    @Id
    private int id; //
    private String u_name; //
    private String u_pwd; //
    private String u_email; //
    private int u_pid; //

}
