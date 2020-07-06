package com.tqfframe.website.web.service.Impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tqfframe.website.web.vo.TestDTO;
import com.tqfframe.website.web.dao.TestMapper;
import com.tqfframe.website.web.entry.TestEntity;
import com.tqfframe.website.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tang-QiFeng on 2020/6/30
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, TestEntity> implements TestService {
    @Autowired
    private TestMapper testMapper;

    public IPage<TestDTO> getPageByName(Page page, String name) {
        return testMapper.getPageByName(page, name);
    }
}