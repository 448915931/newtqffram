package com.tqfframe.app;

/**
 * Created by Tang-QiFeng on 2020/6/30
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableCircuitBreaker //Hystrix仪表盘 服务熔断（ribbon 单服务实例监控）
public class AppApplicationApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(AppApplicationApp.class, args);
    }

}


