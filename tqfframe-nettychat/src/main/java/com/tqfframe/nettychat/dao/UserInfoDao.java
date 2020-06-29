package com.tqfframe.nettychat.dao;


import com.tqfframe.nettychat.model.po.UserInfo;

public interface UserInfoDao {

    void loadUserInfo();
    
    UserInfo getByUsername(String username);
    
    UserInfo getByUserId(String userId);
}
