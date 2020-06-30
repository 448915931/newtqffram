package com.tqfframe.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker //Hystrix仪表盘 服务熔断（ribbon 单服务实例监控）
public class UserApplicationApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserApplicationApp.class, args);
    }
}
