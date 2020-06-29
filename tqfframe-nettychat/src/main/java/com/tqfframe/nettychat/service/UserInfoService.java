package com.tqfframe.nettychat.service;

import com.tqfframe.nettychat.model.vo.ResponseJson;

public interface UserInfoService {

    ResponseJson getByUserId(String userId);
}
