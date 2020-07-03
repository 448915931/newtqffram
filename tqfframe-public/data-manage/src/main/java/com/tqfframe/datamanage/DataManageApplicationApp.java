package com.tqfframe.datamanage;

import com.tqfframe.common.annotation.EnableFirstStarter;
import com.tqfframe.common.config.fistStarter.FristAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

/**
 * @Author: 唐祺峰
 * @Date: 2020/7/2 0002 11:51
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFirstStarter   //自己写的第一个starter
public class DataManageApplicationApp {
    public static void main(String[] args){
        SpringApplication.run(DataManageApplicationApp.class,args);
    }
}
