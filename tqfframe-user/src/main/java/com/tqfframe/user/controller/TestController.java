package com.tqfframe.user.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Tang-QiFeng on 2020/6/24
 */
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     *  本地
     *  http://localhost:8080/api/user/userClick/11111
     *  http://localhost:9000/userClick/11111
     *
     *  docker
     *  http://192.168.47.135:8080/api/user/userClick/11111
     *  http://192.168.47.135:9000/userClick/11111
     *
     *     模拟用户点击+1
     *
     * @param userid
     * @return
     */
    @GetMapping(value = "/userClick/{userid}")
    public String testhystrix(@PathVariable(name = "userid") String userid){
        logger.info("我是用户，我通过其他微服务进行点击+1了");
        return userid;
    }
}
