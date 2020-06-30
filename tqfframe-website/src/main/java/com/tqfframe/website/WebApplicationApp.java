package com.tqfframe.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableCircuitBreaker //Hystrix仪表盘 服务熔断（ribbon 单服务实例监控）
public class WebApplicationApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(WebApplicationApp.class, args);
    }
}
