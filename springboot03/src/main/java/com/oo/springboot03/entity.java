package com.oo.springboot03;

import lombok.Data;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/26 16:07
 * @Description :com.oo.springboot03
 * @version: 1.0
 */
public class entity {
    /**
     * @Auther: YUANYOUSTUDIO
     * @Date: 2021/3/26 02:36
     * @Description :com.oo.springboot03.entity
     * @version: 1.0
     */
    @Data
    public static class User {

        private int u_id; //
        private String u_name; //
        private String u_pwd; //
        private String u_email; //
        private int u_pid; //

    }
}
