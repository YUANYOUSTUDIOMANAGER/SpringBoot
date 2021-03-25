package com.oo.springboot01.moudle;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: YUANYOUSTUDIO
 * @Date: 2021/3/25 03:03
 * @Description :com.oo.springboot01
 * @version: 1.0
 */

@SpringBootApplication
@EnableScheduling
@Component
public class schedule {
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    public static void main(String[] args) {
        reportCurrentTime();
    }

    @Scheduled(fixedRate = 6000)
    public static void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }

}
