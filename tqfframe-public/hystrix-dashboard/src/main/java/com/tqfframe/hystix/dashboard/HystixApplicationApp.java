package com.tqfframe.hystix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by Tang-QiFeng on 2020/6/30
 */
@SpringBootApplication
@EnableHystrixDashboard //开启仪表盘监控注解
public class HystixApplicationApp {
    public static void main(String[] args){
        SpringApplication.run(HystixApplicationApp.class,args);
    }
}
