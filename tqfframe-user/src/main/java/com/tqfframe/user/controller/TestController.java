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
    public String userClick(@PathVariable(name = "userid") String userid){
        System.out.println(userid);
        logger.info("我是用户，我通过其他微服务进行点击+1了");
        return userid;
    }

    /**
     *  本地
     *  http://localhost:8080/api/user/userClickTimeOut/11111
     *  http://localhost:9000/userClickTimeOut/11111
     *
     *  docker
     *  http://192.168.47.135:8080/api/user/userClickTimeOut/11111
     *  http://192.168.47.135:9000/userClickTimeOut/11111
     *
     *     模拟用户点击+1
     *
     * @param userid
     * @return
     */
    @GetMapping(value = "/userClickTimeOut/{userid}")
    public String userClickTimeOut(@PathVariable(name = "userid") String userid){
        logger.info("故意设置5000秒进行熔断降级操作，相当于这个方法执行了超过5秒，默认的feign调用时间不超过1秒。不然就直接进熔断了！！！");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("我是用户，我通过其他微服务进行点击+1了");
        return userid;
    }
}
