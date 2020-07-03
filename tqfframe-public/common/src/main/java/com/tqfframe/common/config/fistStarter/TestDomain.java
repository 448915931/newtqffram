package com.tqfframe.common.config.fistStarter;

/**
 * @Author: 唐祺峰
 * @Date: 2020/7/3 0003 9:56
 * @Version 1.0
 */
public class TestDomain {
    private String test1;
    private String test2;

    public TestDomain(String test1, String test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    public String getValue(){
        return test1;
    }
    public String getValue2(){
        return test2;
    }
}
