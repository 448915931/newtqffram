package com.tqfframe.nettychat.service.impl;

import com.tqfframe.nettychat.dao.UserInfoDao;
import com.tqfframe.nettychat.model.po.UserInfo;
import com.tqfframe.nettychat.model.vo.ResponseJson;
import com.tqfframe.nettychat.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;
    
    @Override
    public ResponseJson getByUserId(String userId) {
        UserInfo userInfo = userInfoDao.getByUserId(userId);
        return new ResponseJson().success()
                .setData("userInfo", userInfo);
    }

}
