package com.tqfframe.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Tang-QiFeng on 2020/6/24
 */
@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
public class GatewayServerApplication {
    public static void main( String[] args )
    {
        System.out.println("3333");
        System.out.println("1111111111");
        System.out.println("2222");
        SpringApplication.run(GatewayServerApplication.class, args);
    }
}
