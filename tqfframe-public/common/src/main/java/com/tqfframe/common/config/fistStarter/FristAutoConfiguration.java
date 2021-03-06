package com.tqfframe.common.config.fistStarter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 唐祺峰
 * @Date: 2020/7/3 0003 9:16
 * @Version 1.0
 */
@Configuration
@EnableConfigurationProperties({FristProperties.class})
public class FristAutoConfiguration {

    @Bean
    public TestDomain testDomain(FristProperties fristProperties){
        return new TestDomain( fristProperties.getTestdata(), fristProperties.getTestdata1());
    }

}
