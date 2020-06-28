package com.tqfframe.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
//@EnableFeignClients
@SpringBootApplication
public class WebApplicationApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(WebApplicationApp.class, args);
    }
}
