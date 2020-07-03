package com.tqfframe.common.config.fistStarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: 唐祺峰
 * @Date: 2020/7/3 0003 9:18
 * @Version 1.0
 */
@Data
@ConfigurationProperties(prefix = "tqf-plus")
public class FristProperties {
    private String testdata;
    private String testdata1;
    private String testdata2;
}
