package com.tqfframe.datamanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: 唐祺峰
 * @Date: 2020/7/2 0002 11:51
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class DataManageApplicationApp {
    public static void main(String[] args){
        SpringApplication.run(DataManageApplicationApp.class,args);
    }
}
