package com.tqfframe.test;

/**
 * Created by Tang-QiFeng on 2020/6/28
 */

import com.tqfframe.website.WebApplicationApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = WebApplicationApp.class)
@RunWith(SpringRunner.class)
public class TestSql {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public  void run() {
        List list=new ArrayList();
        String sql="select * from  tqf_user";
        list =jdbcTemplate.queryForList(sql);
        System.out.println(list);
    }
}
