package com.tqfframe.website.web.entry;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by Tang-QiFeng on 2020/6/30
 */
@Data
@TableName("tqf_user")
public class TestEntity {
    @TableId
    private Integer id;
    private String username;
    private String password;
    private Integer sex;
}
