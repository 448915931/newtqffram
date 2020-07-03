package com.tqfframe.common.config.fistStarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: 唐祺峰
 * @Date: 2020/7/3 0003 9:18
 * @Version 1.0
 */
@ConfigurationProperties(prefix = "tqf-plus")
public class FristProperties {
    private String testdata;
    private String testdata1;
    private String testdata2;

    public String getTestdata() {
        return testdata;
    }

    public void setTestdata(String testdata) {
        this.testdata = testdata;
    }

    public String getTestdata1() {
        return testdata1;
    }

    public void setTestdata1(String testdata1) {
        this.testdata1 = testdata1;
    }

    public String getTestdata2() {
        return testdata2;
    }

    public void setTestdata2(String testdata2) {
        this.testdata2 = testdata2;
    }
}
