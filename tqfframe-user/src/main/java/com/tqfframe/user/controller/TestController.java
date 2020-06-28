package com.tqfframe.user.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Tang-QiFeng on 2020/6/24
 */
@RestController
@RequestMapping("/test")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     *  本地
     *  http://localhost:8080/api/webiste/test/testhystrix/11111
     *  http://localhost:9000/test/testhystrix/11111
     *
     *  docker
     *  http://192.168.47.135:8080/api/webiste/test/testhystrix/11111
     *  http://192.168.47.135:9000/test/testhystrix/11111
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/testhystrix/{name}")
    public String testhystrix(@PathVariable(name = "name") String name){
        logger.info(name);
        logger.debug(name);
        logger.error(name);
        return name;
    }
}
