package com.tqfframe.website.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Tang-QiFeng on 2020/6/24
 */
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     *  http://localhost:8080/api/webiste/test/testhystrix/11111
     *  http://localhost:9091/test/testhystrix/11111
     * @param name
     * @return
     */
    @GetMapping(value = "/testhystrix/{name}")
    public String testhystrix(@PathVariable(name = "name") String name){
        return name;
    }
}
