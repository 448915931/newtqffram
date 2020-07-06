package com.tqfframe.website.web.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tqfframe.website.web.vo.TestDTO;
import com.tqfframe.website.web.entry.TestEntity;

/**
 * Created by Tang-QiFeng on 2020/6/30
 */
public interface TestService extends IService<TestEntity> {
    IPage<TestDTO> getPageByName(Page page, String name);
}