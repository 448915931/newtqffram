package com.tqfframe.website.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Tang-QiFeng on 2020/6/24
 */
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     *  本地
     *  http://localhost:8080/api/webiste/test/testhystrix/11111
     *  http://localhost:9091/test/testhystrix/11111
     *
     *  docker
     *  http://192.168.47.135:8080/api/webiste/test/testhystrix/11111
     *  http://192.168.47.135:9001/test/testhystrix/11111
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/testhystrix/{name}")
    public String testhystrix(@PathVariable(name = "name") String name){
        System.out.println(name);
        return name;
    }
}
