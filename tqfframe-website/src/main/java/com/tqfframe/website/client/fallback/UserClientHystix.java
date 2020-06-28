package com.tqfframe.website.client.fallback;

import com.tqfframe.website.client.UserClient;
import org.springframework.stereotype.Component;

/**
 * Created by Tang-QiFeng on 2020/6/28
 */
@Component
public class UserClientHystix implements UserClient {

    @Override
    public String testhystrix(String userid) {
        return "网络异常！";
    }

}
