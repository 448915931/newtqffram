package com.tqfframe.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class UserApplicationApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserApplicationApp.class, args);
    }
}
