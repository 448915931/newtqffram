package com.tqfframe.website.client;

import com.tqfframe.website.client.fallback.UserClientHystix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Tang-QiFeng on 2020/6/28
 */
@FeignClient(name = "tqfframe-user" ,fallback = UserClientHystix.class)
public interface UserClient {

    //如果服务A的配置文件中有server.servlet.context-path: /web_app
    //那么value ="/web_app/userClick"，否则会报404
    @GetMapping(value = "/userClick/{userid}")
    String testhystrix(@PathVariable(name = "userid") String userid);

}
