package com.tqfframe.app.controller;
import com.tqfframe.app.client.UserClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Tang-QiFeng on 2020/6/24
 */
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserClient userClient;

    @Value(value = "${tang}")
    private String tang;

    /**
     *  本地
     *  http://localhost:8080/api/app/testhystrix/11111
     *  http://localhost:9007/testhystrix/11111
     *
     *  docker
     *  http://192.168.47.135:8080/api/app/testhystrix/11111
     *  http://192.168.47.135:9007/testhystrix/11111
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/testhystrix/{name}")
    public String testhystrix(@PathVariable(name = "name") String name){
        logger.info(name);
        logger.debug(name);
        logger.error(name);
        logger.info(tang);
        //调用user服务接口
        return  userClient.testhystrix(name);
    }
}
