package com.tqfframe.nettychat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Tang-QiFeng on 2020/6/29
 */
@SpringBootApplication
@EnableEurekaClient
public class NettyChatApplicationApp {
    public static void main(String [] args){
        SpringApplication.run(NettyChatApplicationApp.class,args);
    }
}
