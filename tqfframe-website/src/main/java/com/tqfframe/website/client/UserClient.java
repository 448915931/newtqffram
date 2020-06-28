package com.tqfframe.website.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Tang-QiFeng on 2020/6/28
 */
@FeignClient(name = "tqfframe-user")
public interface UserClient {

    //如果服务A的配置文件中有server.servlet.context-path: /web_app
    //那么value ="/web_app/userClick"，否则会报404
    @GetMapping(value = "/userClick/{userid}")
    String testhystrix(@PathVariable(name = "userid") String userid);

}
