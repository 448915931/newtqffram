package com.tqfframe.nettychat.dao;


import com.tqfframe.nettychat.model.po.GroupInfo;

public interface GroupInfoDao {

    void loadGroupInfo();
    
    GroupInfo getByGroupId(String groupId);
}
