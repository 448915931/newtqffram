package com.tqfframe.datamanage.controller;

import com.tqfframe.common.config.fistStarter.TestDomain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 唐祺峰
 * @Date: 2020/7/2 0002 13:37
 * @Version 1.0
 */
@RestController
public class stormTestController {

    Logger logger = LoggerFactory.getLogger(stormTestController.class);

    @Autowired
    private TestDomain testDomain;

    /**
     *  本地
     *  http://localhost:9009/test/11111
     *
     *  docker
     *  http://192.168.47.135:9009/test/11111
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/test/{name}")
    public String test(@PathVariable(name = "name") String name){
        System.out.println(testDomain.getValue());
        System.out.println(testDomain.getValue2());
        logger.info(name);
        logger.debug(name);
        logger.error(name);
        return  "111";
    }
}
